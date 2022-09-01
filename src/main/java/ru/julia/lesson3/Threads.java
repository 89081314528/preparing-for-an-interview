package ru.julia.lesson3;

/**
 * Создать два потока, которые пишут ping и pong
 */
public class Threads {
    private final Object mon = new Object();
    private volatile String currentString = "ping";

    public static void main(String[] args) {
        Threads threads = new Threads();
        Thread thread1 = new Thread(() -> {
            threads.printPing();
        });
        Thread thread2 = new Thread(() -> {
            threads.printPong();
        });
        thread1.start();
        thread2.start();
    }

    public void printPing() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (!currentString.equals("ping")) {
                        mon.wait();
                    }
                    System.out.print("ping");
                    currentString = "pong";
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printPong() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (!currentString.equals("pong")) {
                        mon.wait();
                    }
                    System.out.print("pong");
                    currentString = "ping";
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

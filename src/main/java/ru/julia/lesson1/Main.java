package ru.julia.lesson1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder().addFirstName("Julia").build();
        System.out.println(person);
    }
}

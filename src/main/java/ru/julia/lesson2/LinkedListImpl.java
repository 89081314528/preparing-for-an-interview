package ru.julia.lesson2;

public class LinkedListImpl implements LinkedList{
    Node head;
    int size;
    Node tail;

    public int size() {
        return size;
    }

    public boolean add(String item) {
        Node newNode = new Node();
        newNode.setItem(item);
        if (tail == null) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
        size++;
        return true;
    }

    public String get(int index) {
        if (checkIndex(index)) {
            Node currentNode = getNode(index);
            return currentNode.getItem();
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    private Node getNode(int index) {
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    private boolean checkIndex(int index) {
        return index >= 0 && index < size;
    }

    public String remove(int index) {
        if (checkIndex(index)) {
            Node deleteNode;
            if (index == 0) {
                deleteNode = head;
                head = head.getNext();
                if(head == null) {
                    tail = null;
                }
            } else {
                Node prevNode = getNode(index - 1);
                deleteNode = prevNode.getNext();
                Node nextNode = deleteNode.getNext();
                prevNode.setNext(nextNode);
                if(nextNode == null) {
                    tail = prevNode;
                }
            }
            size--;
            return deleteNode.getItem();

        } else {
            throw new IndexOutOfBoundsException();
        }
    }
}

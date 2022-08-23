package ru.julia.lesson2;

public interface MyArrayList {
    int add(int item);
    int add(int index, int item);
    int set(int index, int item);
    int remove(int item);
    int removeByIndex(int index);
    boolean contains(int item);
    int indexOf(int item);
    int lastIndexOf(int item);
    int get(int index);
    boolean equals(MyArrayListImpl otherList);
    int size();
    boolean isEmpty();
    void clear();
    int[] toArray();
    int[] getArray();
}

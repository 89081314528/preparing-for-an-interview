package ru.julia;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder().addFirstName("Julia").build();
        System.out.println(person);
    }
}

package ru.julia;

public class Circle implements Figure{
    @Override
    public String square() {
        return "S=πR²";
    }

    @Override
    public String perimeter() {
        return "P=2πR";
    }
}

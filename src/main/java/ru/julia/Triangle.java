package ru.julia;

public class Triangle implements Figure{

    @Override
    public String square() {
        return "S=½bh";
    }

    @Override
    public String perimeter() {
        return "P=a+b+c";
    }
}

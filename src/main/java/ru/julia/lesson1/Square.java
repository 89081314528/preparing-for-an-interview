package ru.julia.lesson1;

import ru.julia.lesson1.Figure;

public class Square implements Figure {
    @Override
    public String square() {
        return "S=a²";
    }

    @Override
    public String perimeter() {
        return "P=4a";
    }
}

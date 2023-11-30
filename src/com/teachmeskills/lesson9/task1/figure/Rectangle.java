package com.teachmeskills.lesson9.task1.figure;


public final class Rectangle extends Figure {

    public int length;
    public int width;

    public Rectangle(String name, int length, int width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    public double Square (){
        return length * width;
    }

    public double Perimeter (){
        return length + width;
    }

}

package com.teachmeskills.lesson9.task1.figure;

public final class Circle extends Figure {

    public int radius;

    public Circle(String name ,int radius) {
        super(name);
        this.radius = radius;
    }

    public double Square (){
        return Math.PI * radius * radius;
    }

    public double Perimeter(){
        return 2 * Math.PI * radius;
    }

}

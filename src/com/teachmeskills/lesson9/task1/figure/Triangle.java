package com.teachmeskills.lesson9.task1.figure;


public final class Triangle extends Figure {

    public int side1;
    public int side2;
    public int side3;

    public Triangle(String name, int side1, int side2, int side3) {
        super(name);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double Square (){
        double p2 = (side1 + side2 + side3) / 2.0;
        return Math.sqrt(p2 * (p2 - side1) * (p2 - side2) * (p2 - side3));
    }

    public double Perimeter(){
        return side1 + side2 + side3;
    }

}

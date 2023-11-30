package com.teachmeskills.lesson9.task1.figure;

public abstract sealed class Figure permits Circle, Rectangle, Triangle {

    public String name;

    public Figure(String name){
        this.name = name;
    }
    public abstract double Square();

    public abstract double Perimeter();

}

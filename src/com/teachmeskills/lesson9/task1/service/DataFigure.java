package com.teachmeskills.lesson9.task1.service;

import com.teachmeskills.lesson9.task1.figure.Circle;
import com.teachmeskills.lesson9.task1.figure.Figure;
import com.teachmeskills.lesson9.task1.figure.Rectangle;
import com.teachmeskills.lesson9.task1.figure.Triangle;

public class DataFigure {

    public void Data() {

        Figure[] squareAndPerimeters = new Figure[5];
        squareAndPerimeters[0] = new Circle("Circle", 1);
        squareAndPerimeters[1] = new Rectangle("Rectangle", 2, 4);
        squareAndPerimeters[2] = new Circle("Circle" ,4);
        squareAndPerimeters[3] = new Rectangle("Rectangle", 4, 6);
        squareAndPerimeters[4] = new Triangle("Triangle",2, 4, 5);

        double sumPerimeter = 0;
        for (Figure squareAndPerimeter: squareAndPerimeters) {
            System.out.println(squareAndPerimeter.name + " " + squareAndPerimeter.Square() + " " +squareAndPerimeter.Perimeter());
            sumPerimeter += squareAndPerimeter.Perimeter();
        }

        System.out.println("Sum of perimeter " + sumPerimeter);

    }

}

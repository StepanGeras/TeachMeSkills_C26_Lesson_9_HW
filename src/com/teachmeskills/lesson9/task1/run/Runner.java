package com.teachmeskills.lesson9.task1.run;


import com.teachmeskills.lesson9.task1.figure.Circle;
import com.teachmeskills.lesson9.task1.figure.Rectangle;
import com.teachmeskills.lesson9.task1.figure.Triangle;
import com.teachmeskills.lesson9.task1.figure.Figure;
import com.teachmeskills.lesson9.task1.service.DataFigure;

/**
 * Задача 1
 * Усовершенствовать задание с фигурами
 * Использовать модификатор Sealed для класса "Фигура".
 */

public class Runner {

    public static void main(String[] args) {

        DataFigure dataFigure = new DataFigure();
        dataFigure.Data();

    }

}

package com.teachmeskills.lesson9.task3.service;

public class Conversion {

    public static double ConversionCardRubleToDollar (double sum) {

        double dollar = 3.29;

        return sum / dollar;

    }

    public static double ConversionCardRubleToEuro (double sum) {

        double euro = 3.61;

        return sum / euro;

    }

    public static double ConversionCardEuroToDollar (double sum) {

        double money = 1.09;

        return sum / money;

    }

    public static double ConversionCardEuroToRuble (double sum) {

        double money = 0.28;

        return sum / money;

    }

    public static double ConversionCardDollarToEuro (double sum) {

        double money = 0.91;

        return sum / money;

    }

    public static double ConversionCardDollarToRuble (double sum) {

        double money = 0.3;

        return sum / money;

    }

}

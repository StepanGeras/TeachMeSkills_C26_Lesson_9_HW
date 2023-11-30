package com.teachmeskills.lesson9.task3.service;

public class Commission {

    public static double CommissionBelCard (double sum) {

        double commission = 0.015;

        return commission * sum;

    }

    public static double CommissionVisaCard (double sum) {

        double commission = 0.02;

        return commission * sum;

    }

    public static double CommissionMasterCard (double sum) {

        double commission = 0.025;

        return commission * sum;

    }

}

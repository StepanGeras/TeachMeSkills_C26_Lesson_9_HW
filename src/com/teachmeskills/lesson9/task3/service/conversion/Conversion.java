package com.teachmeskills.lesson9.task3.service.conversion;

import com.teachmeskills.lesson9.task3.model.card.BaseCard;

public class Conversion {

    public static double ConversionDollar (BaseCard cardFrom, double sum) {

        if (cardFrom.getDigitalCurrencyCode() == 933) {
            sum = sum / 3.30;
        } else if (cardFrom.getDigitalCurrencyCode() == 978) {
            sum = 0.92 * sum;
        }

        return sum;

    }

    public static double ConversionEuro (BaseCard cardFrom, double sum) {

        if (cardFrom.getDigitalCurrencyCode() == 933) {
            sum = sum / 3.59;
        } else if (cardFrom.getDigitalCurrencyCode() == 840) {
            sum =  1.09 * sum;
        }

        return sum;

    }

    public static double ConversionRuble (BaseCard cardFrom, double sum) {

        if (cardFrom.getDigitalCurrencyCode() == 840) {
            sum = sum * 3.3;
        } else if (cardFrom.getDigitalCurrencyCode() == 978) {
            sum = sum * 3.59;
        }

        return sum;

    }

}

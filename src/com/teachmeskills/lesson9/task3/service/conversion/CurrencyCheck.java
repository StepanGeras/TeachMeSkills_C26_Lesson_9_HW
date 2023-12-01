package com.teachmeskills.lesson9.task3.service.conversion;

import com.teachmeskills.lesson9.task3.model.card.BaseCard;

public class CurrencyCheck {

    public static double doCurrencyCheck (BaseCard cardTo, BaseCard cardFrom, double money) {

        if (cardTo.getDigitalCurrencyCode() == 933) {
            return Conversion.ConversionRuble(cardFrom, money);
        } else if (cardTo.getDigitalCurrencyCode() == 840) {
            return Conversion.ConversionDollar(cardFrom, money);
        } else if (cardTo.getDigitalCurrencyCode() == 978) {
            return Conversion.ConversionEuro(cardFrom, money);
        }

        return money;

    }

}
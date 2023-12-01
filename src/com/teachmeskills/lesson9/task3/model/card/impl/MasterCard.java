package com.teachmeskills.lesson9.task3.model.card.impl;

import com.teachmeskills.lesson9.task3.model.card.BaseCard;

public class MasterCard extends BaseCard {

    public MasterCard(String numberCard, double sum, long idCard, int cvc, int limit, double commission, int digitalCurrencyCode) {
        super(numberCard, sum, idCard, cvc, limit, commission, digitalCurrencyCode);
    }

}
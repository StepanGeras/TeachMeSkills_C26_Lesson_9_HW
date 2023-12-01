package com.teachmeskills.lesson9.task3.service.commission;

import com.teachmeskills.lesson9.task3.model.card.BaseCard;

public class Commission {

    public static double doCommission (BaseCard card, double money) {

        return card.getCommission() * money;

    }

}
package com.teachmeskills.lesson9.task3.service.moneyCheck;

import com.teachmeskills.lesson9.task3.model.card.BaseCard;
import com.teachmeskills.lesson9.task3.service.commission.Commission;


public class MoneyCheck {

    public static boolean doMoneyCheck (BaseCard card, int money) {

        return card.getSum() < money + Commission.doCommission(card, money);

    }

}
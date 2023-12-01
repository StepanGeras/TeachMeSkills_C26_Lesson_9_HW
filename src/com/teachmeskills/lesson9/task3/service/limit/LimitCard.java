package com.teachmeskills.lesson9.task3.service.limit;

import com.teachmeskills.lesson9.task3.model.card.BaseCard;
import com.teachmeskills.lesson9.task3.service.cardTransfer.CardTransfer;

public class LimitCard {

    public static boolean LimitCheck (BaseCard cardFrom, int sum) {

        return cardFrom.getLimit() <= sum;

    }

}
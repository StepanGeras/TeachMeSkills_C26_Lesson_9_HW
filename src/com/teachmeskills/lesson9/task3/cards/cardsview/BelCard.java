package com.teachmeskills.lesson9.task3.cards.cardsview;

import com.teachmeskills.lesson9.task3.cards.CardsDetails;

public class BelCard extends CardsDetails {

    public BelCard() {

        setNumberCard(12345);
        setIdCard(5432);
        setCvcAndCvv(123);
        setSum(1000.67);

    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public double getSum() {
        return sum;
    }

    public void setNumberCard(long numberCard) {
        this.numberCard = numberCard;
    }

    public void setCvcAndCvv(int cvcAndCvv) {
        this.cvcAndCvv = cvcAndCvv;
    }

    public void setIdCard(long idCard) {
        this.idCard = idCard;
    }

    public long getNumberCard() {
        return numberCard;
    }

    public int getCvcAndCvv() {
        return cvcAndCvv;
    }

    public long getIdCard() {
        return idCard;
    }

}

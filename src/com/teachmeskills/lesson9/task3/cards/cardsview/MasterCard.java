package com.teachmeskills.lesson9.task3.cards.cardsview;

import com.teachmeskills.lesson9.task3.cards.CardsDetails;

public class MasterCard extends CardsDetails {

    public MasterCard () {

        setNumberCard(13579);
        setIdCard(9753);
        setCvcAndCvv(135);
        setSum(500);

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

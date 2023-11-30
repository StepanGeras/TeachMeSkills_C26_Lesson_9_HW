package com.teachmeskills.lesson9.task3.cards.cardsview;

import com.teachmeskills.lesson9.task3.cards.CardsDetails;

public class VisaCard extends CardsDetails {

    public VisaCard () {

        setNumberCard(24680);
        setIdCard(8642);
        setCvcAndCvv(246);
        setSum(400);

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

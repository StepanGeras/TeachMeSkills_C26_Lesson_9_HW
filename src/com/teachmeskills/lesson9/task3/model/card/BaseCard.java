package com.teachmeskills.lesson9.task3.model.card;

public abstract class BaseCard {

    private String numberCard;
    private double sum;
    private long idCard;
    private int cvc;
    private int limit;
    private double commission;
    private int digitalCurrencyCode;

    public BaseCard(String numberCard, double sum, long idCard, int cvc, int limit, double commission, int digitalCurrencyCode) {
        this.numberCard = numberCard;
        this.sum = sum;
        this.idCard = idCard;
        this.cvc = cvc;
        this.limit = limit;
        this.commission = commission;
        this.digitalCurrencyCode = digitalCurrencyCode;
    }

    public String getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(String numberCard) {
        this.numberCard = numberCard;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public long getIdCard() {
        return idCard;
    }

    public void setIdCard(long idCard) {
        this.idCard = idCard;
    }

    public int getCvc() {
        return cvc;
    }

    public void setCvc(int cvc) {
        this.cvc = cvc;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public int getDigitalCurrencyCode() {
        return digitalCurrencyCode;
    }

    public void setDigitalCurrencyCode(int digitalCurrencyCode) {
        this.digitalCurrencyCode = digitalCurrencyCode;
    }
}

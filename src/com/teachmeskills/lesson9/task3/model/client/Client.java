package com.teachmeskills.lesson9.task3.model.client;

import com.teachmeskills.lesson9.task3.model.address.Address;
import com.teachmeskills.lesson9.task3.model.card.BaseCard;

public class Client {

    private String name;
    private String numberPassport;
    private String surname;
    private String dateOfBirth;
    private Address address;
    private BaseCard[] baseCards;

    public Client(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberPassport() {
        return numberPassport;
    }

    public void setNumberPassport(String numberPassport) {
        this.numberPassport = numberPassport;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}
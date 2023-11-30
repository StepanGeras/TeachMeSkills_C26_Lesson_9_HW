package com.teachmeskills.lesson9.task3.client;

public class Client {

    private String name;
    private String surname;
    private String numberPassport;
    private String dateOfBirth;
    private String country;
    private String city;
    private String street;
    private String numberHouse;

    public Client() {
        setName("Alex");
        setSurname("Gofri");
        setNumberPassport("12345AB32244");
        setDateOfBirth("22.12.2000");
        setCountry("USA");
        setCity("New York City");
        setStreet("Wall Street");
        setNumberHouse("3B");
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getNumberPassport() {
        return numberPassport;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getNumberHouse() {
        return numberHouse;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setNumberPassport(String numberPassport) {
        this.numberPassport = numberPassport;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setNumberHouse(String numberHouse) {
        this.numberHouse = numberHouse;
    }
}
package com.globallogic.entity;

import java.time.LocalDate;

public class Guest {
    private String customerName;
    private LocalDate dob;
    private Country country;
    private Language language            ;
    private Hobby hobby;

    public Guest() {
    }

    public Guest(String customerName, LocalDate dob, Country country, Language language, Hobby hobby) {
        this.customerName = customerName;
        this.dob = dob;
        this.country = country;
        this.language = language;
        this.hobby = hobby;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Hobby getHobby() {
        return hobby;
    }

    public void setHobby(Hobby hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "customerName='" + customerName + '\'' +
                ", dob=" + dob +
                ", country=" + country +
                ", language=" + language +
                ", hobby=" + hobby +
                '}';
    }
}

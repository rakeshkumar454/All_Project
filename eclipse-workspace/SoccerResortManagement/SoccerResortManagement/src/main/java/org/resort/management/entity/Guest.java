package org.resort.management.entity;

import java.time.LocalDate;
import java.util.Date;

public class Guest {
    private String name;
    private LocalDate dateOfBirth;
    private Country country;
    private Language language;
    private Hobby hobby;

    public Guest(String name, LocalDate dateOfBirth, Country country, Language language, Hobby hobby) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.country = country;
        this.language = language;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", country=" + country +
                ", language=" + language +
                ", hobby=" + hobby +
                '}';
    }
}

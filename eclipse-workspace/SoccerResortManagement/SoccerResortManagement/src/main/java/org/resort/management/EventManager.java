package org.resort.management;

import org.resort.management.entity.Country;
import org.resort.management.entity.Guest;
import org.resort.management.entity.Hobby;
import org.resort.management.entity.Language;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EventManager {

    public List<Guest> guests = new ArrayList<>();

    public static void main(String[] args) {
        EventManager eventManager= new EventManager();
        eventManager.populateGuests();
        System.out.println("Filtering Guests of France");
        eventManager.filterGuestFrance();
        System.out.println("Filtering Guests of Spain");
        eventManager.filterGuestsSpain();
        System.out.println("Filtering Guests with AGE more than 70");
        eventManager.filterGuestsByAgeMoreThan70();
        System.out.println("Filtering Guests who speak Chinese and Hobby is Read");
        eventManager.filterGuestsByLanguageChinese();
    }

    public  void populateGuests() {
        guests.add(new Guest("John", LocalDate.now().minusYears(25), Country.USA
                    , Language.ENGLISH, Hobby.MUSIC));
        guests.add(new Guest("Bob", LocalDate.now().minusYears(21), Country.SPAIN
                , Language.SPANISH, Hobby.DANCE));
        guests.add(new Guest("Ben", LocalDate.now().minusYears(23), Country.CHINA
                , Language.CHINESE, Hobby.WATER_SPORTS));
        guests.add(new Guest("Alice", LocalDate.now().minusYears(75), Country.FRANCE
                , Language.FRENCH, Hobby.DRINK));
        guests.add(new Guest("Laurel", LocalDate.now().minusYears(23), Country.GERMANY
                , Language.GERMAN, Hobby.DRINK));

        guests.add(new Guest("Asher", LocalDate.now().minusYears(31), Country.SPAIN
                , Language.SPANISH, Hobby.DRINK));
        guests.add(new Guest("Joey", LocalDate.now().minusYears(10), Country.GERMANY
                , Language.GERMAN, Hobby.DRINK));
        guests.add(new Guest("Sheldon", LocalDate.now().minusYears(36), Country.FRANCE
                , Language.FRENCH, Hobby.WATER_SPORTS));
        guests.add(new Guest("Rachel", LocalDate.now().minusYears(22), Country.CHINA
                , Language.CHINESE, Hobby.READ));
    }

    public void filterGuestsSpain() {
        // Love Music and DANCE
        System.out.println("Guest of Spain who Love Music and Dance");
        guests.stream().
                filter(
                        guest -> guest.getCountry().equals(Country.SPAIN) &&
                                (guest.getHobby().equals(Hobby.MUSIC) ||
                                guest.getHobby().equals(Hobby.DANCE))
                ).forEach(System.out::println);

        //  Drink and above 18
        System.out.println("Guest of Spain who Drink and above 18");
        guests.stream().
                filter(
                        guest -> guest.getCountry().equals(Country.SPAIN) &&
                                (guest.getHobby().equals(Hobby.DRINK) &&
                                LocalDate.now().getYear()- guests.get(0).getDateOfBirth().getYear() >= 18)
                ).forEach(System.out::println);
    }

    public void filterGuestFrance() {
        guests.stream().
                filter(
                        guest -> guest.getCountry().equals(Country.FRANCE) &&
                                guest.getHobby().equals(Hobby.WATER_SPORTS)

                ).forEach(System.out::println);
    }

    public void filterGuestsByAgeMoreThan70() {
        guests.stream().
                filter(
                        guest -> (LocalDate.now().getYear() - guest.getDateOfBirth().getYear()) >= 70
                ).forEach(System.out::println);
    }

    public void filterGuestsByLanguageChinese() {
        guests.stream().
                filter(
                        guest -> guest.getLanguage().equals(Language.CHINESE) &&
                                guest.getHobby().equals(Hobby.READ)
                ).forEach(System.out::println);
    }
}

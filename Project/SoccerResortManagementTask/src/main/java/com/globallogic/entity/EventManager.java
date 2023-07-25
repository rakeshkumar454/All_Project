package com.globallogic.entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EventManager {
    public List<Guest> guests = new ArrayList<>();
    private static Connection con= DBConnection.getConnection();
    private static PreparedStatement pst;
    private static int count;
    private static ResultSet result;

    public static void main(String[] args) {
        EventManager eventManager= new EventManager();
        eventManager.populateGuests();
        System.out.println();
        System.out.println("Filtering Guests of France");
        System.out.println("===============================");
        eventManager.filterGuestFrance();
        System.out.println();

        System.out.println("Filtering Guests of Spain");
        System.out.println("===============================");
        eventManager.filterGuestsSpain();
        System.out.println();

        System.out.println("Filtering Guests with AGE more than 70");
        System.out.println("====================================");
        eventManager.filterGuestsByAgeMoreThan70();
        System.out.println();

        System.out.println("Filtering Guests who speak Chinese and Hobby is Read");
        System.out.println("========================================================");
        eventManager.filterGuestsByLanguageChinese();
    }

    public void populateGuests() {
        try {
            pst = con.prepareStatement("insert into guest values(?,?,?,?,?,?)");
            System.out.println("Enter Guest Details");
            while(true) {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter Name");
                String name=sc.nextLine();
                System.out.println("EnterDOB");
                String dob=sc.nextLine();
                SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
                java.util.Date udate=sdf.parse(dob);
                long l=udate.getTime();
                java.sql.Date sdate=new java.sql.Date(l);
                System.out.println("Enter Country");
                String country=sc.nextLine();
                System.out.println("Enter Language");
                String language=sc.nextLine();
                System.out.println("Enter Hobby");
                String hobby=sc.nextLine();
                pst.setInt(1,1);
                pst.setString(2, name);
                pst.setDate(3, sdate);
                pst.setString(4, country);
                pst.setString(5, language);
                pst.setString(6, hobby);
                count = pst.executeUpdate();
                System.out.println("Record saved !!");
                System.out.println("Do u want to insert more Records [Yes/No]");
                String option=sc.next();
                if(option.equalsIgnoreCase("No")) {
                    break;
                }
            }
        } catch (Exception e) {

            e.printStackTrace();
        }
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
        System.out.println();

        //  Drink and above 18

        System.out.println("Guest of Spain who Drink and above 18");
        guests.stream().
                filter(
                        guest -> guest.getCountry().equals(Country.SPAIN) &&
                                (guest.getHobby().equals(Hobby.DRINK) &&
                                        LocalDate.now().getYear()- guests.get(0).getDob().getYear() >= 18)
                ).forEach(System.out::println);
        System.out.println();
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
                        guest -> (LocalDate.now().getYear() - guest.getDob().getYear()) >= 70
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

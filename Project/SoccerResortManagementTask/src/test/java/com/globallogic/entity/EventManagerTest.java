package com.globallogic.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;

class EventManagerTest {
    /**
     * Method under test: {@link EventManager#populateGuests()}
     */
    @Test
    void testPopulateGuests() {
        EventManager eventManager = new EventManager();
        eventManager.populateGuests();
        List<Guest> guestList = eventManager.guests;
        assertEquals(9, guestList.size());
        Guest getResult = guestList.get(7);
        assertEquals(Language.FRENCH, getResult.getLanguage());
        Guest getResult1 = guestList.get(2);
        assertEquals(Language.CHINESE, getResult1.getLanguage());
        assertEquals(Hobby.WATER_SPORTS, getResult1.getHobby());
        assertEquals("Ben", getResult1.getCustomerName());
        assertEquals(Country.CHINA, getResult1.getCountry());
        assertEquals(Hobby.WATER_SPORTS, getResult.getHobby());
        assertEquals("Sheldon", getResult.getCustomerName());
        assertEquals(Country.FRANCE, getResult.getCountry());
        Guest getResult2 = guestList.get(6);
        assertEquals(Hobby.DRINK, getResult2.getHobby());
        assertEquals("Joey", getResult2.getCustomerName());
        assertEquals(Country.GERMANY, getResult2.getCountry());
        Guest getResult3 = guestList.get(1);
        assertEquals(Hobby.DANCE, getResult3.getHobby());
        assertEquals("Bob", getResult3.getCustomerName());
        assertEquals(Country.SPAIN, getResult3.getCountry());
        Guest getResult4 = guestList.get(8);
        assertEquals(Hobby.READ, getResult4.getHobby());
        assertEquals("Rachel", getResult4.getCustomerName());
        assertEquals(Country.CHINA, getResult4.getCountry());
        Guest getResult5 = guestList.get(0);
        assertEquals(Hobby.MUSIC, getResult5.getHobby());
        assertEquals("John", getResult5.getCustomerName());
        assertEquals(Country.USA, getResult5.getCountry());
        assertEquals(Language.CHINESE, getResult4.getLanguage());
        assertEquals(Language.ENGLISH, getResult5.getLanguage());
        assertEquals(Language.GERMAN, getResult2.getLanguage());
        assertEquals(Language.SPANISH, getResult3.getLanguage());
    }

    /**
     * Method under test: {@link EventManager#populateGuests()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testPopulateGuests2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.globallogic.entity.EventManager.populateGuests(EventManager.java:24)
        //   See https://diff.blue/R013 to resolve this issue.

        EventManager eventManager = new EventManager();
        eventManager.guests = null;
        eventManager.populateGuests();
    }
}


package org.resort.management;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;
import org.resort.management.entity.Country;
import org.resort.management.entity.Guest;
import org.resort.management.entity.Hobby;
import org.resort.management.entity.Language;

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
        assertEquals("Sheldon", getResult.getName());
        Guest getResult1 = guestList.get(2);
        assertEquals("Ben", getResult1.getName());
        assertEquals(Language.CHINESE, getResult1.getLanguage());
        assertEquals(Hobby.WATER_SPORTS, getResult1.getHobby());
        assertEquals(Country.CHINA, getResult1.getCountry());
        assertEquals(Language.FRENCH, getResult.getLanguage());
        assertEquals(Hobby.WATER_SPORTS, getResult.getHobby());
        assertEquals(Country.FRANCE, getResult.getCountry());
        Guest getResult2 = guestList.get(6);
        assertEquals(Language.GERMAN, getResult2.getLanguage());
        assertEquals(Hobby.DRINK, getResult2.getHobby());
        assertEquals(Country.GERMANY, getResult2.getCountry());
        Guest getResult3 = guestList.get(1);
        assertEquals(Language.SPANISH, getResult3.getLanguage());
        assertEquals(Hobby.DANCE, getResult3.getHobby());
        assertEquals(Country.SPAIN, getResult3.getCountry());
        Guest getResult4 = guestList.get(8);
        assertEquals(Language.CHINESE, getResult4.getLanguage());
        assertEquals(Hobby.READ, getResult4.getHobby());
        assertEquals(Country.CHINA, getResult4.getCountry());
        Guest getResult5 = guestList.get(0);
        assertEquals(Language.ENGLISH, getResult5.getLanguage());
        assertEquals(Hobby.MUSIC, getResult5.getHobby());
        assertEquals(Country.USA, getResult5.getCountry());
        assertEquals("Rachel", getResult4.getName());
        assertEquals("John", getResult5.getName());
        assertEquals("Joey", getResult2.getName());
        assertEquals("Bob", getResult3.getName());
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
        //       at org.resort.management.EventManager.populateGuests(EventManager.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        EventManager eventManager = new EventManager();
        eventManager.guests = null;
        eventManager.populateGuests();
    }
}


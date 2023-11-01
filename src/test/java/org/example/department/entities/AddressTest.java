package org.example.department.entities;

import junit.framework.TestCase;
import org.example.department.enums.State;

public class AddressTest extends TestCase {


    public void testAddressCreation() {
        Address address = new Address();
        address.setHouseNumber(56L);
        address.setStreetName("Tunde Ogbeha");
        address.setCity("Uyo");
        address.setState(State.AKWA_IBOM);
        address.setCountry("Nigeria");
        address.setZipCode(520521L);
        assertEquals(56L, (long) address.getHouseNumber());
        assertTrue("Uyo".equals(address.getCity()));

    }


    public void testGetStreetName() {
        Address address = new Address();

        address.setStreetName("Orchid road");
        assertEquals("Orchid road", address.getStreetName());
    }

    public void testSetStreetName() {
        Address address = new Address();

        address.setStreetName("Orchid road");
        assertEquals("Orchid road", address.getStreetName());
    }


}
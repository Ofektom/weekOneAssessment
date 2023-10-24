package org.example.department.entities;

import junit.framework.TestCase;
import org.example.department.enums.State;
import org.junit.Test;

public class AddressTest extends TestCase {

    @Test
    public  void AddressCreation(){
        Address address = new Address();
        address.setCity("Lagos");
        address.setHouseNumber(23L);
        address.setState(State.ABIA);
        address.setStreetName("Lawanson");
        address.setZipCode(521807L);
        address.setCountry("Nigeria");
        assertEquals("Lagos", address.getCity());
    }

}
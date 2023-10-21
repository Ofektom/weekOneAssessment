package org.example.department.entities;

import java.time.LocalDate;

public abstract class User {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String gender;
    private Address address;
    private Long phone;
}

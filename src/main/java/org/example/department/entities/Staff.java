package org.example.department.entities;

import org.example.department.enums.Role;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public abstract class Staff extends User{
    public static List<Staff> listOfStaff = new ArrayList<>();
    private Long staffId;
    private BigDecimal salary;
    private Long bvn;
    private String Rank;
    private Role role;
    private BigDecimal appointmentDate;
}

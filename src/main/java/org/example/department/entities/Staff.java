package org.example.department.entities;

import org.example.department.enums.Role;

import java.math.BigDecimal;

public abstract class Staff extends User{
    private Long staffId;
    private BigDecimal salary;
    private Long bvn;
    private String Rank;
    private Role role;
    private BigDecimal appointmentDate;
}

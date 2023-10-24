package org.example.department.services;

import org.example.department.entities.NonAcademic;
import org.example.department.entities.Payment;

import java.math.BigDecimal;

public interface NonAcademicServices {
    BigDecimal paysSalary(NonAcademic accountant, NonAcademic staff, Payment payment);
}

package org.example.department.servicesImpl;

import org.example.department.services.NonAcademicServices;
import org.example.department.entities.NonAcademic;
import org.example.department.entities.Payment;
import org.example.department.enums.Role;

import java.math.BigDecimal;

public class NonAcademicServiceImpl implements NonAcademicServices {
    @Override
    public BigDecimal paysSalary(NonAcademic accountant, NonAcademic staff, Payment payment){
        if(accountant.getRole().equals(Role.ACCOUNTANT)) {
            staff.setSalary(payment.getAmount());
            return payment.getAmount();
        }
        return null;
    }
}

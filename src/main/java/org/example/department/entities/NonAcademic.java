package org.example.department.entities;

import org.example.department.enums.Performance;
import org.example.department.enums.Role;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Map;

public class NonAcademic extends Staff{
    public NonAcademic(Long staffId, BigDecimal salary, Long bvn, Role role, String rank, LocalDate appointmentDate, LocalDate lastPromotionDate, Map<Long, String> accountDetails, Performance performance) {
        super(staffId, salary, bvn, role, rank, appointmentDate, lastPromotionDate, accountDetails, performance);
    }
}

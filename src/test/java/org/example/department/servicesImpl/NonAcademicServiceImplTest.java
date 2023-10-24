package org.example.department.servicesImpl;

import junit.framework.TestCase;
import org.example.department.entities.Payment;
import org.example.department.entities.Staff;
import org.example.department.entities.Teacher;

import java.math.BigDecimal;

public class NonAcademicServiceImplTest extends TestCase {

    public void testPaysSalary() {
        BigDecimal number = BigDecimal.valueOf(37843.4334);
        Staff staff = new Teacher();
        staff.setSalary(number);
        assertEquals(number, staff.getSalary());

    }
}
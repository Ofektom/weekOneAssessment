package org.example.department.entities;

import org.example.department.enums.CourseTitle;
import org.example.department.enums.Performance;
import org.example.department.enums.Role;

import java.math.BigDecimal;
import java.text.Format;
import java.time.LocalDate;
import java.util.*;

public class Teacher extends Staff{
    public static List<Teacher> teacherList = new ArrayList<>();
    private CourseTitle specialization;

    public Teacher() {
    }

    public Teacher(Long staffId, BigDecimal salary, Long bvn, Role role, String rank, LocalDate appointmentDate, LocalDate lastPromotionDate, Map<Long, String> accountDetails, Performance performance, CourseTitle specialization) {
        super(staffId, salary, bvn, role, rank, appointmentDate, lastPromotionDate, accountDetails, performance);
        this.specialization = specialization;
    }

    public CourseTitle getSpecialization() {
        return specialization;
    }

    public void setSpecialization(CourseTitle specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                " NAME: " + getFirstName()+
                " " + getLastName() +
                " ROLE: " + getRole() +
                " SALARY: " + getSalary()+
                " SPECIALIZATION: " + specialization +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Teacher teacher = (Teacher) o;
        return specialization == teacher.specialization;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), specialization);
    }
}

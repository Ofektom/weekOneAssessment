package org.example.department.entities;

import org.example.department.enums.Classes;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

public class Applicant extends Student{
    private Payment applicationFee;
    private Classes classes;

    public Applicant() {
    }

    public Applicant(String admissionNumber, Classes classes, Set<Course> courses, Payment applicationFee, Classes classes1) {
        super(admissionNumber, classes, courses);
        this.applicationFee = applicationFee;
        this.classes = classes1;
    }

    public Payment getApplicationFee() {
        return applicationFee;
    }

    public void setApplicationFee(Payment applicationFee) {
        this.applicationFee = applicationFee;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "applicationFee=" + applicationFee +
                ", classes=" + classes +
                ", getFirstName=" + getFirstName() +
                ", getLastName=" + getLastName() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Applicant applicant = (Applicant) o;
        return Objects.equals(applicationFee, applicant.applicationFee) && Objects.equals(classes, applicant.classes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationFee, classes);
    }
}

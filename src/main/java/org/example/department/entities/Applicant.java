package org.example.department.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Applicant extends Student{
    private Payment applicationFee;
    private Classes classes;

    public Applicant() {
    }

    public Applicant(Payment applicationFee, Classes classes) {
        this.applicationFee = applicationFee;
        this.classes = classes;
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

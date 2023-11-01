package org.example.department.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.example.department.enums.ClassName;

import java.util.Objects;
import java.util.Set;
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Applicant extends Student{
    private Payment applicationFee;
    private ClassName classes;

//    public Applicant() {
//    }
//
//    public Applicant(String admissionNumber, ClassName classes, String gradeLevel, String guardianEmail1, String guardianEmail2, String isArchived, String isDeleted, Payment applicationFee, ClassName classes1) {
//        super(admissionNumber, classes, gradeLevel, guardianEmail1, guardianEmail2, isArchived, isDeleted);
//        this.applicationFee = applicationFee;
//        this.classes = classes1;
//    }
//
//    public Payment getApplicationFee() {
//        return applicationFee;
//    }
//
//    public void setApplicationFee(Payment applicationFee) {
//        this.applicationFee = applicationFee;
//    }
//
//    public ClassName getClasses() {
//        return classes;
//    }
//
//    public void setClasses(ClassName classes) {
//        this.classes = classes;
//    }
//
//    @Override
//    public String toString() {
//        return "Applicant{" +
//                "applicationFee=" + applicationFee +
//                ", classes=" + classes +
//                ", getFirstName=" + getFirstName() +
//                ", getLastName=" + getLastName() +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Applicant applicant = (Applicant) o;
//        return Objects.equals(applicationFee, applicant.applicationFee) && Objects.equals(classes, applicant.classes);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(applicationFee, classes);
//    }
}

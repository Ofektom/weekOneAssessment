package org.example.department.entities;

import org.example.department.enums.Classes;

import java.util.*;

public class Student extends User{
    public static List<Student> studentRegister = new ArrayList<>();
    private String admissionNumber;
    private Classes classes;

    public Student() {
    }

    public Student(String admissionNumber, Classes classes, Set<Course> courses) {
        this.admissionNumber = admissionNumber;
        this.classes = classes;
    }

    public String getAdmissionNumber() {
        return admissionNumber;
    }

    public void setAdmissionNumber(String admissionNumber) {
        this.admissionNumber = admissionNumber;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses (Classes classes) {
        this.classes = classes;
    }


    @Override
    public String toString() {
        return "Student{" +
                "admissionNumber='" + admissionNumber + '\'' +
                ", classes=" + classes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(admissionNumber, student.admissionNumber) && Objects.equals(classes, student.classes) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(admissionNumber);
    }
}

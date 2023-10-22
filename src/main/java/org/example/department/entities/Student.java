package org.example.department.entities;

import java.util.*;

public class Student extends User{
    public static List<Student> listOfStudents = new ArrayList<>();
    private Long admissionNumber;
    private Classes classes;
    private Set<Course> courses;

    public Student() {
    }

    public Student(Long admissionNumber, Classes classes, Set<Course> courses) {
        this.admissionNumber = admissionNumber;
        this.classes = classes;
        this.courses = courses;
    }

    public Long getAdmissionNumber() {
        return admissionNumber;
    }

    public void setAdmissionNumber(Long admissionNumber) {
        this.admissionNumber = admissionNumber;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "admissionNumber=" + admissionNumber +
                ", classes=" + classes +
                ", courses=" + courses +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(admissionNumber, student.admissionNumber) && Objects.equals(classes, student.classes) && Objects.equals(courses, student.courses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(admissionNumber, classes, courses);
    }
}

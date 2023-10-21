package org.example.department.entities;

import java.util.HashSet;
import java.util.Set;

public class Student extends User{
    private Long admissionNumber;
    private Classes classes;
    private Set<Course> courses = new HashSet<>();
}

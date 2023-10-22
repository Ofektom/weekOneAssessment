package org.example.department.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Teacher extends Staff{
    private List<Classes> classes;
    private Set<Course> courses;
    private String specialization;
}

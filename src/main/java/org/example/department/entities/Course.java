package org.example.department.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Course {
    public static Set<Course> listOfCourses = new HashSet<>();
    private String title;
    private Teacher teacher;
    private String content;
    private String duration;
}

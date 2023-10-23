package org.example.department.entities;

import java.util.*;

public class Teacher extends Staff{
    public static List<Teacher> teacherList = new ArrayList<>();
    private List<Classes> classes;
    private Set<Course> courses;
    private String specialization;

    public Teacher() {
    }

    public Teacher(List<Classes> classes, Set<Course> courses, String specialization) {
        this.classes = classes;
        this.courses = courses;
        this.specialization = specialization;
    }

    public List<Classes> getClasses() {
        return classes;
    }

    public void setClasses(List<Classes> classes) {
        this.classes = classes;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "classes=" + classes +
                ", courses=" + courses +
                ", specialization='" + specialization + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(classes, teacher.classes) && Objects.equals(courses, teacher.courses) && Objects.equals(specialization, teacher.specialization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), classes, courses, specialization);
    }
}

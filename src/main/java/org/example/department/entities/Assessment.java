package org.example.department.entities;

import org.example.department.enums.AssessType;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Assessment {
    public static List<Assessment> assessmentList = new ArrayList<>();
    private Student student;
    private Course course;
    private Classes classes;
    private AssessType type;
    private Long Score;

    public Assessment() {
    }

    public Assessment(Student student, Course course, Classes classes, AssessType type, Long score) {
        this.student = student;
        this.course = course;
        this.classes = classes;
        this.type = type;
        Score = score;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    public AssessType getType() {
        return type;
    }

    public void setType(AssessType type) {
        this.type = type;
    }

    public Long getScore() {
        return Score;
    }

    public void setScore(Long score) {
        Score = score;
    }

    @Override
    public String toString() {
        return "Assessment{" +
                "student=" + student +
                ", course=" + course +
                ", classes=" + classes +
                ", type=" + type +
                ", Score=" + Score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Assessment that = (Assessment) o;
        return Objects.equals(student, that.student) && Objects.equals(course, that.course) && Objects.equals(classes, that.classes) && type == that.type && Objects.equals(Score, that.Score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(student, course, classes, type, Score);
    }
}

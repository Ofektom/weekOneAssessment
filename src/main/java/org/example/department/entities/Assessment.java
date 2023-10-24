package org.example.department.entities;

import org.example.department.enums.AssessType;
import org.example.department.enums.Classes;

import java.util.*;

public class Assessment {
    public static Set<Assessment> assessmentList = new HashSet<>();
    private Student student;
    private Course course;
    private Set<Question> questions;
    private Classes classes;
    private AssessType type;
    private Integer score;

    public Assessment() {
    }

    public Assessment(Student student, Course course, Set<Question> questions, Classes classes, AssessType type, Integer score) {
        this.student = student;
        this.course = course;
        this.questions = questions;
        this.classes = classes;
        this.type = type;
        this.score = score;
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

    public Set<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<Question> questions) {
        this.questions = questions;
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

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public static double calculateAverageScore(Student student){
        double totalScore = 0.0;
        double average = 0.0;
        int count = 0;
        for (Assessment assessment: Assessment.assessmentList){
            if (assessment.getStudent().getAdmissionNumber().equals(student.getAdmissionNumber())){
                totalScore += assessment.getScore();
                count++;
            }
        }
        try{
            average = totalScore/count;
        }catch (ArithmeticException e){
            System.out.println("Division by zero not allowed");
        }
        return average;
    }

    @Override
    public String toString() {
        return "Assessment{" +
                "student=" + student +
                ", course=" + course +
                ", questions=" + questions +
                ", classes=" + classes +
                ", type=" + type +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Assessment that = (Assessment) o;
        return Objects.equals(student, that.student) && Objects.equals(course, that.course) && Objects.equals(questions, that.questions) && classes == that.classes && type == that.type && Objects.equals(score, that.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(student, course, questions, classes, type, score);
    }
}

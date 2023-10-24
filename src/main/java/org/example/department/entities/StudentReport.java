package org.example.department.entities;

import org.example.department.enums.Conduct;

import java.util.Objects;

public class StudentReport {
    private Student student;
    private Double averageScore;
    private Conduct conduct;

    public StudentReport() {
    }

    public StudentReport(Student student, Double averageScore, Conduct conduct) {
        this.student = student;
        this.averageScore = averageScore;
        this.conduct = conduct;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(Double averageScore) {
        this.averageScore = averageScore;
    }

    public Conduct getConduct() {
        return conduct;
    }

    public void setConduct(Conduct conduct) {
        this.conduct = conduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentReport that = (StudentReport) o;
        return Objects.equals(student, that.student) && Objects.equals(averageScore, that.averageScore) && conduct == that.conduct;
    }

    @Override
    public int hashCode() {
        return Objects.hash(student, averageScore, conduct);
    }
}

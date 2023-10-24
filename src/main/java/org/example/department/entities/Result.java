package org.example.department.entities;

import java.util.Objects;

public class Result {
    private Student student;
    private Double average;

    public Result() {
    }

    public Result(Student student, Double average) {
        this.student = student;
        this.average = average;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "Result{" +
                "student=" + student +
                ", average=" + average +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result result = (Result) o;
        return Objects.equals(student, result.student) && Objects.equals(average, result.average);
    }

    @Override
    public int hashCode() {
        return Objects.hash(student, average);
    }
}

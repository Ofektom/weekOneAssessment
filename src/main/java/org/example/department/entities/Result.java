package org.example.department.entities;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class Result {
    private Student student;
    private double average;

    public Result() {
    }

    public Result(Student student, double average) {
        this.student = student;
    }


    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average= average;
    }
    public void setStudent(Student student){
        this.student = student;
    }
    public Student getStudent(){
        return student;
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
        return Double.compare(average, result.average) == 0 && Objects.equals(student, result.student);
    }

    @Override
    public int hashCode() {
        return Objects.hash(student, average);
    }
}

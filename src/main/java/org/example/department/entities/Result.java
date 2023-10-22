package org.example.department.entities;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class Result {
    private List<Assessment> assessment;
    private double Average;

    public Result() {
    }

    public Result(List<Assessment> assessment, double average) {
        this.assessment = assessment;
        Average = average;
    }

    public List<Assessment> getAssessment() {
        return assessment;
    }

    public void setAssessment(List<Assessment> assessment) {
        this.assessment = assessment;
    }

    public double getAverage() {
        return Average;
    }

    public void setAverage(double average) {
        Average = average;
    }

        @Override
    public String toString() {
        return "Result{" +
                "assessment=" + assessment +
                ", Average=" + Average +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result result = (Result) o;
        return Double.compare(Average, result.Average) == 0 && Objects.equals(assessment, result.assessment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assessment, Average);
    }
}

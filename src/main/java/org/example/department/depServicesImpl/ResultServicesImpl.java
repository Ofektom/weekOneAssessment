package org.example.department.depServicesImpl;

import org.example.department.depServices.ResultServices;
import org.example.department.entities.Assessment;
import org.example.department.entities.Student;

public class ResultServicesImpl implements ResultServices {
    @Override
    public double calculateAverage(Student student){
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
}

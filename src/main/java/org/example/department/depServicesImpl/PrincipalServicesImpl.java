package org.example.department.depServicesImpl;

import org.example.department.depServices.PrincipalServices;
import org.example.department.entities.*;
import org.example.department.enums.PaymentStatus;

import java.util.List;

public class PrincipalServicesImpl implements PrincipalServices {
    @Override
    public String admits(Applicant applicant) {
        if (applicant.getAge() <= 12) {
            Student.listOfStudents.add(applicant);
            return applicant.getFirstName() + " " + applicant.getLastName() + " is admitted";
        } else {
            return "Not eligible";
        }
    }
    @Override
    public String expels(Student student, Result result){
        if(student.equals(result.getStudent()) && result.getAverage() <= 10){
           List<Assessment> ass = Assessment.assessmentList;
            for (Assessment assessment : ass) {
                student = assessment.getStudent();
                ass.remove(student);
            };
        }
        return student.getFirstName() + student.getLastName();
    }
    @Override
    public void employs(Staff staff){

    }
    @Override
    public void retrench(Staff staff){

    }
    @Override
    public void assignsDuties(Staff staff){

    }
    @Override
    public void addsCourse(Course course){

    }
}

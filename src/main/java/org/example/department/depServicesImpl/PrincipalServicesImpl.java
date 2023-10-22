package org.example.department.depServicesImpl;

import org.example.department.depServices.PrincipalServices;
import org.example.department.entities.*;
import org.example.department.enums.PaymentStatus;

import java.util.List;

public class PrincipalServicesImpl implements PrincipalServices {
    @Override
    public String admits(Student student) {
        if (student.getAge() <= 12) {
            Student.listOfStudents.add(student);
            return student.getFirstName() + " " + student.getLastName() + " is admitted";
        } else {
            return "Not eligible";
        }
    }
    @Override
    public String expels(Result result){
        Student student= new Student();
        if(result.getAverage()< 30){
           List<Assessment> ass = result.getAssessment();
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

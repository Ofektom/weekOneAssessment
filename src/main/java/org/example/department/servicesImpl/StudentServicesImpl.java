package org.example.department.servicesImpl;

import org.example.department.services.StudentServices;
import org.example.department.entities.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StudentServicesImpl implements StudentServices {
    public static Map<Student, List<Course>> studentSubjectChoice = new HashMap<>();
    public String learn(Course course){
        return course.getContent();
    }
    public Payment payFees(Payment payment){
        return payment;
    }
    public Set<Question> takeAssessment(Assessment assessment){
        return assessment.getQuestions();
    }
    public Map<Student, List<Course>> registerSubject(Student student, List<Course> courses){
        studentSubjectChoice.put(student, courses);
        return studentSubjectChoice;
    }

}

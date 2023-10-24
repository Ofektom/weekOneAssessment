package org.example.department.services;

import org.example.department.entities.*;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface StudentServices {
    String learn(Course course);
    Payment payFees(Payment payment);
    Set<Question> takeAssessment(Assessment assessment);
    Map<Student, List<Course>> registerSubject(Student student, List<Course> courses);
}

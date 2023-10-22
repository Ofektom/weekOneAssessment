package org.example.department.depServices;

import org.example.department.entities.Assessment;
import org.example.department.entities.Course;
import org.example.department.entities.Payment;

public interface StudentServices {
    void learns(Course course);
    void payFees(Payment payment);
    Long takeAssessment(Assessment assessment);
}

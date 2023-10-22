package org.example.department.depServices;

import org.example.department.entities.Course;
import org.example.department.entities.Payment;
import org.example.department.entities.Staff;
import org.example.department.entities.Student;

public interface PrincipalServices {
    String admits(Student student, Payment payment);
    Student expels(Student student);
    void employs(Staff staff);
    void retrench(Staff staff);

    void assignsDuties(Staff staff);
    void addsCourse(Course course);

}

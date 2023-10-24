package org.example.department.services;

import org.example.department.entities.*;
import org.example.department.enums.Role;

import java.util.List;

public interface PrincipalServices {
    Student admit(Applicant applicant);
    Student expel(StudentReport studentReport);
    Staff employs(Staff staff);
    Staff retrench(Staff staff);

    void assignsDuties(Staff staff, Role role);
    List<Student> viewAllStudents();
    List<Staff> viewAllStaff();

}

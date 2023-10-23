package org.example.department.depServices;

import org.example.department.entities.*;

public interface PrincipalServices {
    String admits(Applicant applicant);
    String expels(Student student, Result result);
    void employs(Staff staff);
    void retrench(Staff staff);

    void assignsDuties(Staff staff);
    void addsCourse(Course course);

}

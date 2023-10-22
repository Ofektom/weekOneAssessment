package org.example.department.depServices;

import org.example.department.entities.Assessment;
import org.example.department.entities.Course;
import org.example.department.entities.Student;

public interface TeacherServices {
    void teaches(Course course);
    void assesses(Assessment assessment, Student student);
}

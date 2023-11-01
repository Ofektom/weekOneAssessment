package org.example.department.services;

import org.example.department.entities.Assessment;
import org.example.department.entities.Course;
import org.example.department.entities.Student;
import org.example.department.entities.StudentReport;

import java.util.Map;

public interface TeacherServices {

    Course teach(Course course);
    Long assess(Assessment assessment, Student student);
    Map<Student, StudentReport> promoteStudent(Student student, StudentReport studentReport);
}

package org.example.department.servicesImpl;

import org.example.department.services.TeacherServices;
import org.example.department.entities.Assessment;
import org.example.department.entities.Course;
import org.example.department.entities.Student;
import org.example.department.entities.StudentReport;

import java.util.HashMap;
import java.util.Map;

public class TeacherServicesImpl implements TeacherServices {

    public static Map<Student, StudentReport> studentLedger = new HashMap<>();
    @Override
    public Course teach(Course course){
        return course;
    }
    @Override
    public Long assess(Assessment assessment, Student student){
        return null;
    }
    @Override
    public Map<Student, StudentReport> promoteStudent(Student student, StudentReport studentReport){
        return studentLedger;
    }
}

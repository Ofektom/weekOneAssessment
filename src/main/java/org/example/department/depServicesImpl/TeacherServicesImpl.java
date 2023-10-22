package org.example.department.depServicesImpl;

import org.example.department.depServices.TeacherServices;
import org.example.department.entities.Assessment;
import org.example.department.entities.Course;
import org.example.department.entities.Student;

public class TeacherServicesImpl implements TeacherServices {
    @Override
    public void teaches(Course course){

    }
    @Override
    public Long assesses(Assessment assessment, Student student){
        return null;
    }
    @Override
    public void promotesStudent(Student student, Assessment assessment){

    }
}

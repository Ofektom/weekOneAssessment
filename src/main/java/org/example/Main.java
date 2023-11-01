package org.example;

import org.example.department.enums.Role;
import org.example.department.servicesImpl.PrincipalServicesImpl;
import org.example.department.servicesImpl.TeacherServicesImpl;
import org.example.department.entities.*;
import org.example.department.enums.ClassName;
import org.example.department.enums.CourseTitle;
import org.example.department.utility.FileInputServiceImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputServiceImpl fileInputService = new FileInputServiceImpl();
        BufferedReader reader =  fileInputService.openFile("/Users/mac/IdeaProjects/weekOneAssessment/src/main/java/org/example/department/utility/studentData.csv");
        Student student = new Student();
        student.getDetails(reader);

        System.out.println(Student.studentRegister);
        System.out.println("\n");

        BufferedReader reader2 =  fileInputService.openFile("/Users/mac/IdeaProjects/weekOneAssessment/src/main/java/org/example/department/utility/teacherData.csv");
        Teacher teacher = new Teacher();
        teacher.inputDetails(reader2);

        System.out.println(Teacher.teacherList);
//        BigDecimal salary = new BigDecimal(1_332_321.32342);
//
//        Teacher teacher1 = new Teacher();
//        teacher1.setFirstName("Ofofonono");
//        teacher1.setLastName("Ekarika");
//        teacher1.setSalary(salary);
//        teacher1.setRole(Role.TEACHER);
//        teacher1.setSpecialization(CourseTitle.BIOLOGY);
//
//
//        Applicant applicant1 = new Applicant();
//        applicant1.setFirstName("Goodnews");
//        applicant1.setLastName("Udotong");
//        applicant1.setClasses(ClassName.JS2);
//        applicant1.setAge(10);
//        applicant1.setAdmissionNumber("AB1234");
//
//
//        Applicant applicant2 = new Applicant();
//        applicant2.setFirstName("Banjo");
//        applicant2.setLastName("Martins");
//        applicant2.setClasses(ClassName.SS1);
//        applicant2.setAge(14);
//        applicant2.setAdmissionNumber("WE7865");
//
//        Course course1 = new Course();
//        course1.setTitle(CourseTitle.CHEMISTRY);
//        course1.setContent("Chemistry is the study of chemicals and their reaction with each other");
//        course1.setDuration("2 Hours");
//        course1.setTeacher(teacher1);
//
//        Course.listOfCourses.add(course1);
//
//
//        System.out.println("APPLICANTS INFORMATION:");
//        PrincipalServicesImpl principalServices1 = new PrincipalServicesImpl();
//        System.out.println(principalServices1.admit(applicant1));
//        System.out.println(principalServices1.admit(applicant2));
//        System.out.println("\n");
//
//
//        System.out.println("LIST OF EMPLOYED TEACHERS");
//        principalServices1.employs(teacher1);
//        System.out.println(PrincipalServicesImpl.allStaffs);
//        System.out.println("\n");
//
//
//        Student student1 = Student.studentRegister.get(Student.studentRegister.indexOf(applicant1));
//        Assessment assess1 = new Assessment();
//        assess1.setStudent(student1);
//        assess1.setScore(72);
//        Assessment assess2 = new Assessment();
//        assess2.setStudent(student1);
//        assess2.setScore(83);
//        Assessment assess3 = new Assessment();
//        assess3.setStudent(student1);
//        assess3.setScore(91);
//
//        Student student2 = Student.studentRegister.get(Student.studentRegister.indexOf(applicant2));
//        Assessment sassess1 = new Assessment();
//        sassess1.setStudent(student2);
//        sassess1.setScore(73);
//        Assessment assess22 = new Assessment();
//        assess22.setStudent(student2);
//        assess22.setScore(63);
//        Assessment assess33 = new Assessment();
//        assess33.setStudent(student2);
//        assess33.setScore(23);
//
//        System.out.println("TOPIC TAUGHT BY TEACHER:");
//        TeacherServicesImpl teacherServices = new TeacherServicesImpl();
//        System.out.println(teacherServices.teach(course1).getContent());
//        System.out.println("\n");
//
//        Assessment.assessmentList.add(assess1);
//        Assessment.assessmentList.add(assess2);
//        Assessment.assessmentList.add(assess3);
//
//        Assessment.assessmentList.add(sassess1);
//        Assessment.assessmentList.add(assess22);
//        Assessment.assessmentList.add(assess33);
//
//
//        System.out.println("TERMINAL RESULT OF STUDENTS:");
//        Result result = new Result();
//        result.setStudent(student1);
//        result.setAverage(Assessment.calculateAverageScore(student1));
//        System.out.println(result.getStudent().getFirstName()+" "+result.getStudent().getLastName()+ " has an average score of " + result.getAverage());
//

    }
}
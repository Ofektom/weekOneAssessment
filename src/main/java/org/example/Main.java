package org.example;

import org.example.department.enums.Role;
import org.example.department.servicesImpl.PrincipalServicesImpl;
import org.example.department.servicesImpl.TeacherServicesImpl;
import org.example.department.entities.*;
import org.example.department.enums.Classes;
import org.example.department.enums.CourseTitle;

import java.math.BigDecimal;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BigDecimal salary = new BigDecimal(1_332_321.32342);

        Teacher teacher1 = new Teacher();
        teacher1.setFirstName("Ofofonono");
        teacher1.setLastName("Ekarika");
        teacher1.setSalary(salary);
        teacher1.setRole(Role.TEACHER);
        teacher1.setSpecialization(CourseTitle.BIOLOGY);


        Applicant applicant1 = new Applicant();
        applicant1.setFirstName("Goodnews");
        applicant1.setLastName("Udotong");
        applicant1.setClasses(Classes.JS2);
        applicant1.setAge(10);
        applicant1.setAdmissionNumber("AB1234");


        Applicant applicant2 = new Applicant();
        applicant2.setFirstName("Banjo");
        applicant2.setLastName("Martins");
        applicant2.setClasses(Classes.SS1);
        applicant2.setAge(14);
        applicant2.setAdmissionNumber("WE7865");

        Course course1 = new Course();
        course1.setTitle(CourseTitle.CHEMISTRY);
        course1.setContent("This is the study of chemicals and their reaction with each other");
        course1.setDuration("2 Hours");
        course1.setTeacher(teacher1);

        Course.listOfCourses.add(course1);

//        Student student1 = new Student();
//        student1.setFirstName("Eyesu");
//        student1.setLastName("Okpoho");
//        student1.setAdmissionNumber("A111");



        PrincipalServicesImpl principalServices1 = new PrincipalServicesImpl();
        System.out.println(principalServices1.admit(applicant1));
        System.out.println(principalServices1.admit(applicant2));

        principalServices1.employs(teacher1);
        System.out.println(PrincipalServicesImpl.allStaffs);


//        System.out.println(Student.studentRegister);

        Student student1 = Student.studentRegister.get(Student.studentRegister.indexOf(applicant1));
        Assessment assess1 = new Assessment();
        assess1.setStudent(student1);
        assess1.setScore(72);
        Assessment assess2 = new Assessment();
        assess2.setStudent(student1);
        assess2.setScore(83);
        Assessment assess3 = new Assessment();
        assess3.setStudent(student1);
        assess3.setScore(91);

        Student student2 = Student.studentRegister.get(Student.studentRegister.indexOf(applicant2));
        Assessment sassess1 = new Assessment();
        sassess1.setStudent(student2);
        sassess1.setScore(73);
        Assessment assess22 = new Assessment();
        assess22.setStudent(student2);
        assess22.setScore(63);
        Assessment assess33 = new Assessment();
        assess33.setStudent(student2);
        assess33.setScore(23);

        TeacherServicesImpl teacherServices = new TeacherServicesImpl();
        System.out.println(teacherServices.teach(course1));

        Assessment.assessmentList.add(assess1);
        Assessment.assessmentList.add(assess2);
        Assessment.assessmentList.add(assess3);

        Assessment.assessmentList.add(sassess1);
        Assessment.assessmentList.add(assess22);
        Assessment.assessmentList.add(assess33);


        Result result = new Result();
        result.setStudent(student1);
        result.setAverage(Assessment.calculateAverageScore(student1));
        System.out.println(result.getStudent().getFirstName()+" "+result.getStudent().getLastName()+ " has an average score of " + result.getAverage());


        Result result1 = new Result();
        result1.setStudent(student2);
        result.setAverage(Assessment.calculateAverageScore(student2));
        System.out.println(result1.getStudent().getFirstName()+" "+result1.getStudent().getLastName()+ " has an average score of " + result1.getAverage());
    }
}
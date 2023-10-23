package org.example;

import org.example.department.depServicesImpl.PrincipalServicesImpl;
import org.example.department.depServicesImpl.ResultServicesImpl;
import org.example.department.entities.*;

import java.math.BigDecimal;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher();
        teacher1.setFirstName("Ofofonono");
        teacher1.setLastName("Ekarika");

        BigDecimal amount = new BigDecimal("80,000.00");
        Payment feePayment = new Payment();
        feePayment.setAmount(amount);

        Applicant applicant1 = new Applicant();
        applicant1.setFirstName("Goodnews");
        applicant1.setLastName("Udotong");
        applicant1.setAge(10);
        applicant1.setApplicationFee(feePayment);

        Course course1 = new Course();
        course1.setTitle("Chemistry");
        course1.setContent("This is the study of chemicals and their reaction with each other");
        course1.setDuration("2 Hours");
        course1.setTeacher(teacher1);

        Course.listOfCourses.add(course1);

        Student student1 = new Student();
        student1.setFirstName("Eyesu");
        student1.setLastName("Okpoho");
        student1.setAdmissionNumber("A111");
        student1.setCourses(Course.listOfCourses);

        Assessment assess1 = new Assessment();
        assess1.setStudent(student1);
        assess1.setScore(72);
        Assessment assess2 = new Assessment();
        assess2.setStudent(student1);
        assess2.setScore(83);
        Assessment assess3 = new Assessment();
        assess3.setStudent(student1);
        assess3.setScore(91);

        Assessment.assessmentList.add(assess1);
        Assessment.assessmentList.add(assess2);
        Assessment.assessmentList.add(assess3);

        ResultServicesImpl res = new ResultServicesImpl();
        Result result = new Result();
        result.setAverage(res.calculateAverage(student1));
        result.setStudent(student1);

        PrincipalServicesImpl principalServices = new PrincipalServicesImpl();
        principalServices.admits(applicant1);

        System.out.println(Student.listOfStudents);

        System.out.println(result.getStudent().getFirstName()+" "+result.getStudent().getLastName()+ " has an average score of " + result.getAverage());
    }
}
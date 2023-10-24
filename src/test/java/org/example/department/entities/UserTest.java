package org.example.department.entities;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test



    @org.junit.jupiter.api.Test
    public void getFirstName() {
        Student student = new Student();
        student.setFirstName("Effiong");
        assertEquals("Effiong", student.getFirstName());
    }

    @org.junit.jupiter.api.Test
    void setFirstName() {
        Staff teacher = new Teacher();
        teacher.setFirstName("Uche");
        assertEquals(teacher.getFirstName(), "Uche");
    }

    @org.junit.jupiter.api.Test
    void getAge() {
        Applicant applicant = new Applicant();
        applicant.setAge(2);
        assertTrue(2==applicant.getAge());
    }

    @org.junit.jupiter.api.Test
    void setAge() {
        Applicant applicant = new Applicant();
        applicant.setAge(2);
        assertEquals(applicant.getAge(), 2);
    }
}
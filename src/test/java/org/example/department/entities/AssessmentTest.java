package org.example.department.entities;

import junit.framework.TestCase;
import org.example.department.servicesImpl.PrincipalServicesImpl;
import org.junit.Test;

public class AssessmentTest extends TestCase {


    public void testCalculateAverageScore() {
       Student student = new Student();
       student.setAdmissionNumber("SD1");
        Assessment assess1 = new Assessment();
        assess1.setStudent(student);
        assess1.setScore(72);
        Assessment assess2 = new Assessment();
        assess2.setStudent(student);
        assess2.setScore(83);
        Assessment assess3 = new Assessment();
        assess3.setStudent(student);
        assess3.setScore(91);
        Assessment.assessmentList.add(assess1);
        Assessment.assessmentList.add(assess2);
        Assessment.assessmentList.add(assess3);
        double result = Assessment.calculateAverageScore(student);
        double expectedResult = (0.0+72+83+91)/3;
        assertFalse(result!=expectedResult);
        assertEquals("SD1", student.getAdmissionNumber());

    }
}
package org.example.department.entities;

import junit.framework.TestCase;
import org.example.department.enums.CourseTitle;

public class TeacherTest extends TestCase {

    public void testGetSpecialization() {
        Teacher teacher = new Teacher();
        teacher.setSpecialization(CourseTitle.ACCOUNTING);
        assertEquals(CourseTitle.ACCOUNTING, teacher.getSpecialization());
    }

    public void testSetSpecialization() {
        Teacher teacher = new Teacher();
        teacher.setSpecialization(CourseTitle.BIOLOGY);
        assertEquals(teacher.getSpecialization(), CourseTitle.BIOLOGY);
    }
}
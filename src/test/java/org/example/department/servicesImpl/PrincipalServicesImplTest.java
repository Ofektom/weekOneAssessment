package org.example.department.servicesImpl;

import junit.framework.TestCase;
import org.example.department.entities.Applicant;
import org.example.department.entities.Student;

public class PrincipalServicesImplTest extends TestCase {

    public void testAdmit() {
        PrincipalServicesImpl principalServices = new PrincipalServicesImpl();
        Applicant applicant = new Applicant();
        applicant.setAge(23);
        principalServices.admit(applicant);
        assertEquals(23,applicant.getAge());
                                                                    }
}
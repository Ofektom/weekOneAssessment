package org.example.department.depServicesImpl;

import org.example.department.depServices.PrincipalServices;
import org.example.department.entities.Course;
import org.example.department.entities.Payment;
import org.example.department.entities.Staff;
import org.example.department.entities.Student;
import org.example.department.enums.PaymentStatus;

public class PrincipalServicesImpl implements PrincipalServices {
    @Override
    public String admits(Student student, Payment payment){
        if(payment.getStatus().equals(PaymentStatus.CLEARED) && Student.listOfStudents.contains(student.getAdmissionNumber())){
            return student.getFirstName()+" "+student.getLastName()+ "Admitted";
        }
        return "Not admitted";
    }
    Student expels(Student student);
    void employs(Staff staff);
    void retrench(Staff staff);

    void assignsDuties(Staff staff);
    void addsCourse(Course course);
}

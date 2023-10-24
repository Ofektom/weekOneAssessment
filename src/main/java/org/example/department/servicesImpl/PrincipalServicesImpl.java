package org.example.department.servicesImpl;

import org.example.department.services.PrincipalServices;
import org.example.department.entities.*;
import org.example.department.enums.Conduct;
import org.example.department.enums.Performance;
import org.example.department.enums.Role;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PrincipalServicesImpl implements PrincipalServices {

    public static List<Staff> staffRegister = new ArrayList<>();
    public static HashMap<Role, List<Staff>> allStaffs =  new HashMap<>();
    @Override
    public Student admit(Applicant applicant){
        if (applicant.getAge() <= 20) {
            Student.studentRegister.add(applicant);
            return applicant;
        }
        return null;
    }
    @Override
    public Student expel(StudentReport studentReport){
        if(studentReport.getConduct().equals(Conduct.GROSS_MISCONDUCT)){
            return Student.studentRegister.remove(Student.studentRegister.indexOf(studentReport.getStudent()));
        }
        return null;
    }
    @Override
    public Staff employs(Staff staff){
        if (staff.getRole()==null){
            throw new NullPointerException("ALERT GHOST WORKER!!! Role cannot be null");
        }
        if (allStaffs.get(staff.getRole())==null){
            List<Staff> staffList = new ArrayList<>();
            staffList.add(staff);
            allStaffs.put(staff.getRole(), staffList);
        }
        else{
            allStaffs.get(staff.getRole()).add(staff);
        }
        return staff;
    }
    @Override
    public Staff retrench(Staff staff){
        if(staff.getPerformance().equals(Performance.POOR)){
            staffRegister.remove(staff);
            return staff;
        }
        return null;
    }
    @Override
    public void assignsDuties(Staff staff, Role role){
        staff.setRole(role);
    }
    @Override
    public List<Student> viewAllStudents() {
        return Student.studentRegister;
    }
    @Override
    public List<Staff> viewAllStaff() {
        return staffRegister;
    }
}

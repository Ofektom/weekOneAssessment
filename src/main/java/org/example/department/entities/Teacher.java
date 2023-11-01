package org.example.department.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.example.department.enums.CourseTitle;
import org.example.department.enums.Performance;
import org.example.department.enums.Role;

import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Teacher extends Staff{
    public static List<Teacher> teacherList = new ArrayList<>();
    private String teacherId;
    private CourseTitle specialization;

    @Override
    public String toString() {
        return "Teacher{" +
                ", teacherId='" + teacherId + '\'' +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", email='" + getEmail() + '\'' +
                '}' +
                "\n";
    }

    //    public Teacher() {
//    }
//
//    public Teacher(Long staffId, BigDecimal salary, Long bvn, Role role, String rank, LocalDate appointmentDate, LocalDate lastPromotionDate, Map<Long, String> accountDetails, Performance performance, CourseTitle specialization) {
//        super(staffId, salary, bvn, role, rank, appointmentDate, lastPromotionDate, accountDetails, performance);
//        this.specialization = specialization;
//    }
//
//    public CourseTitle getSpecialization() {
//        return specialization;
//    }
//
//    public void setSpecialization(CourseTitle specialization) {
//        this.specialization = specialization;
//    }
    public void inputDetails(BufferedReader bufReader) throws IOException {
        String line;
        while ((line = bufReader.readLine()) != null) {
            String[] data = line.split(",", -1); // To keep trailing empty values
            String ID = "";
            String email = "";
            String firstName = "";
            String lastName = "";


            for (int i = 0; i < data.length; i++) {
                if (data[i].isEmpty()) {
                    data[i] = null; // Replace empty values with null
                }
                switch(i){
                    case 0:ID= data[i];
                        break;
                    case 4:email=data[i];
                        break;
                    case 1:firstName=data[i];
                    case 2:lastName=data[i];
                }
            }
            Teacher teacher = Teacher.builder()
                    .teacherId(ID)
                    .email(email)
                    .firstName(firstName)
                    .lastName(lastName)
                    .build();
            teacherList.add(teacher);


        }
    }

}

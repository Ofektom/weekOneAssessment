package org.example.department.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.example.department.enums.ClassName;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Student extends User{
    public static List<Student> studentRegister = new ArrayList<>();
    private String admissionNumber;
    private ClassName classes;
    private String gradeLevel;
    private String guardianEmail1;
    private String guardianEmail2;
    private String isArchived;
    private String isDeleted;

    @Override
    public String toString() {
        return
                "  " + getId() +
                ", " + getFirstName() +
                ", " + getLastName() +
                ", " + getEmail() +
                ", " + gradeLevel +
                ", " + guardianEmail1 +
                ", " + guardianEmail2 +
                ", " + isArchived +
                ", " + isDeleted +
                "\n";
    }
    public void getDetails(BufferedReader bufReader) throws IOException {
        String line;
        while ((line = bufReader.readLine()) != null) {
            String[] data = line.split(",", -1); // To keep trailing empty values
            String ID = "";
            String firstName = "";
            String lastName = "";
            String gradeLevel = "";
            String email = "";
            String guardianEmail1 = "";
            String guardianEmail2 = "";
            String isArchived = "";
            String isDeleted = "";

            for (int i = 0; i < data.length; i++) {
                if (data[i].isEmpty()) {
                    data[i] = null; // Replace empty values with null
                }
                switch (i){
                    case 0:ID=data[i];
                        break;
                    case 1: firstName=data[i];
                        break;
                    case 2: lastName=data[i];
                        break;
                    case 3: gradeLevel=data[i];
                    case 4: email=data[i];
                    case 5: guardianEmail1=data[i];
                    case 6: guardianEmail2=data[i];
                    case 7: isArchived=data[i];
                    case 8: isDeleted=data[i];
                }

            }
            Student student = Student.builder()
                    .id(ID)
                    .firstName(firstName)
                    .lastName(lastName)
                    .gradeLevel(gradeLevel)
                    .email(email)
                    .guardianEmail1(guardianEmail1)
                    .guardianEmail2(guardianEmail2)
                    .isArchived(isArchived)
                    .isDeleted(isDeleted)
                    .build();
            Student.studentRegister.add(student);
        }
    }

    //    public Student() {
//    }

//    public Student(String admissionNumber, ClassName classes, Set<Course> courses) {
//        this.admissionNumber = admissionNumber;
//        this.classes = classes;
//    }
//
//    public String getAdmissionNumber() {
//        return admissionNumber;
//    }
//
//    public void setAdmissionNumber(String admissionNumber) {
//        this.admissionNumber = admissionNumber;
//    }
//
//    public ClassName getClasses() {
//        return classes;
//    }
//
//    public void setClasses (ClassName classes) {
//        this.classes = classes;
//    }
//
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "admissionNumber='" + admissionNumber + '\'' +
//                ", classes=" + classes +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return Objects.equals(admissionNumber, student.admissionNumber) && Objects.equals(classes, student.classes) ;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(admissionNumber);
//    }
}

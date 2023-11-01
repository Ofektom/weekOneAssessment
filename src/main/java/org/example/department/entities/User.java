package org.example.department.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.Objects;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public abstract class User {
    private String id;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String email;
    private Address address;
    private Long phone;

//    public User() {
//    }
//
//    public User(String firstName, String lastName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }
//
//    public User(String firstName, String lastName, int age, String gender, Address address, Long phone) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.age = age;
//        this.gender = gender;
//        this.address = address;
//        this.phone = phone;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    public Address getAddress() {
//        return address;
//    }
//
//    public void setAddress(Address address) {
//        this.address = address;
//    }
//
//    public Long getPhone() {
//        return phone;
//    }
//
//    public void setPhone(Long phone) {
//        this.phone = phone;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", age=" + age +
//                ", gender='" + gender + '\'' +
//                ", address=" + address +
//                ", phone=" + phone +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        User user = (User) o;
//        return Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && Objects.equals(age, user.age) && Objects.equals(gender, user.gender) && Objects.equals(address, user.address) && Objects.equals(phone, user.phone);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(firstName, lastName, age, gender, address, phone);
//    }
}

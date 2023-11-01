package org.example.department.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.example.department.enums.ClassName;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Classes {
    private ClassName className;
    private Set<Course> listOfCourses;

//    public Classes() {
//    }
//
//    public Classes(ClassName className, Set<Course> listOfCourses) {
//        this.className = className;
//        this.listOfCourses = listOfCourses;
//    }
//
//    public ClassName getClassName() {
//        return className;
//    }
//
//    public void setClassName(ClassName className) {
//        this.className = className;
//    }
//
//    public Set<Course> getListOfCourses() {
//        return listOfCourses;
//    }
//
//    public void setListOfCourses(Set<Course> listOfCourses) {
//        this.listOfCourses = listOfCourses;
//    }
//
//    @Override
//    public String toString() {
//        return "Classes{" +
//                "className=" + className +
//                ", listOfCourses=" + listOfCourses +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Classes classes = (Classes) o;
//        return className == classes.className && Objects.equals(listOfCourses, classes.listOfCourses);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(className, listOfCourses);
//    }
}

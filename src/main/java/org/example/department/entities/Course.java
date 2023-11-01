package org.example.department.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.example.department.enums.CourseTitle;

import java.util.*;
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    public static Set<Course> listOfCourses = new HashSet<>();
    private CourseTitle title;
    private Teacher teacher;
    private String content;
    private String duration;

//    public Course() {
//    }
//
//    public Course(CourseTitle title, Teacher teacher, String content, String duration) {
//        this.title = title;
//        this.teacher = teacher;
//        this.content = content;
//        this.duration = duration;
//    }
//
//    public CourseTitle getTitle() {
//        return title;
//    }
//
//    public void setTitle(CourseTitle title) {
//        this.title = title;
//    }
//
//    public Teacher getTeacher() {
//        return teacher;
//    }
//
//    public void setTeacher(Teacher teacher) {
//        this.teacher = teacher;
//    }
//
//    public String getContent() {
//        return content;
//    }
//
//    public void setContent(String content) {
//        this.content = content;
//    }
//
//    public String getDuration() {
//        return duration;
//    }
//
//    public void setDuration(String duration) {
//        this.duration = duration;
//    }
//
//    @Override
//    public String toString() {
//        return "Course{" +
//                "title='" + title + '\'' +
//                ", teacher=" + teacher +
//                ", content='" + content + '\'' +
//                ", duration='" + duration + '\'' +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Course course = (Course) o;
//        return Objects.equals(title, course.title) && Objects.equals(teacher, course.teacher) && Objects.equals(content, course.content) && Objects.equals(duration, course.duration);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(title, teacher, content, duration);
//    }
}

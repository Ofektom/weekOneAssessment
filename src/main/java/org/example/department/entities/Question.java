package org.example.department.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Objects;
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Question {
    private Integer number;
    private String content;

//    public Question() {
//    }
//
//    public Question(Integer number, String content) {
//        this.number = number;
//        this.content = content;
//    }
//
//    public Integer getNumber() {
//        return number;
//    }
//
//    public void setNumber(Integer number) {
//        this.number = number;
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
//    @Override
//    public String toString() {
//        return "Question{" +
//                "number=" + number +
//                ", content='" + content + '\'' +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Question question = (Question) o;
//        return Objects.equals(number, question.number) && Objects.equals(content, question.content);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(number, content);
//    }
}

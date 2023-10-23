package org.example.department.entities;

import org.example.department.enums.Category;

import java.util.Objects;

public class Classes {
    private String name;
    private Category category;

    public Classes() {
    }

    public Classes(String name, Category category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "name='" + name + '\'' +
                ", category=" + category +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Classes classes = (Classes) o;
        return Objects.equals(name, classes.name) && category == classes.category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, category);
    }
}

package org.example.department.entities;

import org.example.department.enums.Role;

import java.util.Objects;

public class NonAcademic {
    private Role role;

    public NonAcademic() {
    }

    public NonAcademic(Role role) {
        this.role = role;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "NonAcademic{" +
                "role=" + role +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NonAcademic that = (NonAcademic) o;
        return role == that.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(role);
    }
}

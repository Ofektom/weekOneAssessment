package org.example.department.entities;

import org.example.department.enums.Role;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public abstract class Staff extends User{
    public static List<Staff> listOfStaff = new ArrayList<>();
    private Long staffId;
    private BigDecimal salary;
    private Long bvn;
    private String Rank;
    private LocalDate appointmentDate;
    private LocalDate lastPromotionDate;
    private Map<Long, String> accountDetails;

    public Staff() {
    }

    public Staff(Long staffId, String rank, Role role) {
        this.staffId = staffId;
        Rank = rank;
    }

    public Staff(Long staffId, BigDecimal salary, Long bvn, String rank, Role role, LocalDate appointmentDate, LocalDate lastPromotionDate, Map<Long, String> accountDetails) {
        this.staffId = staffId;
        this.salary = salary;
        this.bvn = bvn;
        Rank = rank;
        this.appointmentDate = appointmentDate;
        this.lastPromotionDate = lastPromotionDate;
        this.accountDetails = accountDetails;
    }

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Long getBvn() {
        return bvn;
    }

    public void setBvn(Long bvn) {
        this.bvn = bvn;
    }

    public String getRank() {
        return Rank;
    }

    public void setRank(String rank) {
        Rank = rank;
    }

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public LocalDate getLastPromotionDate() {
        return lastPromotionDate;
    }

    public void setLastPromotionDate(LocalDate lastPromotionDate) {
        this.lastPromotionDate = lastPromotionDate;
    }

    public Map<Long, String> getAccountDetails() {
        return accountDetails;
    }

    public void setAccountDetails(Map<Long, String> accountDetails) {
        this.accountDetails = accountDetails;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffId=" + staffId +
                ", salary=" + salary +
                ", bvn=" + bvn +
                ", Rank='" + Rank + '\'' +
                ", appointmentDate=" + appointmentDate +
                ", lastPromotionDate=" + lastPromotionDate +
                ", accountDetails=" + accountDetails +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Staff staff = (Staff) o;
        return Objects.equals(staffId, staff.staffId) && Objects.equals(salary, staff.salary) && Objects.equals(bvn, staff.bvn) && Objects.equals(Rank, staff.Rank) && Objects.equals(appointmentDate, staff.appointmentDate) && Objects.equals(lastPromotionDate, staff.lastPromotionDate) && Objects.equals(accountDetails, staff.accountDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(staffId, salary, bvn, Rank, appointmentDate, lastPromotionDate, accountDetails);
    }
}

package org.example.department.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.example.department.enums.Performance;
import org.example.department.enums.Role;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public abstract class Staff extends User{
    private String staffId;
    private BigDecimal salary;
    private Long bvn;
    private Role role;
    private String rank;
    private LocalDate appointmentDate;
    private LocalDate lastPromotionDate;
    private Map<Long, String> accountDetails;
    private Performance performance;

//    public Staff() {
//    }
//
//    public Staff(Long staffId, String rank, Role role) {
//        this.staffId = staffId;
//        this.rank = rank;
//        this.role = role;
//
//    }
//
//    public Staff(Long staffId, BigDecimal salary, Long bvn, Role role, String rank, LocalDate appointmentDate, LocalDate lastPromotionDate, Map<Long, String> accountDetails, Performance performance) {
//        this.staffId = staffId;
//        this.salary = salary;
//        this.bvn = bvn;
//        this.role = role;
//        this.rank = rank;
//        this.appointmentDate = appointmentDate;
//        this.lastPromotionDate = lastPromotionDate;
//        this.accountDetails = accountDetails;
//        this.performance = performance;
//    }
//
//    public Long getStaffId() {
//        return staffId;
//    }
//
//    public void setStaffId(Long staffId) {
//        this.staffId = staffId;
//    }
//
//    public BigDecimal getSalary() {
//        return salary;
//    }
//
//    public void setSalary(BigDecimal salary) {
//        this.salary = salary;
//    }
//
//    public Long getBvn() {
//        return bvn;
//    }
//
//    public void setBvn(Long bvn) {
//        this.bvn = bvn;
//    }
//
//    public String getRank() {
//        return rank;
//    }
//
//    public void setRank(String rank) {
//        this.rank = rank;
//    }
//
//    public Role getRole() {
//        return role;
//    }
//
//    public void setRole(Role role) {
//        this.role = role;
//    }
//
//    public LocalDate getAppointmentDate() {
//        return appointmentDate;
//    }
//
//    public void setAppointmentDate(LocalDate appointmentDate) {
//        this.appointmentDate = appointmentDate;
//    }
//
//    public LocalDate getLastPromotionDate() {
//        return lastPromotionDate;
//    }
//
//    public void setLastPromotionDate(LocalDate lastPromotionDate) {
//        this.lastPromotionDate = lastPromotionDate;
//    }
//
//    public Map<Long, String> getAccountDetails() {
//        return accountDetails;
//    }
//
//    public void setAccountDetails(Map<Long, String> accountDetails) {
//        this.accountDetails = accountDetails;
//    }
//
//    public Performance getPerformance() {
//        return performance;
//    }
//
//    public void setPerformance(Performance performance) {
//        this.performance = performance;
//    }
//
//    @Override
//    public String toString() {
//        return "Staff{" +
//                "staffId=" + staffId +
//                ", salary=" + salary +
//                ", bvn=" + bvn +
//                ", role=" + role +
//                ", rank='" + rank + '\'' +
//                ", appointmentDate=" + appointmentDate +
//                ", lastPromotionDate=" + lastPromotionDate +
//                ", accountDetails=" + accountDetails +
//                ", performance=" + performance +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        if (!super.equals(o)) return false;
//        Staff staff = (Staff) o;
//        return Objects.equals(staffId, staff.staffId) && Objects.equals(salary, staff.salary) && Objects.equals(bvn, staff.bvn) && role == staff.role && Objects.equals(rank, staff.rank) && Objects.equals(appointmentDate, staff.appointmentDate) && Objects.equals(lastPromotionDate, staff.lastPromotionDate) && Objects.equals(accountDetails, staff.accountDetails) && performance == staff.performance;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(super.hashCode(), staffId, salary, bvn, role, rank, appointmentDate, lastPromotionDate, accountDetails, performance);
//    }
}

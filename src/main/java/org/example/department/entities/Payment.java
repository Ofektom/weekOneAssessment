package org.example.department.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.example.department.enums.PayMethod;
import org.example.department.enums.PaymentStatus;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Payment{
    private Long PaymentID;
    private BigDecimal amount;
    private LocalDate paymentDate;
    private PayMethod payMethod;
    private PaymentStatus status;

//    public Payment() {
//    }
//
//    public Payment(Long paymentID, BigDecimal amount, LocalDate paymentDate, PayMethod payMethod) {
//        PaymentID = paymentID;
//        this.amount = amount;
//        this.paymentDate = paymentDate;
//        this.payMethod = payMethod;
//    }
//
//    public Long getPaymentID() {
//        return PaymentID;
//    }
//
//    public void setPaymentID(Long paymentID) {
//        PaymentID = paymentID;
//    }
//
//    public BigDecimal getAmount() {
//        return amount;
//    }
//
//    public void setAmount(BigDecimal amount) {
//        this.amount = amount;
//    }
//
//    public LocalDate getPaymentDate() {
//        return paymentDate;
//    }
//
//    public void setPaymentDate(LocalDate paymentDate) {
//        this.paymentDate = paymentDate;
//    }
//
//    public PayMethod getPayMethod() {
//        return payMethod;
//    }
//
//    public void setPayMethod(PayMethod payMethod) {
//        this.payMethod = payMethod;
//    }
//
//    public PaymentStatus getStatus() {
//        return status;
//    }
//
//    public void setStatus(PaymentStatus status) {
//        this.status = status;
//    }
//
//    @Override
//    public String toString() {
//        return "Payment{" +
//                "PaymentID=" + PaymentID +
//                ", amount=" + amount +
//                ", paymentDate=" + paymentDate +
//                ", payMethod=" + payMethod +
//                ", status=" + status +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Payment payment = (Payment) o;
//        return Objects.equals(PaymentID, payment.PaymentID) && Objects.equals(amount, payment.amount) && Objects.equals(paymentDate, payment.paymentDate) && payMethod == payment.payMethod && status == payment.status;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(PaymentID, amount, paymentDate, payMethod, status);
//    }
}

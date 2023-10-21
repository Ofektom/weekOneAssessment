package org.example.department.entities;

import org.example.department.enums.PayMethod;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Payment {
    private Long PaymentID;
    private BigDecimal amount;
    private LocalDate paymentDate;
    private PayMethod payMethod;
}

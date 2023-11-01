package org.example.department.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.example.department.enums.Performance;
import org.example.department.enums.Role;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Map;
@Data
@SuperBuilder
@AllArgsConstructor
public class NonAcademic extends Staff{

}

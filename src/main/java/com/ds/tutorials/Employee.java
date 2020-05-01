package com.ds.tutorials;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@AllArgsConstructor
@Data
public class Employee {
    private int eno;
    private String ename;
    private BigDecimal salary;
}

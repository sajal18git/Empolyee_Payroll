package com.bridgelabz.employeepayrollapp.dto;

public class EmployeePayrollDTO {
    public String empName;
    public long salary;

    public EmployeePayrollDTO(String empName, long salary) {
        this.empName = empName;
        this.salary = salary;
    }
}

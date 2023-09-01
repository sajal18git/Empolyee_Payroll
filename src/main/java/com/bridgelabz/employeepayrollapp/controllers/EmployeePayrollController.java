package com.bridgelabz.employeepayrollapp.controllers;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import com.bridgelabz.employeepayrollapp.services.EmployeePayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeePayrollController {
    @Autowired
    EmployeePayrollService employeePayrollService;

    @PostMapping("/post")
public EmployeePayrollData insert(@RequestBody EmployeePayrollDTO employeePayrollDTO) {
        return employeePayrollService.create(employeePayrollDTO);
    }

        @PutMapping("/update")
        public Object update(@RequestParam int empId, @RequestBody EmployeePayrollDTO employeePayrollDTO ) {
            return employeePayrollService.update(empId, employeePayrollDTO);
    }
//    @DeleteMapping("/delete/{empId}")
//    public EmployeePayrollData delete(@PathVariable int empId) {
//        return employeePayrollService.delete(empId);
//    }


}

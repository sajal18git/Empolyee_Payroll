package com.bridgelabz.employeepayrollapp.services;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.dto.ResponseDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import com.bridgelabz.employeepayrollapp.repository.EmployeePayrollRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class EmployeePayrollService {
    @Autowired
    EmployeePayrollRepo employeePayrollRepo;

    public EmployeePayrollData create (EmployeePayrollDTO employeePayrollDTO) {
EmployeePayrollData employeePayrollData= new EmployeePayrollData(employeePayrollDTO);
return employeePayrollRepo.save(employeePayrollData);

}
        public Object update (int empId, EmployeePayrollDTO employeePayrollDTO) {
            if (employeePayrollRepo.existsById(empId)) {
                EmployeePayrollData employeePayrollData = new EmployeePayrollData(employeePayrollDTO);
                employeePayrollData.setEmpId(empId);
                EmployeePayrollData employeePayrollData1 = employeePayrollRepo.save(employeePayrollData);
                ResponseDTO responseDTO= new ResponseDTO("Payroll data updated", employeePayrollData1);
                return new ResponseEntity<>(responseDTO, HttpStatus.OK);

            }
            else {
                return " ";
            }

        }





//    public EmployeePayrollData delete (int empId) {
//        EmployeePayrollData employeePayrollData = new EmployeePayrollData();
//        return employeePayrollRepo.save(employeePayrollData);
//    }

}

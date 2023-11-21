package com.example.demo.service;
import com.example.demo.DTO.EmployeeDTO;
import com.example.demo.DTO.EmployeeSaveDTO;
import com.example.demo.DTO.EmployeeUpdateDTO;
 
import java.util.List;
 
public interface EmployeeService {
    String addEmployee(EmployeeSaveDTO employeeSaveDTO);
 
    List<EmployeeDTO> getAllEmployee();
 
    String updateEmployees(EmployeeUpdateDTO employeeUpdateDTO);
 
    boolean deleteEmployee(int id);
}
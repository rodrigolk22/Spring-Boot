package com.example.demo.EmployeeController;
import com.example.demo.DTO.EmployeeDTO;
import com.example.demo.DTO.EmployeeSaveDTO;
import com.example.demo.DTO.EmployeeUpdateDTO;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/employee")
public class EmployeeController
{
    @Autowired
    private EmployeeService employeeService;

    @PostMapping(path = "/save")

    public String saveEmployee(@RequestBody EmployeeSaveDTO employeeSaveDTO)
    {
        String id = employeeService.addEmployee(employeeSaveDTO);
        return id;
    }

    @GetMapping(path = "/getAllEmployee")
    public List<EmployeeDTO> getAllEmployee()
    {
       List<EmployeeDTO> allEmployees = employeeService.getAllEmployee();
       return allEmployees;
    }

    @PutMapping(path = "/update")

    public String updateEmployee(@RequestBody EmployeeUpdateDTO employeeUpdateDTO)
    {
        String id = employeeService.updateEmployees(employeeUpdateDTO);
        return id;
    }

    @DeleteMapping(path = "/deleteemployee/{id}")
    public String deleteEmployee(@PathVariable(value = "id") int id)
    {
        boolean deleteemployee = employeeService.deleteEmployee(id);
        return "deleted";
    }

}
package com.emp_department.controller;

import com.emp_department.entity.Employee;
import com.emp_department.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping("/{deptId}")
    public Employee create(@RequestBody Employee emp, @PathVariable Long deptId) {
        return service.save(emp, deptId);
    }

}

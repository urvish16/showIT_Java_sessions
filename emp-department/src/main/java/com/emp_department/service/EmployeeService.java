package com.emp_department.service;

import com.emp_department.constants.MessageConstants;
import com.emp_department.entity.Department;
import com.emp_department.entity.Employee;
import com.emp_department.exceptions.ResourceNotFoundException;
import com.emp_department.repositories.DepartmentRepository;
import com.emp_department.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository empRepo;

    @Autowired
    private DepartmentRepository deptRepo;

    public Employee save(Employee emp, Long deptId) {
        Department dept = deptRepo.findById(deptId)
                .orElseThrow(() -> new ResourceNotFoundException(MessageConstants.RESOURCE_NOT_FOUND));
        emp.setDepartment(dept);
        return empRepo.save(emp);
    }

    public List<Employee> getEmployeeByName(String name){
        return empRepo.getEmployeeByName(name);
    }
}

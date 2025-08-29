package com.emp_department.service;

import com.emp_department.entity.Department;
import com.emp_department.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeparmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department save(Department dept) {

        return departmentRepository.save(dept);
    }

    public List<Department> getAll() {

        return departmentRepository.findAll();
    }

    public Department getById(Long id) {
        return departmentRepository.findById(id).orElse(null);
    }

    public Department update(Long id, Department dept) {
        Department existing = departmentRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setName(dept.getName());
            return departmentRepository.save(existing);
        }
        return null;
    }

    public void delete(Long id) {

        departmentRepository.deleteById(id);
    }
}

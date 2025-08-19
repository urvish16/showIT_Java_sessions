package com.emp_department.controller;

import com.emp_department.entity.Department;
import com.emp_department.service.DeparmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DeparmentService service;

    @PostMapping
    public Department create(@RequestBody Department dept) {
        return service.save(dept);
    }

    @GetMapping
    public List<Department> list() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Department get(@PathVariable Long id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public Department update(@PathVariable Long id, @RequestBody Department dept) {
        return service.update(id, dept);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "Department deleted";
    }
}

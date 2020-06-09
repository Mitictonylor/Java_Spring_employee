package com.github.mitictonylor.employee.EmployeeProject.controllers;

import com.github.mitictonylor.employee.EmployeeProject.modules.Department;
import com.github.mitictonylor.employee.EmployeeProject.modules.Project;
import com.github.mitictonylor.employee.EmployeeProject.repositories.DepartmentRepository;
import com.github.mitictonylor.employee.EmployeeProject.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
public class DepartmentController {

        @Autowired
        private DepartmentRepository departmentRepository;

        @GetMapping(value = "/departments")
        public List<Department> getAllEmployees(){
            return departmentRepository.findAll();
        }

        @GetMapping(value = "/departments/{id}")
        public Optional<Department> getDepartment(@PathVariable Long id){
                return departmentRepository.findById(id);
        }
}



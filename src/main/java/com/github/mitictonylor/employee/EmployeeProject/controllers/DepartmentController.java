package com.github.mitictonylor.employee.EmployeeProject.controllers;

import com.github.mitictonylor.employee.EmployeeProject.modules.Department;
import com.github.mitictonylor.employee.EmployeeProject.modules.Project;
import com.github.mitictonylor.employee.EmployeeProject.repositories.DepartmentRepository;
import com.github.mitictonylor.employee.EmployeeProject.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class DepartmentController {

        @Autowired
        private DepartmentRepository departmentRepository;

        @GetMapping(value = "/departments")
        public List<Department> getAllEmployees(){
            return departmentRepository.findAll();
        }
}



package com.github.mitictonylor.employee.EmployeeProject.controllers;

import com.github.mitictonylor.employee.EmployeeProject.modules.Employee;
import com.github.mitictonylor.employee.EmployeeProject.modules.Project;
import com.github.mitictonylor.employee.EmployeeProject.repositories.EmployeeRepository;
import com.github.mitictonylor.employee.EmployeeProject.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProjectController {

    @Autowired
    private ProjectRepository projectRepository;

    @GetMapping(value = "/projects")
    public List<Project> getAllEmployees(){
        return projectRepository.findAll();
    }

    @GetMapping(value = "/projects/{id}")
    public Optional<Project> getProject(@PathVariable Long id){
        return projectRepository.findById(id);
    }
}

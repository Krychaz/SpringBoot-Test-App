package com.kkan.demo.demo.controller;

import com.kkan.demo.demo.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/vmware")

public class EmployeesController {
    private List<Employee> employees;

    public EmployeesController(){
        employees = new ArrayList<>();
        employees.add(new Employee("MW", "Mike Waza", "waza@vmware.com", "Databases"));
        employees.add(new Employee("JF", "John Freedy","Freedy@vmware.com", "PKS"));
        employees.add(new Employee("RL", "Robert Luly", "Robert@vmware.com", "Azure"));

    }
    @GetMapping()
    public List<Employee> list(){
        return employees;
    }
    @GetMapping("/{id}")
    public Employee get(@PathVariable String id){
        return employees.stream().filter(e -> id.equals(e.getId())).findAny().orElse(null);
    }
}

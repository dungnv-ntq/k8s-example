package com.dung.k8sexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private EmployeeRepository repository;

    @GetMapping("/hello")
    public String hello() {
        return "hello world, welcome to k8s!";
    }

    @GetMapping("/employee")
    public List<Employee> getAllEmployee() {
        return this.repository.findAll();
    }

    @PostMapping("/employee")
    public Employee createEmployee(@RequestBody Employee employee) {
        return this.repository.save(employee);
    }
}

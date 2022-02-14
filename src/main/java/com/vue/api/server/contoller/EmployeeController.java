package com.vue.api.server.contoller;

import com.vue.api.server.annotations.CrossOriginsList;
import com.vue.api.server.entity.Employee;
import com.vue.api.server.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    @CrossOriginsList
    public List<Employee> fetchEmployees() {
        return employeeRepository.findAll();
    }

    @GetMapping("/employee")
    @CrossOriginsList
    public Optional<Employee> fetchOneEmployee() {
        int totalEmployees = employeeRepository.findAll().size();
        Random rand = new Random();
        int luckyId = rand.nextInt(totalEmployees) + 1;
        return employeeRepository.findById(Long.valueOf(luckyId));
    }
}

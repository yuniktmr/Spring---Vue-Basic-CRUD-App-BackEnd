package com.vue.api.server;

import com.vue.api.server.entity.Employee;
import com.vue.api.server.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class VueCrudBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(VueCrudBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		List<Employee> list = new ArrayList<Employee>();
		Employee employee1 = Employee.builder()
				.firstName("Yunik")
				.lastName("Tamrakar")
				.email("yuniktmr@gmail.com")
				.build();

		Employee employee2 = Employee.builder()
				.firstName("John")
				.lastName("Doe")
				.email("johndoe@gmail.com")
				.build();

		Employee employee3 = Employee.builder()
				.firstName("Jessica")
				.lastName("Jones")
				.email("jjones@gmail.com")
				.build();

		list.add(employee1);
		list.add(employee2);
		list.add(employee3);

		employeeRepository.saveAll(list);

	}
}

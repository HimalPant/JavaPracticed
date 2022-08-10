package com.test.swingdemo.service;

import java.util.List;

import com.test.swingdemo.model.Employee;

public interface EmployeeService {
	boolean addEmp(Employee emp);

	boolean deleteEmp(int id);

	boolean updateEmp(Employee emp);

	Employee getById(int id);

	List<Employee> getAll();

	List<Employee> search(String input);
}

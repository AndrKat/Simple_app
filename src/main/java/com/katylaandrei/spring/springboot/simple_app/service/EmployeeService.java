package com.katylaandrei.spring.springboot.simple_app.service;

import com.katylaandrei.spring.springboot.simple_app.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}

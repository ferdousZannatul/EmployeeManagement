package com.emplyee.management.project.management;

import com.emplyee.management.project.model.Employee;

public class EmployeeManagement {
    Employee[] employees;
    int size = 0;

    public EmployeeManagement(int number) {
        employees = new Employee[number];
    }

    public Employee saveEmployee(String name, String dept){
        Employee employee = new Employee(name, 1, dept);
        employees[size] = employee;
        size++;
        return employee;
    }

    public void printAllEmployee(){
        for (Employee employee: employees){
            System.out.println(employee);
        }
    }
}

package com.emplyee.management.project;

import com.emplyee.management.project.management.EmployeeManagement;
import com.emplyee.management.project.model.Employee;

public class Main {

    public static void main(String[] args) {
        EmployeeManagement employeeManagement = new EmployeeManagement(5);
        employeeManagement.saveEmployee("Pheobe", "A");
        employeeManagement.saveEmployee("A", "A");
        employeeManagement.saveEmployee("B", "B");
        employeeManagement.saveEmployee("C", "C");
        employeeManagement.saveEmployee("D", "D");
     employeeManagement.printAllEmployee();

     //toDo Employee management class
        //1. saveEmployee - in: Employee - out:employee
        //2. getEmployee
        //3. updateEmployee
        //4. deleteEmployee
    }
}

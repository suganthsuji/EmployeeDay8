package com.example;

public class Employee extends EmployeeAttendance {
    public static void main(String[] args) {
        System.out.println("Welcome to EmployeeWage Problem");
        EmployeeAttendance employeeAttendance=new EmployeeAttendance();
        int attendance=employeeAttendance.employeeAttendance();

        employeeAttendance.calculateWage(attendance);
    }
}

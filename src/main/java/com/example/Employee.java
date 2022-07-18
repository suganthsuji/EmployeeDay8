package com.example;

import java.util.Scanner;

public class Employee extends EmployeeAttendance {
    public static void main(String[] args) {
        System.out.println("Welcome to EmployeeWage Problem");
        EmployeeAttendance employeeAttendance=new EmployeeAttendance();



        Scanner scanner=new Scanner(System.in);
        int time=scanner.nextInt();
        switch (time){
            case 0:
                System.out.println("Part Time");
                int attendance=employeeAttendance.employeeAttendance();
                employeeAttendance.calculateWage(attendance,0);
                break;
            case 1:
                System.out.println("Full Time");
                 attendance=employeeAttendance.employeeAttendance();
                employeeAttendance.calculateWage(attendance,1);
                break;
        }
    }
}

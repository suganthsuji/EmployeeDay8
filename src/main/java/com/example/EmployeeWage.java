package com.example;

public class EmployeeWage {
    void calculateWage(int attendance){
        int wagePerHours=20;
        int noOfHour=8;

        if(attendance==0){
            System.out.println("Total wages for Employee is 0");
        }else {
            System.out.println("Total wages for Employee is "+ noOfHour*wagePerHours);
        }


    }
}

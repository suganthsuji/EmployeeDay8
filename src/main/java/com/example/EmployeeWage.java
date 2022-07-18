package com.example;

import java.util.Scanner;

public class EmployeeWage {
    void calculateWage(int attendance,int employee){
        int wagePerHours=20;
        int noOfHour=8;

        if(attendance==0){
            System.out.println("Total wages for Employee is 0");
        }else {
            if(employee==0){
                Scanner scanner=new Scanner(System.in);
                noOfHour=scanner.nextInt();
                System.out.println("Total wages for Employee is "+ noOfHour*wagePerHours);
            }
            else {
                System.out.println("Total wages for Employee is "+ 8*wagePerHours);
            }

        }


    }
}

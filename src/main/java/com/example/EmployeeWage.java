package com.example;

import java.util.Scanner;


public class EmployeeWage {
    int wagePerHours=20;
    int noOfDays=20;
    void calculateWage(int attendance,int employee){

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
                calculateWageForMonth();
            }

        }

    }
    void calculateWageForMonth(){
        System.out.println("Total wages for Employee is "+ 8*wagePerHours*noOfDays);

    }
}

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
    static double calculateUsingCondition(int attendance)
    {
        int days=0;
        double wagesTotal = 0;
        int hours=0;
        int ch = 0;
        while (true)
        {

            if(attendance == 1)
            {
                ch = 1;
            }
            else
            {
                System.out.println("Employee is Absent");
                break;
            }
            switch (ch)
            {
                case 1:
                    days++;
                    hours +=8;
                    break;
                case 2:
                    days++;
                    hours +=4;
                    break;
            }
            if(days > 20 || hours >= 100){
                break;
            }
            wagesTotal = days * 8 * 20;
        }
        return wagesTotal;
    }

}

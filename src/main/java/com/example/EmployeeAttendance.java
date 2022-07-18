package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmployeeAttendance {
    void employeeAttendance(){
        List<String> employeeStatus = new ArrayList<>();
        employeeStatus.add("PRESENT");
        employeeStatus.add("ABSENT");
        Random random=new Random();
        String attendance = employeeStatus.get(random.nextInt(employeeStatus.size()));

        if (attendance=="ABSENT")
        {
            System.out.println("Employee is ABSENT");
        }
		else{
            System.out.println("Employee is PRESENT");
      }
    }
}

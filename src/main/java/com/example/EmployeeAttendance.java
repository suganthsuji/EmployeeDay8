package com.example;

 class EmployeeAttendance extends EmployeeWage{
    int employeeAttendance(){
        double attendance=Math.floor(Math.random()*1000%2);

        if (attendance==0)
        {
            System.out.println("Employee is ABSENT");
        }
		else{
            System.out.println("Employee is PRESENT");
      }
        return (int)attendance;
    }
}

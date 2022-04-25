package com.bridgelabz.uc1;

public class EmployeeAttendance {

    public static int isPresent(){
        return (int) Math.floor(Math.random() * 10) % 2;
    }

    public static void main(String[] args) {

        if (isPresent() == 0)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
    }
}

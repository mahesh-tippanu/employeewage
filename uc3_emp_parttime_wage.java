package com.bridgelabz.uc3;

public class EmployeeWage {

    public static int empCheck() {
        return (int) Math.floor(Math.random() * 10) % 3;
    }
    public static void main(String[] args) {

        double IS_FULL_TIME = 1;
        double IS_PART_TIME = 2;
        int WAGE_PER_HOUR = 20;
        int empHrs = 0;
        int empWage = 0;

        if (empCheck() == IS_FULL_TIME)
            empHrs = 8;
        else if (empCheck() == IS_PART_TIME)
            empHrs = 4;

        empWage = empHrs * WAGE_PER_HOUR;
        System.out.println("Employee Wage is : " + empWage);

    }
}

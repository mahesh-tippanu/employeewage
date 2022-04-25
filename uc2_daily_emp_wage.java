package com.bridgelabz.uc2;

public class EmployeeDailyWage {

    public static int WAGE_PER_HOUR = 20;

    public static int isPresent() {
        return (int) Math.floor(Math.random() * 10) % 2;
    }

    public static void main(String[] args) {

        if (isPresent() == 0) {
            int empHrs = 8;
            double empWage = empHrs * WAGE_PER_HOUR;
            System.out.println("Employee is present and total Wage is : " + empWage);
        }
        else {
            double empWage = 0;
            System.out.println("Employee is absent and total Wage : " + empWage);
        }

    }
}

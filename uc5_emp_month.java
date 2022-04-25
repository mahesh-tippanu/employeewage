package com.bridgelabz.uc5;

public class EmployeeWagePerMonth {

    public static void main(String[] args) {

        final int IS_FULL_TIME = 1;
        final int IS_PART_TIME = 2;
        final int WAGE_PER_HOUR = 20;
        final int WORKING_DAYS_IN_MONTH = 20;
        int empHrs;
        int totalWagePerMonth = 0;


        for (int day = 0; day < WORKING_DAYS_IN_MONTH; day++) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            if (empCheck == IS_FULL_TIME)
                empHrs = 8;
            else if (empCheck == IS_PART_TIME)
                empHrs = 4;
            else
                empHrs = 0;
            int empWage = empHrs * WAGE_PER_HOUR;
            totalWagePerMonth += empWage;
        }
        System.out.println("Total Wage Per Month is : " + totalWagePerMonth);
    }
}

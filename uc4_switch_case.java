package com.bridgelabz.uc4;

public class EmployeeWageBySwitchCase {

    public static int empCheck() {
        return (int) Math.floor(Math.random() * 10) % 3;
    }

    public static void main(String[] args) {

        final int IS_FULL_TIME = 1;
        final int IS_PART_TIME = 2;
        final int WAGE_PER_HOUR = 20;
        int empHrs;

        switch (empCheck()) {
            case IS_FULL_TIME:
                empHrs = 8;
                break;
            case IS_PART_TIME:
                empHrs = 4;
                break;
            default:
                empHrs = 0;
        }
        int empWage = empHrs * WAGE_PER_HOUR;
        System.out.println("Employee Wage is : " + empWage);

    }
}

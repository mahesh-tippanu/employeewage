package com.bridgelabz.uc6;

public class CalculateWagePerMonth {

    public static void main(String[] args) {

        final int IS_FULL_TIME = 1;
        final int IS_PART_TIME = 2;
        final int WAGE_PER_HOUR = 20;
        final int WORKING_DAYS_IN_MONTH = 20;
        final int MAX_HRS_IN_MONTH = 100;


            int empHrs = 0;
            int empWage = 0;
            int totalEmpWage = 0;
            int employeeWorkingHrs = 0;

            for ( int day = 0; day < WORKING_DAYS_IN_MONTH && employeeWorkingHrs < MAX_HRS_IN_MONTH; day++) {
                int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                if (empCheck == IS_FULL_TIME)
                    empHrs = 8;
                else if (empCheck == IS_PART_TIME)
                    empHrs = 4;
                else
                    empHrs = 0;

                empWage = empHrs * WAGE_PER_HOUR;
                totalEmpWage += empWage;
                employeeWorkingHrs += empHrs;
                System.out.println("Number of Days : " + day + " & Number of Working hours :" + employeeWorkingHrs);
                System.out.println("Employee Wage : " + empWage);
            }
            System.out.println("Total Wage : " + totalEmpWage);

    }
}

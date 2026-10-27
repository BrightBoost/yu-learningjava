package com.pluralsight.payrollcalculator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class PayrollApp {
    public static void main(String[] args) {
        try {
            // open the employees.csv file with FileReader
            FileReader fr = new FileReader("employees.csv");

            // create a bufferedreader
            BufferedReader br = new BufferedReader(fr);

            // walk through every line of the file
            String line = br.readLine();

            while((line = br.readLine()) != null) {
                // for every line, split on the |
                String[] employeeElements = line.split(Pattern.quote("|"));

                // with the separate parts, create an employee object
                long employeeId = Long.parseLong(employeeElements[0]);
                String name = employeeElements[1];
                double hoursWorked = Double.parseDouble(employeeElements[2]);
                double payRate = Double.parseDouble(employeeElements[3]);

                Employee employee = new Employee(employeeId, name, hoursWorked, payRate);

                // print the employee object
                System.out.println(employee);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}

package com.pluralsight.payrollcalculator;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PayrollApp {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            // prompt for file to read and write
            System.out.println("Enter the name of the file to process:");
            String fileToProcess = scanner.nextLine();

            System.out.println("Enter the name of the payroll file to create:");
            String payrollFileToCreate = scanner.nextLine();
            // open the employees.csv file with FileReader
            FileReader fr = new FileReader(fileToProcess);
            FileWriter fw = new FileWriter(payrollFileToCreate);

            // create a bufferedreader
            BufferedReader br = new BufferedReader(fr);
            BufferedWriter bw = new BufferedWriter(fw);

            // walk through every line of the file
            String line = br.readLine(); // skipping the first line with column names
            bw.write("id|name|gross pay\n");

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
                bw.write(employee.getCsvString());
                System.out.println(employee);
            }

            br.close();
            bw.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}

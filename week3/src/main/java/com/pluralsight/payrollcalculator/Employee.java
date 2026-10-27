package com.pluralsight.payrollcalculator;

public class Employee {
    // private data members
    private long employeeId;
    private String name;
    private double hoursWorked;
    private double payRate;

    // constructor

    public Employee(long employeeId, String name, double hoursWorked, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }


    // getters and setters

    public long getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", hoursWorked=" + hoursWorked +
                ", payRate=" + payRate +
                ", grossPay=" + getGrossPay() +
                '}';
    }

    public String getCsvString() {
        return employeeId + "|" + name + "|" + getGrossPay() + "\n";
    }

    // getGrossPay method
    public double getGrossPay() {
        return hoursWorked * payRate;
    }
}

package com.pluralsight.assets;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle() {

    }

    public Vehicle(String description, String dateAcquired, BigDecimal originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public BigDecimal getValue() {
        int currentYear = LocalDate.now().getYear();
        int ageCar = currentYear - year;
        BigDecimal value = getOriginalCost();
        if(ageCar > 0 && ageCar <= 3) {
            value = value.multiply(new BigDecimal("0.97"));
        } else if(ageCar > 3 && ageCar <= 6) {
            value = value.multiply(new BigDecimal("0.94"));
        } else if(ageCar > 6 && ageCar <= 10) {
            value = value.multiply(new BigDecimal("0.92"));
        } else {
            value = BigDecimal.valueOf(1000);
        }

        if(odometer > 100_000 && !makeModel.contains("toyota") && !makeModel.contains("honda")) {
            value = value.multiply(new BigDecimal("0.75"));
        }
        return value;

    }

    @Override
    public String toString() {

        return super.toString() + '\'' +
                "makeModel='" + makeModel + '\'' +
                ", year=" + year +
                ", odometer=" + odometer;
    }
}

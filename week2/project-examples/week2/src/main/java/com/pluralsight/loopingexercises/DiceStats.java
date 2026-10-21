package com.pluralsight.loopingexercises;

public class DiceStats {
    private int twoCounter = 0;
    private int fourCounter = 0;
    private int sixCounter = 0;
    private int sevenCounter = 0;

    public int getTwoCounter() {
        return twoCounter;
    }

    public void setTwoCounter(int twoCounter) {
        this.twoCounter = twoCounter;
    }

    public int getFourCounter() {
        return fourCounter;
    }

    public void setFourCounter(int fourCounter) {
        this.fourCounter = fourCounter;
    }

    public int getSixCounter() {
        return sixCounter;
    }

    public void setSixCounter(int sixCounter) {
        this.sixCounter = sixCounter;
    }

    public int getSevenCounter() {
        return sevenCounter;
    }

    public void setSevenCounter(int sevenCounter) {
        this.sevenCounter = sevenCounter;
    }

    public void incrementCounter(int result) {
        if(result == 2) {
            twoCounter++;
        } else if(result == 4) {
            fourCounter++;
        } else if(result == 6) {
            sixCounter++;
        } else if(result == 7) {
            sevenCounter++;
        }
    }

    public void printStats() {
        System.out.println("2s: " + twoCounter);
        System.out.println("4s: " + fourCounter);
        System.out.println("6s: " + sixCounter);
        System.out.println("7s: " + sevenCounter);
    }
}

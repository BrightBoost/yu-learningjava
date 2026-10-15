package com.pluralsight;

public class SwitchExplained {
    public static void main() {
        showSwitchExpression();
        String day = "Thursday";

        switch (day) {
            case "Monday":
                System.out.println("Woohoo it's Monday!");
                break;
            case "Tuesday":
                System.out.println("Aha, it's Tuesday. At least there are discounts.");
                break;
            case "Wednesday":
                System.out.println("It's hump day");
                break;
            case "Thursday":
                System.out.println("It's practically Friday");
                break;
            case "Friday":
                System.out.println("Woohoo it's Friday");
                break;
            case "Saturday":
                System.out.println("It's weekend!");
                break;
            case "Sunday":
                System.out.println("It's still weekend!");
                break;
            default:
                System.out.println("I don't know that day.");
                break;
        }
    }

    public static void showSwitchExpression() {
        String day = "Thursday";

        int dayNumber = switch (day) {
            case "Monday" -> 1;
            case "Tuesday" -> 2;
            case "Wednesday" -> 3;
            case "Thursday" -> 4;
            case "Friday" -> 5;
            case "Saturday" -> 6;
            case "Sunday" -> 7;
            default -> -1;
        };

        System.out.println("Day nr: " + dayNumber);
    }

    public static void lifeWithoutSwitch() {
        String day = "Thursday";

        if(day.equalsIgnoreCase("Monday")) {
            System.out.println("Woohoo it's Monday!");
        } else if(day.equalsIgnoreCase("Tuesday")) {
            System.out.println("Aha, it's Tuesday. At least there are discounts.");
        } else if(day.equalsIgnoreCase("Wednesday")) {
            System.out.println("It's hump day");
        } else if(day.equalsIgnoreCase("Thursday")) {
            System.out.println("It's practically Friday");
        } else if(day.equalsIgnoreCase("Friday")) {
            System.out.println("Woohoo it's Friday");
        } else if(day.equalsIgnoreCase("Saturday")) {
            System.out.println("It's weekend!");
        } else if(day.equalsIgnoreCase("Sunday")) {
            System.out.println("It's still weekend!");
        } else {
            System.out.println("I don't know that day");
        }
    }
}

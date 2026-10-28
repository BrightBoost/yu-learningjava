package com.pluralsight;

import java.util.ArrayList;

public class ArrayListExamples {
    public static void main(String[] args) {
        ArrayList<String> gameNames = new ArrayList<>();
        gameNames.add("duolingo");
        gameNames.add("gta");
        gameNames.add("minecraft");
        gameNames.add("fifa");
        gameNames.add("arc raiders");
        gameNames.add("2K16");
        gameNames.add("cod");

        gameNames.remove(0);


        for(String gameName : gameNames) {
            System.out.println(gameName);
        }

        ArrayList<Integer> nrs = new ArrayList<>();
        nrs.add(5);

    }
}

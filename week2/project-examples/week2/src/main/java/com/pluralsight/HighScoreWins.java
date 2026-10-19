package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HighScoreWins {
    public static void main(String[] args) {
        // prompt the user for the input string
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        // split on the pipe
        // [home:visitor, 21:9]
        String[] inputStringParts = inputString.split(Pattern.quote("|"));

        // for each of the array elements, we split on :
        // [home, visitor]
        // [21, 9]
        String[] teamNames = inputStringParts[0].split(Pattern.quote(":"));
        String[] teamScores = inputStringParts[1].split(Pattern.quote(":"));

        // parse the numbers
        int scoreTeam1 = Integer.parseInt(teamScores[0]);
        int scoreTeam2 = Integer.parseInt(teamScores[1]);

        // see if index 0 or index 1 is bigger
        // print result
        if(scoreTeam1 > scoreTeam2) {
            System.out.println("Winner: " + teamNames[0]);
        } else if(scoreTeam1 < scoreTeam2) {
            System.out.println("Winner: " + teamNames[1]);
        } else {
            System.out.println("Tie!");
        }

    }
}

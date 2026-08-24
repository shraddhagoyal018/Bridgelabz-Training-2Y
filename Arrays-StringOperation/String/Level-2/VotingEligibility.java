package com.gla.Strings.Level2;

import java.util.Scanner;

public class VotingEligibility {
    public static int[] generateAges(int n, int[] ages) {
        int[] studentAges = new int[n];

        for (int i = 0; i < n; i++) {
            studentAges[i] = ages[i];
        }

        return studentAges;
    }
    public static String[][] checkVoting(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                result[i][1] = "Cannot Vote";
            }
            else if (ages[i] >= 18) {
                result[i][1] = "Can Vote";
            }
            else {
                result[i][1] = "Cannot Vote";
            }
        }

        return result;
    }
    public static void display(String[][] result) {

        System.out.println("Age\tVoting Status");
        System.out.println("-----------------------");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t" + result[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 10;
        int[] ages = new int[n];

        System.out.println("Enter age of 10 students:");

        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }
        int[] studentAges = generateAges(n, ages);

        String[][] votingResult = checkVoting(studentAges);

        display(votingResult);

        sc.close();
    }
}

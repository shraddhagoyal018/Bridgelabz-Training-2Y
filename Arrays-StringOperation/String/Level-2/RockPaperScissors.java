package com.gla.Strings.Level2;

import java.util.Scanner;

public class RockPaperScissors {
    public static String getComputerChoice() {

        int choice = (int)(Math.random() * 3);

        if (choice == 0)
            return "Rock";
        else if (choice == 1)
            return "Paper";
        else
            return "Scissors";
    }
    public static String findWinner(String player, String computer) {

        if (player.equals(computer)) {
            return "Draw";
        }

        if ((player.equals("Rock") && computer.equals("Scissors")) ||
                (player.equals("Paper") && computer.equals("Rock")) ||
                (player.equals("Scissors") && computer.equals("Paper"))) {

            return "Player";
        }

        return "Computer";
    }
    public static String[][] calculateStats(int playerWin, int computerWin, int games) {

        String[][] stats = new String[2][3];

        double playerPercentage = (playerWin * 100.0) / games;
        double computerPercentage = (computerWin * 100.0) / games;

        stats[0][0] = "Player";
        stats[0][1] = String.valueOf(playerWin);
        stats[0][2] = String.format("%.2f%%", playerPercentage);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWin);
        stats[1][2] = String.format("%.2f%%", computerPercentage);

        return stats;
    }
    public static void displayResults(String[][] results, String[][] stats) {

        System.out.println("\nGame Results");
        System.out.println("--------------------------------");
        System.out.println("Game\tPlayer\tComputer\tWinner");

        for (int i = 0; i < results.length; i++) {
            System.out.println((i + 1) + "\t" +
                    results[i][0] + "\t" +
                    results[i][1] + "\t" +
                    results[i][2]);
        }

        System.out.println("\nWinning Statistics");
        System.out.println("--------------------------------");
        System.out.println("Player\tWins\tPercentage");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" +
                    stats[i][1] + "\t" +
                    stats[i][2]);
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        String[][] results = new String[games][3];

        int playerWin = 0;
        int computerWin = 0;

        for (int i = 0; i < games; i++) {

            System.out.println("\nGame " + (i + 1));
            System.out.print("Enter your choice (Rock/Paper/Scissors): ");
            String playerChoice = sc.next();

            String computerChoice = getComputerChoice();

            String winner = findWinner(playerChoice, computerChoice);

            if (winner.equals("Player")) {
                playerWin++;
            }
            else if (winner.equals("Computer")) {
                computerWin++;
            }

            results[i][0] = playerChoice;
            results[i][1] = computerChoice;
            results[i][2] = winner;
        }

        String[][] stats = calculateStats(playerWin, computerWin, games);

        displayResults(results, stats);

        sc.close();
    }
}

package com.gla.Strings.Level2;

import java.util.Scanner;

public class ShortestLongestWord {
    public static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }
    public static String[] splitText(String text) {

        int length = findLength(text);
        int words = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                words++;
            }
        }

        String[] result = new String[words];

        String word = "";
        int index = 0;

        for (int i = 0; i < length; i++) {

            if (text.charAt(i) != ' ') {
                word += text.charAt(i);
            } else {
                result[index] = word;
                index++;
                word = "";
            }
        }

        result[index] = word;

        return result;
    }
    public static String[][] getWordLength(String[] words) {

        String[][] data = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(findLength(words[i]));
        }

        return data;
    }
    public static int[] shortestLongest(String[][] data) {

        int shortest = 0;
        int longest = 0;

        for (int i = 1; i < data.length; i++) {

            if (Integer.parseInt(data[i][1]) < Integer.parseInt(data[shortest][1])) {
                shortest = i;
            }

            if (Integer.parseInt(data[i][1]) > Integer.parseInt(data[longest][1])) {
                longest = i;
            }
        }

        return new int[]{shortest, longest};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitText(text);

        String[][] data = getWordLength(words);

        int[] index = shortestLongest(data);

        System.out.println("\nWord\t\tLength");
        System.out.println("----------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + Integer.parseInt(data[i][1]));
        }

        System.out.println("\nShortest Word : " + data[index[0]][0]);
        System.out.println("Length         : " + data[index[0]][1]);

        System.out.println("\nLongest Word  : " + data[index[1]][0]);
        System.out.println("Length         : " + data[index[1]][1]);

        sc.close();
    }
}

package com.gla.Strings.Level3;

import java.util.Scanner;

public class CharacterFrequency {
    public static int[][] findFrequency(String text) {

        int[] frequency = new int[256];
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }
        int count = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                count++;
            }
        }
        int[][] result = new int[count][2];

        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = i;
                result[index][1] = frequency[i];
                index++;
            }
        }

        return result;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        int[][] result = findFrequency(text);

        System.out.println("Character Frequency:");

        for (int i = 0; i < result.length; i++) {
            System.out.println((char) result[i][0] + " : " + result[i][1]);
        }

        sc.close();
    }
}

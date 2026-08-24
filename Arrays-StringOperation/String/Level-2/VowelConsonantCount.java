package com.gla.Strings.Level2;

import java.util.Scanner;

public class VowelConsonantCount {
    public static String checkCharacter(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        if (ch >= 'a' && ch <= 'z') {

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }

        } else {
            return "Not a Letter";
        }
    }
    public static int[] countVowelsConsonants(String text) {

        int[] count = new int[2];
        for (int i = 0; i < text.length(); i++) {

            String result = checkCharacter(text.charAt(i));

            if (result.equals("Vowel")) {
                count[0]++;
            } else if (result.equals("Consonant")) {
                count[1]++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        int[] result = countVowelsConsonants(text);

        System.out.println("Number of Vowels     : " + result[0]);
        System.out.println("Number of Consonants : " + result[1]);

        sc.close();
    }
}

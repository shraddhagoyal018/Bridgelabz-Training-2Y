package com.gla.Strings.Level1;

import java.util.Scanner;

public class CharArrayComparison {
    public static char[] getCharacters(String str) {

        char[] arr = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }

        return arr;
    }
    public static boolean compareArrays(char[] arr1, char[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();
        char[] userArray = getCharacters(text);
        char[] builtInArray = text.toCharArray();
        boolean result = compareArrays(userArray, builtInArray);

        System.out.print("User-defined char array : ");
        for (char ch : userArray) {
            System.out.print(ch + " ");
        }

        System.out.println();

        System.out.print("Built-in char array     : ");
        for (char ch : builtInArray) {
            System.out.print(ch + " ");
        }

        System.out.println();

        System.out.println("Are both arrays equal? " + result);

        sc.close();
    }
    }

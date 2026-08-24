package com.gla.Strings.Level2;

import java.util.Scanner;

public class TrimUsingCharAt {
    public static int[] findTrimIndex(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }
    public static String createSubstring(String str, int start, int end) {
        String result = "";

        for (int i = start; i <= end; i++) {
            result = result + str.charAt(i);
        }

        return result;
    }
    public static boolean compareStrings(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string with leading and trailing spaces:");
        String text = sc.nextLine();
        int[] index = findTrimIndex(text);

        String customTrim = createSubstring(text, index[0], index[1]);
        String builtInTrim = text.trim();
        boolean result = compareStrings(customTrim, builtInTrim);

        System.out.println("String after custom trimming: \"" + customTrim + "\"");
        System.out.println("String after String.trim(): \"" + builtInTrim + "\"");
        System.out.println("Both strings are same: " + result);

        sc.close();
    }
    }

package com.gla.Strings.Level3;

import java.util.Scanner;

public class UniqueCharacters {
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
    public static char[] findUniqueCharacters(String text) {

        int length = findLength(text);

        char[] unique = new char[length];
        int index = 0;
        for (int i = 0; i < length; i++) {

            boolean isUnique = true;
            for (int j = 0; j < i; j++) {

                if (text.charAt(i) == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                unique[index] = text.charAt(i);
                index++;
            }
        }
        char[] result = new char[index];

        for (int i = 0; i < index; i++) {
            result[i] = unique[i];
        }

        return result;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char[] uniqueCharacters = findUniqueCharacters(text);

        System.out.println("Unique characters are:");

        for (int i = 0; i < uniqueCharacters.length; i++) {
            System.out.print(uniqueCharacters[i] + " ");
        }

        sc.close();
    }
    }

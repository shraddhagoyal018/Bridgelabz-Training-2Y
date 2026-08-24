package com.gla.Strings.Level1;

import java.util.Scanner;

public class NumberFormatExceptionDemo {
    public static void generateException(String text) {
        int number = Integer.parseInt(text);
        System.out.println("Number = " + number);
    }
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Number = " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught!");
            System.out.println("Message: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught!");
            System.out.println("Message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String text = sc.next();
        handleException(text);

        sc.close();
    }
}

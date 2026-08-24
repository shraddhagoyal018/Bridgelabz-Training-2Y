package com.gla.Strings.Level3;

import java.util.Scanner;

public class CalculateBMI {
    public static String[] calculateBMI(double weight, double height) {

        String[] result = new String[2];
        double heightInMeter = height / 100;
        double bmi = weight / (heightInMeter * heightInMeter);

        result[0] = String.format("%.2f", bmi);

        if (bmi <= 18.4) {
            result[1] = "Underweight";
        }
        else if (bmi >= 18.5 && bmi <= 24.9) {
            result[1] = "Normal";
        }
        else if (bmi >= 25.0 && bmi <= 39.9) {
            result[1] = "Overweight";
        }
        else {
            result[1] = "Obese";
        }

        return result;
    }
    public static String[][] getBMIData(double[][] personData) {

        String[][] bmiData = new String[personData.length][4];

        for (int i = 0; i < personData.length; i++) {

            String[] bmiResult = calculateBMI(personData[i][0], personData[i][1]);

            bmiData[i][0] = String.valueOf(personData[i][0]);
            bmiData[i][1] = String.valueOf(personData[i][1]);
            bmiData[i][2] = bmiResult[0];
            bmiData[i][3] = bmiResult[1];
        }

        return bmiData;
    }
    public static void display(String[][] bmiData) {

        System.out.println("\nBMI Report");
        System.out.println("------------------------------------------------");
        System.out.println("Weight(kg)\tHeight(cm)\tBMI\tStatus");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < bmiData.length; i++) {

            System.out.println(bmiData[i][0] + "\t\t" +
                    bmiData[i][1] + "\t\t" +
                    bmiData[i][2] + "\t" +
                    bmiData[i][3]);
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int persons = 10;

        double[][] personData = new double[persons][2];

        System.out.println("Enter weight (kg) and height (cm) of 10 persons:");

        for (int i = 0; i < persons; i++) {

            System.out.println("\nPerson " + (i + 1));

            System.out.print("Weight (kg): ");
            personData[i][0] = sc.nextDouble();

            System.out.print("Height (cm): ");
            personData[i][1] = sc.nextDouble();
        }


        String[][] bmiData = getBMIData(personData);

        display(bmiData);

        sc.close();
    }
    }

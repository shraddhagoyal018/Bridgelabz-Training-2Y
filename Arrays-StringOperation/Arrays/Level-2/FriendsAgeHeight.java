package src.com.gla.Arrays.Level2;
import java.util.Scanner;
public class FriendsAgeHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};

        int[] age = new int[3];
        double[] height = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details of " + names[i]);

            System.out.print("Enter age: ");
            age[i] = sc.nextInt();

            System.out.print("Enter height: ");
            height[i] = sc.nextDouble();
        }
        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }

            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }
        System.out.println("\nYoungest friend is: " + names[youngestIndex]);
        System.out.println("Age: " + age[youngestIndex]);

        System.out.println("\nTallest friend is: " + names[tallestIndex]);
        System.out.println("Height: " + height[tallestIndex]);

        sc.close();
    }
}

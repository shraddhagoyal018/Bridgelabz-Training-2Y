import java.util.Scanner;

public class StringBufferConcatinate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuffer result = new StringBuffer();

        System.out.print("How many strings? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter string: ");
            String text = sc.nextLine();
            result.append(text);
        }

        System.out.println("Concatenated string: " + result);

        sc.close();
    }
}
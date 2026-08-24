import java.util.Scanner;

public class removeduplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            boolean alreadyExists = false;

            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == current) {
                    alreadyExists = true;
                    break;
                }
            }

            if (!alreadyExists) {
                result.append(current);
            }
        }

        System.out.println("Without duplicates: " + result);

        sc.close();
    }
}
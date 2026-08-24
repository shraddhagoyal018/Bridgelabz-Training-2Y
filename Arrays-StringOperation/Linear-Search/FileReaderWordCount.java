import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderWordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        System.out.print("Enter word to search: ");
        String target = sc.nextLine();

        int count = 0;

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(fileReader);

            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split(" ");

                for (int i = 0; i < words.length; i++) {
                    if (words[i].equals(target)) {
                        count++;
                    }
                }
            }

            reader.close();

            System.out.println("Word occurs " + count + " times.");
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }

        sc.close();
    }
}
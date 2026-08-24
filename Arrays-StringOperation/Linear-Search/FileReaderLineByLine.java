import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderLineByLine {
    public static void main(String[] args) {
        String fileName = "input.txt";

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(fileReader);

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderFile {
    public static void main(String[] args) {
        String fileName = "input.txt";

        try {
            FileInputStream inputStream =
                    new FileInputStream(fileName);

            InputStreamReader inputReader =
                    new InputStreamReader(inputStream);

            BufferedReader reader =
                    new BufferedReader(inputReader);

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
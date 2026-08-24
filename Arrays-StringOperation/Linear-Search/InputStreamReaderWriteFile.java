import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderWriteFile {
    public static void main(String[] args) {
        try {
            InputStreamReader inputReader =
                    new InputStreamReader(System.in);

            BufferedReader reader =
                    new BufferedReader(inputReader);

            FileWriter fileWriter =
                    new FileWriter("output.txt");

            BufferedWriter writer =
                    new BufferedWriter(fileWriter);

            System.out.println("Enter text.");
            System.out.println("Type exit to stop.");

            String line;

            while (true) {
                line = reader.readLine();

                if (line.equalsIgnoreCase("exit")) {
                    break;
                }

                writer.write(line);
                writer.newLine();
            }

            writer.close();
            reader.close();

            System.out.println("Data saved in output.txt.");
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
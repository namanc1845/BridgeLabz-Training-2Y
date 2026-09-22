import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputToFile {

    public static void main(String[] args) {

        try {

            InputStreamReader isr =
                    new InputStreamReader(System.in);

            BufferedReader br =
                    new BufferedReader(isr);

            FileWriter writer =
                    new FileWriter("output.txt");

            System.out.println(
                    "Enter text. Type exit to stop:");

            while (true) {

                String input = br.readLine();

                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                writer.write(input + "\n");
            }

            writer.close();

            System.out.println(
                    "Data written successfully.");

        }
        catch (IOException e) {

            System.out.println("Error.");
        }
    }
}

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ByteToCharacter {

    public static void main(String[] args) {

        try {

            FileInputStream fis =
                    new FileInputStream("data.txt");

            InputStreamReader isr =
                    new InputStreamReader(fis, "UTF-8");

            BufferedReader br =
                    new BufferedReader(isr);

            String line;

            while ((line = br.readLine()) != null) {

                System.out.println(line);
            }

            br.close();

        }
        catch (IOException e) {

            System.out.println("Error reading file.");
        }
    }
}
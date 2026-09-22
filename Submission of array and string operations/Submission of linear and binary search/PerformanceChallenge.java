import java.io.*;

public class PerformanceChallenge {

    public static void main(String[] args) {

        int n = 1000000;

        // StringBuilder Performance
        long start1 = System.nanoTime();

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < n; i++) {
            builder.append("hello");
        }

        long end1 = System.nanoTime();

        // StringBuffer Performance
        long start2 = System.nanoTime();

        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < n; i++) {
            buffer.append("hello");
        }

        long end2 = System.nanoTime();

        System.out.println(
                "StringBuilder Time: "
                + (end1 - start1));

        System.out.println(
                "StringBuffer Time: "
                + (end2 - start2));

        // FileReader
        try {

            long start3 = System.nanoTime();

            FileReader fr = new FileReader("data.txt");

            BufferedReader br1 = new BufferedReader(fr);

            int wordCount1 = 0;

            String line;

            while ((line = br1.readLine()) != null) {

                String[] words = line.trim().split("\\s+");

                if (!line.trim().isEmpty()) {
                    wordCount1 += words.length;
                }
            }

            br1.close();

            long end3 = System.nanoTime();

            System.out.println(
                    "FileReader Word Count: "
                    + wordCount1);

            System.out.println(
                    "FileReader Time: "
                    + (end3 - start3));


            // InputStreamReader
            long start4 = System.nanoTime();

            FileInputStream fis =
                    new FileInputStream("data.txt");

            InputStreamReader isr =
                    new InputStreamReader(fis);

            BufferedReader br2 =
                    new BufferedReader(isr);

            int wordCount2 = 0;

            while ((line = br2.readLine()) != null) {

                String[] words = line.trim().split("\\s+");

                if (!line.trim().isEmpty()) {
                    wordCount2 += words.length;
                }
            }

            br2.close();

            long end4 = System.nanoTime();

            System.out.println(
                    "InputStreamReader Word Count: "
                    + wordCount2);

            System.out.println(
                    "InputStreamReader Time: "
                    + (end4 - start4));

        }
        catch (IOException e) {

            System.out.println("File error.");
        }
    }
}
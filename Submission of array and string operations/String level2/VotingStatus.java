public class VotingStatus {

    public static int[] generateAges(int number) {

        int[] ages = new int[number];

        for (int i = 0; i < number; i++) {
            ages[i] = 10 + (int)(Math.random() * 90);
        }

        return ages;
    }

    public static String[][] checkVoting(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                result[i][1] = "false";
            } else if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }

        return result;
    }

    public static void display(String[][] data) {

        System.out.println("Age\tCan Vote");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {

        int[] ages = generateAges(10);

        String[][] result = checkVoting(ages);

        display(result);
    }
}
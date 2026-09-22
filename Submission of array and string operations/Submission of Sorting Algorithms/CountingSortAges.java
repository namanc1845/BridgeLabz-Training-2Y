import java.util.Arrays;

public class CountingSortAges {
    public static void main(String[] args) {

        int[] ages = {12, 15, 10, 18, 14, 12, 16};

        int[] count = new int[19];

        for (int i = 0; i < ages.length; i++) {
            count[ages[i]]++;
        }

        int index = 0;

        for (int age = 10; age <= 18; age++) {

            while (count[age] > 0) {

                ages[index] = age;
                index++;

                count[age]--;
            }
        }

        System.out.println("Sorted Ages: "
                + Arrays.toString(ages));
    }
}
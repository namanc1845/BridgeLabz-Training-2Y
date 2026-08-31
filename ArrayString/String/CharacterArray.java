import java.util.Scanner;

public class CharacterArray {

    public static char[] getCharacters(String str) {
        char[] characters = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            characters[i] = str.charAt(i);
        }

        return characters;
    }

    public static boolean compareArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        char[] result1 = getCharacters(str);
        char[] result2 = str.toCharArray();

        boolean result = compareArrays(result1, result2);

        System.out.println("User-defined method result: " + new String(result1));
        System.out.println("toCharArray() method result: " + new String(result2));
        System.out.println("Both arrays are equal: " + result);
    }
}
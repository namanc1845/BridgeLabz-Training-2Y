import java.util.Scanner;

public class StringToCharacters {

    public static char[] getCharacters(String text) {

        char[] characters = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            characters[i] = text.charAt(i);
        }

        return characters;
    }

    public static boolean compareArrays(char[] arr1, char[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();

        char[] userArray = getCharacters(text);
        char[] builtInArray = text.toCharArray();

        System.out.println("Both arrays are same: "
                + compareArrays(userArray, builtInArray));

        sc.close();
    }
}
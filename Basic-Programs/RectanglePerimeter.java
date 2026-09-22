import java.util.Scanner;

class RectanglePerimeter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int length, width, perimeter;

        System.out.print("Enter length: ");
        length = sc.nextInt();

        System.out.print("Enter width: ");
        width = sc.nextInt();

        perimeter = 2 * (length + width);

        System.out.println("Perimeter of rectangle = " + perimeter);
    }
}

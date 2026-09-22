import java.util.Scanner;

public class CylinderVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input radius and height
        System.out.print("Enter the radius of the cylinder: ");
        double radius = sc.nextDouble();

        System.out.print("Enter the height of the cylinder: ");
        double height = sc.nextDouble();

        // Calculate volume
        double volume = Math.PI * radius * radius * height;

        // Display result
        System.out.println("The volume of the cylinder is: " + volume);

        sc.close();
    }
}


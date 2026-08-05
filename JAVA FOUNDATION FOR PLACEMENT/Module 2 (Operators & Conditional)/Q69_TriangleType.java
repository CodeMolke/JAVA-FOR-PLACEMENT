import java.util.Scanner;

public class Q69_TriangleType {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Side 1: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter Side 2: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter Side 3: ");
        double side3 = scanner.nextDouble();

        // Check if triangle is valid
        if (side1 + side2 > side3 &&
            side2 + side3 > side1 &&
            side1 + side3 > side2) {

            if (side1 == side2 && side2 == side3) {
                System.out.println("Equilateral Triangle");
            }
            else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("Isosceles Triangle");
            }
            else {
                System.out.println("Scalene Triangle");
            }

        } else {
            System.out.println("Triangle is Not Valid");
        }

        scanner.close();
    }
}
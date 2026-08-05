import java.util.Scanner;

public class Q68_TriangleValidity {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Side 1 : ");
    double side1 = scanner.nextDouble();
    System.out.print("Enter Side 2 : ");
    double side2 = scanner.nextDouble();
    System.out.print("Enter Side 3 : ");
    double side3 = scanner.nextDouble();
    if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
      System.out.println("Triangle is Valid");
    } else {
      System.out.println("Traingle is Not Valid");
    }
    scanner.close();

  }
}

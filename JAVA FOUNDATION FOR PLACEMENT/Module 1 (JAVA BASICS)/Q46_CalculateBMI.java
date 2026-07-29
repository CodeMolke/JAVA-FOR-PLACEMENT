import java.util.Scanner;

public class Q46_CalculateBMI {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Weight in Kg : ");
    double weight = scanner.nextDouble();
    System.out.print("Enter Height in Meter : ");
    double height = scanner.nextDouble();
    double bmi = weight / Math.pow(height, 2);
    System.out.println("Weight : " + weight);
    System.out.println("Height : " + height);
    System.out.println("BMI    : " + bmi);
    scanner.close();
  }

}

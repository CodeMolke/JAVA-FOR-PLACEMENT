import java.util.Scanner;

public class Q47_ElectricityBillCalculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Units : ");
    double units = scanner.nextDouble();
    System.out.print("Enter Rate Per Unit : ");
    double ratePerUnit = scanner.nextDouble();
    double bill = units * ratePerUnit;
    System.out.println("Units         : " + units);
    System.out.println("Rate Per Unit : " + ratePerUnit);
    System.out.println("Total Bill    : " + bill);
    scanner.close();
  }

}

import java.util.Scanner;

public class Q50_BankInterestCalculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Principal : ");
    double principal = scanner.nextDouble();
    System.out.print("Enter Rate : ");
    double rate = scanner.nextDouble();
    System.out.print("Enter Time : ");
    double time = scanner.nextDouble();
    double interest = principal * rate * time / 100;
    double totalAmount = principal + interest;
    System.out.println("Principal : " + principal);
    System.out.println("Rate : " + rate);
    System.out.println("Time : " + time);
    System.out.println("Interest : " + interest);
    System.out.println("Total Amount : " + totalAmount);
    scanner.close();

  }

}

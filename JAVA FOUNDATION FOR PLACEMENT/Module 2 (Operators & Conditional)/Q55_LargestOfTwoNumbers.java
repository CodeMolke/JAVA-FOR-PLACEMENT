import java.util.Scanner;

public class Q55_LargestOfTwoNumbers {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter First Number  : ");
    int firstNumber = scanner.nextInt();
    System.out.print("Enter Second Number : ");
    int secondNumber = scanner.nextInt();
    if (firstNumber == secondNumber) {
      System.out.println("Both Numbers Are Equal");
    } else if (firstNumber > secondNumber) {
      System.out.println("Largest Number : " + firstNumber);
    } else {
      System.out.println("Largest Number : " + secondNumber);
    }
    scanner.close();
  }
}

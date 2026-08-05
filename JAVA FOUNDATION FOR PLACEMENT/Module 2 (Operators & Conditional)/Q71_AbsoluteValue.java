import java.util.Scanner;

public class Q71_AbsoluteValue {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Number : ");
    int number = scanner.nextInt();
    if (number >= 0) {
      System.out.println("Absolute : " + number);

    } else {
      System.out.println("Absolute : " + -number);
    }

    scanner.close();
  }

}
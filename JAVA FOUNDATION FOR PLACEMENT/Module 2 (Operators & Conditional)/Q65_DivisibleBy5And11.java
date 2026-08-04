import java.util.Scanner;

public class Q65_DivisibleBy5And11 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Number : ");
    int number = scanner.nextInt();
    if (number % 5 == 0 && number % 11 == 0) {
      System.out.println(number + " is Divisible by 5 and 11 ");
    } else {
      System.out.println(number + " is Not Divisible By by 5 and 11 ");
    }
    scanner.close();
  }
}

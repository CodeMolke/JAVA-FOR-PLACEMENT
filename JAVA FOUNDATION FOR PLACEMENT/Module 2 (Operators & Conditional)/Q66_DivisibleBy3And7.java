import java.util.Scanner;

public class Q66_DivisibleBy3And7 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Number : ");
    int number = scanner.nextInt();
    if (number % 3 == 0 && number % 7 == 0) {
      System.out.println(number + " is Divisible by 3 and 7 ");
    } else {
      System.out.println(number + " is Not Divisible by 3 and 7 ");
    }
    scanner.close();
  }
}

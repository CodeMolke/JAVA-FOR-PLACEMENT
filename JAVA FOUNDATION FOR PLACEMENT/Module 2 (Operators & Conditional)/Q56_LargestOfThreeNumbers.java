import java.util.Scanner;;

public class Q56_LargestOfThreeNumbers {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter First Number  : ");
    int firstNumber = scanner.nextInt();
    System.out.print("Enter Second Number : ");
    int secondNumber = scanner.nextInt();
    System.out.print("Enter Third Number  : ");
    int thirdNumber = scanner.nextInt();
    if (firstNumber == secondNumber && secondNumber == thirdNumber) {
      System.out.println("All Numbers are Equal");
    } else if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
      System.out.println("Largest Number : " + firstNumber);

    } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
      System.out.println("Largest Number : " + secondNumber);

    } else {
      System.out.println("Largest Number : " + thirdNumber);
    }

    scanner.close();

  }
}

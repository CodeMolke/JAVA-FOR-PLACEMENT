import java.util.Scanner;

public class Q70_FindGreatestUsingTernary {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter First Number:");
    int firstNumber = scanner.nextInt();
    System.out.print("Enter Second Number:");
    int secondNumber = scanner.nextInt();
    if (firstNumber == secondNumber) {
      System.out.println("Both are Equal");
    } else {
      int greatest = (firstNumber > secondNumber) ? firstNumber : secondNumber;
      System.out.println("Greatest : " + greatest);

    }

    scanner.close();

  }

}

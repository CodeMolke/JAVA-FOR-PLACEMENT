import java.util.Scanner;

public class Q39_MultipleUserInputs {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Your Name : ");
    String name = scanner.nextLine();
    System.out.print("Enter Your Age : ");
    int age = scanner.nextInt();
    System.out.println("Name : " + name);
    System.out.println("Age  : " + age);
    scanner.close();

  }

}

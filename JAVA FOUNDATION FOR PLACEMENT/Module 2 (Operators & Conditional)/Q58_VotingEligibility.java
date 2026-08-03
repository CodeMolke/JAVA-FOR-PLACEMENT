import java.util.Scanner;

public class Q58_VotingEligibility {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Age : ");
    int age = scanner.nextInt();
    if (age >= 18) {
      System.out.println("Eligible for Voting");
    } else {
      System.out.println("Not Eligible for Voting");
    }
    scanner.close();
  }

}

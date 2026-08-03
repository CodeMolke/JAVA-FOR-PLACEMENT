import java.util.Scanner;

public class Q60_GradeCalculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Marks : ");
    double marks = scanner.nextDouble();
    if (marks < 0 || marks > 100) {
      System.out.println("Invalid Marks");

    } else if (marks >= 90) {
      System.out.println("Grade : A+");
    } else if (marks >= 80) {
      System.out.println("Grade : A");
    } else if (marks >= 70) {
      System.out.println("Grade : B");
    } else if (marks >= 60) {
      System.out.println("Grade : C");
    } else if (marks >= 50) {
      System.out.println("Grade : D");
    } else if (marks >= 40) {
      System.out.println("Grade : Pass");
    } else {
      System.out.println("Grade : Fail");
    }
    scanner.close();
  }

}

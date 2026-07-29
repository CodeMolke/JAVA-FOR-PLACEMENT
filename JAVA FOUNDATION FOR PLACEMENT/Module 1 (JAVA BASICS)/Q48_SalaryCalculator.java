import java.util.Scanner;

public class Q48_SalaryCalculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Basic Salary : ");
    double basicSalary = scanner.nextDouble();
    System.out.print("Enter Bonus : ");
    double bonus = scanner.nextDouble();
    System.out.print("Enter Deductions : ");
    double deductions = scanner.nextDouble();
    double netSalary = basicSalary + bonus - deductions;
    System.out.println("Basic Salary : " + basicSalary);
    System.out.println("Bonus        : " + bonus);
    System.out.println("Deductions   : " + deductions);
    System.out.println("Net Salary   : " + netSalary);
    scanner.close();
  }

}

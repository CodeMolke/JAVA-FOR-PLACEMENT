import java.util.Scanner;

public class Q51_EmployeeSalarySlip {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Employee Name : ");
    String employeeName = scanner.nextLine();
    System.out.print("Enter Basic Salary  : ");
    double basicSalary = scanner.nextDouble();
    System.out.print("Enter HRA           : ");
    double hra = scanner.nextDouble();
    System.out.print("Enter Bonus         : ");
    double bonus = scanner.nextDouble();
    System.out.print("Enter Deduction     : ");
    double deductions = scanner.nextDouble();
    double grossSalary = basicSalary + hra + bonus;
    double netSalary = grossSalary - deductions;
    System.out.println("Employee Name : " + employeeName);
    System.out.println("Basic Salary  : " + basicSalary);
    System.out.println("HRA           : " + hra);
    System.out.println("Bonus         : " + bonus);
    System.out.println("Deduction     : " + deductions);
    System.out.println("Gross Salary  : " + grossSalary);
    System.out.println("Net Salary    : " + netSalary);

    scanner.close();

  }

}

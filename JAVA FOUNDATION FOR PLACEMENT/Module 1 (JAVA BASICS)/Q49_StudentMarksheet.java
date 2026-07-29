import java.util.Scanner;;

public class Q49_StudentMarksheet {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Student Name : ");
    String studentName = scanner.nextLine();
    System.out.println("Enter Subject 1 Marks : ");
    double subject1 = scanner.nextDouble();
    System.out.println("Enter Subject 2 Marks : ");
    double subject2 = scanner.nextDouble();
    System.out.println("Enter Subject 3 Marks : ");
    double subject3 = scanner.nextDouble();
    System.out.println("Enter total marks : ");
    double totalMarks = scanner.nextDouble();
    double totalMarksObtain = subject1 + subject2 + subject3;
    double percentage = totalMarksObtain / totalMarks * 100;
    System.out.println("Student Name : " + studentName);
    System.out.println("Subject 1    : " + subject1);
    System.out.println("Subject 2    : " + subject2);
    System.out.println("Subject 3    : " + subject3);
    System.out.println("Total        : " + totalMarksObtain);
    System.out.println("Percentage   : " + percentage);
    scanner.close();
  }

}

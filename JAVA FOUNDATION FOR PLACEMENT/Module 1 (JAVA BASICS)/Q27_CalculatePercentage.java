public class Q27_CalculatePercentage {
  public static void main(String[] args) {
    double subject1 = 85;
    double subject2 = 90;
    double subject3 = 78;
    double subject4 = 88;
    double subject5 = 92;
    double total = subject1 + subject2 + subject3 + subject4 + subject5;
    double percentage = (total / 500) * 100;
    System.out.println("Subject 1  : " + subject1);
    System.out.println("Subject 2  : " + subject2);
    System.out.println("Subject 3  : " + subject3);
    System.out.println("Subject 4  : " + subject4);
    System.out.println("Subject 5  : " + subject5);
    System.out.println("Total      : " + total);
    System.out.println("Percentage : " + percentage);

  }

}

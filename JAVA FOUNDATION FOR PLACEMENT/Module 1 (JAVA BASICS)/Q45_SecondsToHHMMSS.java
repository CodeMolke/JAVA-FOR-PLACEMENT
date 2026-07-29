import java.util.Scanner;

public class Q45_SecondsToHHMMSS {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Total Seconds : ");
    int totalSeconds = scanner.nextInt();
    int hours = totalSeconds / 3600;
    int remainingSeconds = totalSeconds % 3600;
    int minutes = remainingSeconds / 60;
    int seconds = remainingSeconds % 60;
    System.out.println("Total Seconds : " + totalSeconds);
    System.out.println("Hours         : " + hours);
    System.out.println("Minutes       : " + minutes);
    System.out.println("Seconds       : " + seconds);
    scanner.close();

  }

}

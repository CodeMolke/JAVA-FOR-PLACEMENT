import java.util.Scanner;

public class Q44_MeterToKilometer {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Meter     : ");
    double meter = scanner.nextDouble();
    double kilometer = meter / 1000;
    System.out.println("Kilometer : " + kilometer);
    scanner.close();

  }

}

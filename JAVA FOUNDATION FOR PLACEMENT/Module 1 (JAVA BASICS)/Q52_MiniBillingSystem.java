import java.util.Scanner;

public class Q52_MiniBillingSystem {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Product Name : ");
    String productName = scanner.nextLine();
    System.out.print("Enter Price        : ");
    double price = scanner.nextDouble();
    System.out.print("Enter Quantity     : ");
    int quantity = scanner.nextInt();
    double totalBill = quantity * price;
    System.out.println("Product Name : " + productName);
    System.out.println("Price        : " + price);
    System.out.println("Quantity     : " + quantity);
    System.out.println("Total Bill   : " + totalBill);

    scanner.close();

  }

}

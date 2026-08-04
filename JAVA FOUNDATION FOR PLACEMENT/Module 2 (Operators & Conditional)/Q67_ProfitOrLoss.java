import java.util.Scanner;

public class Q67_ProfitOrLoss {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Cost Price : ");
    double costPrice = scanner.nextDouble();
    System.out.print("Enter Selling Price : ");
    double sellingPrice = scanner.nextDouble();
    double profit = sellingPrice - costPrice;
    double loss = costPrice - sellingPrice;
    if (sellingPrice > costPrice) {
      System.out.println("Profit : " + profit);
    } else if (costPrice > sellingPrice) {
      System.out.println("Loss : " + loss);
    } else {
      System.out.println("No Profit No Loss");
    }

    scanner.close();
  }
}

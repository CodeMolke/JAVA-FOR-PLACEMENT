public class Q41_CurrencyConverter {
  public static void main(String[] args) {
    double usd = 100.0;
    double exchangeRate = 83.0;
    double inr = usd * exchangeRate;
    System.out.println("USD Amount    : " + usd);
    System.out.println("Exchange Rate : " + exchangeRate);
    System.out.println("INR Amount    : " + inr);
  }

}

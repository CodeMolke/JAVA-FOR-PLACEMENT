public class Q10_CompoundInterest {
  public static void main(String[] args) {

    double principal = 10000;
    double rate = 5;
    double time = 2;
    double amount = principal * Math.pow((1 + rate / 100), time);
    double compoundInterest = amount - principal;
    System.out.println("Principal         : " + principal);
    System.out.println("Rate              : " + rate);
    System.out.println("Time              : " + time);
    System.out.println("Amount            : " + amount);
    System.out.println("Compound Interest : " + compoundInterest);
  }

}

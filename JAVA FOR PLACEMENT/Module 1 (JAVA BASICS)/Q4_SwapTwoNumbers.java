public class Q4_SwapTwoNumbers {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    int temp;
    System.out.println("Before Swapping");
    System.out.println("First Number  : " + a);
    System.out.println("Second Number : " + b);
    temp = a;
    a = b;
    b = temp;
    System.out.println("After Swapping");
    System.out.println("First Number  : " + a);
    System.out.println("Second Number : " + b);

  }
}
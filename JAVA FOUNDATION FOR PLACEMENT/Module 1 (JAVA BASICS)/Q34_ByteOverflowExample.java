public class Q34_ByteOverflowExample {
  public static void main(String[] args) {
    byte number = 127;
    byte result = number;
    System.out.println("Original Value : " + number);
    System.out.println("After Overflow : " + ++result);
  }

}

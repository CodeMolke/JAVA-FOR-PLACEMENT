public class Q31_FindFirstDigit {
  public static void main(String[] args) {
    int number = 9876;
    System.out.println("Number      : " + number);
    int temp = number;
    int lastDigit = temp % 10;
    temp = temp / 10;
    int secondLastDigit = temp % 10;
    temp = temp / 10;
    int thirdLastDigit = temp % 10;
    temp = temp / 10;
    int firstDigit = temp % 10;
    System.out.println("First Digit       : " + firstDigit);
    System.out.println("Second Last Digit : " + secondLastDigit);
    System.out.println("Third Last Digit  : " + thirdLastDigit);
    System.out.println("Last Digit        : " + lastDigit);

  }

}

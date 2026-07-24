public class Q29_ReverseThreeDigit_NoLoop {
  public static void main(String[] args) {
    int num = 123;
    System.out.println("Number  : " + num);
    int temp = num;
    int lastDigit = temp % 10;
    temp = temp / 10;
    int middleDigit = temp % 10;
    temp = temp / 10;
    int firstDigit = temp % 10;
    int reverse = lastDigit * 100 + middleDigit * 10 + firstDigit;
    System.out.println("Reverse : " + reverse);
  }

}

import java.util.Scanner;

public class Q64_CharacterIsDigitOrAlphabet {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Character : ");
    char character = scanner.next().charAt(0);
    if (character >= 'A' && character <= 'Z' || character >= 'a' && character <= 'z') {
      System.out.println(character + " is an Alphabet");
    } else if (character >= '0' && character <= '9') {
      System.out.println(character + " is a Digit");
    } else {
      System.out.println(character + " is neither Digit nor Alphabet ");
    }

    scanner.close();
  }
}

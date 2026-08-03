import java.util.Scanner;

public class Q63_CharacterIsUppercaseOrLowercase {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Character : ");
    char character = scanner.next().charAt(0);
    if (character >= 'A' && character <= 'Z') {
      System.out.println(character + " is a Uppercase Letter");
    } else if (character >= 'a' && character <= 'z') {
      System.out.println(character + " is a Lowercase Letter");
    } else {
      System.out.println(character + " is not an Alphabet");
    }
    scanner.close();
  }

}

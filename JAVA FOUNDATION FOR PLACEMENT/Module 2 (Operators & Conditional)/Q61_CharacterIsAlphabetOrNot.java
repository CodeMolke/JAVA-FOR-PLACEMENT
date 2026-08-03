import java.util.Scanner;

public class Q61_CharacterIsAlphabetOrNot {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Character : ");
    char character = scanner.next().charAt(0);
    if (character >= 'A' && character <= 'Z' || character >= 'a' && character <= 'z') {
      System.out.println(character + " is an Alphabet ");
    } else {
      System.out.println(character + " is Not an Alphabet");
    }

    scanner.close();
  }

}

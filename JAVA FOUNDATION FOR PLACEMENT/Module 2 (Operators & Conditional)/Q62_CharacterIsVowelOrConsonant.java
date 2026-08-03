import java.util.Scanner;

public class Q62_CharacterIsVowelOrConsonant {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Character : ");
    char character = scanner.next().charAt(0);
    if (character >= 'A' && character <= 'Z' || character >= 'a' && character <= 'z') {
      System.out.println(character + " is an Alphabet ");
      if (character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U'
          || character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
        System.out.println(character + " is a Vowel ");

      } else {

        System.out.println(character + " is a Consonant ");
      }

    } else {
      System.out.println(character + " is not an Alphabet");
    }
    scanner.close();
  }

}

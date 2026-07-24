public class Q5_SimpleCalculator {
  public static void main(String[] args) {
    int a = 20;
    int b = 10;
    char operator = '+';
    System.out.println("First Number              : " + a);
    System.out.println("Second Number             : " + b);
    switch (operator) {
      case '+':
        System.out.println("Addition of Two Number is : " + (a + b));

        break;
      case '-':
        System.out.println("Subtraction of Two Number is : " + (a - b));

        break;
      case '/':
        if (b == 0) {
          System.out.println(" Cannot Divide By Zero ");
        } else {
          System.out.println("Division of Two Number is : " + (a / b));
        }
        break;
      case '*':
        System.out.println("Multiplication of Two Number is : " + (a * b));
        break;
      case '%':
        if (b == 0) {
          System.out.println(" Cannot Modulus By Zero ");
        } else {
          System.out.println("Modulus of Two Number is : " + (a % b));
        }
        break;

      default:
        System.out.println("Invalid Operator");
        break;
    }
  }

}

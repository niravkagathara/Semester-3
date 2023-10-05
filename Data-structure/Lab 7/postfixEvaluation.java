import java.util.Scanner;
import java.util.Stack;

public class postfixEvaluation {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Stack<Integer> Stack = new Stack<>();
    System.out.print("Enter postfix String: ");
    String str = sc.next();
    int i = 0;

      char nextChar = str.charAt(i++);
      int digit = 0;
      while (nextChar != ',') {
        digit = (digit*10) + (int) (nextChar - '0');
        nextChar = str.charAt(i++);
      }
      System.out.println(digit);
      Stack.push(digit);
  }

  static int Evaluate(int operand2, int operand1, char nextChar) {
    switch (nextChar) {
      case '+':
        return operand2 + operand1;
      case '-':
        return operand2 - operand1;
      case '*':
        return operand2 * operand1;
      case '^':
        return operand2 ^ operand1;
      case '/':
        return operand2 / operand1;
      default:
        System.out.println("Invalid String");
        return -1;
    }
  }
}

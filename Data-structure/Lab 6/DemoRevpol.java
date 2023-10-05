import java.util.Scanner;
import java.util.Stack;

public class DemoRevpol {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Stack<Character> stack = new Stack<>();
    System.out.print("Enter Infix String: ");
    String str = sc.next();
    String revreseInfix = "";
      for (int i = str.length() - 1; i >= 0; i--) {
        revreseInfix += str.charAt(i);
      }
    str = "(" + revreseInfix + ")" + " ";
    String Revpol = "";
    char nextChar;
    int i = 0;
    int rank = 0;
    stack.push('(');
    nextChar = str.charAt(i++);
    while(nextChar != ' ') {
      while (gPrecedence(stack.peek()) > fPrecedence(nextChar)) {
        char temp = stack.pop();
        Revpol = Revpol + temp;
        rank += calculateRank(temp);
        if (rank < 1) {
            System.out.println("String Invalid");
            System.exit(0);
        }
      }

      if (gPrecedence(stack.peek()) != fPrecedence(nextChar)) {
        stack.push(nextChar);
      } else {
        stack.pop();
      }
      nextChar = str.charAt(i++);
    }
    String ReverseRevpol = "";
    for (int j = Revpol.length(); j>=0; j--) {
        ReverseRevpol += Revpol.charAt(j);
    }
    System.out.println(ReverseRevpol);
    sc.close();
  }

  static int calculateRank(char temp) {
		if (Character.isLetter(temp)) {
			return 1;
		} else {
			return -1;
		}
	}

  static int gPrecedence(char sTop) {
    if (sTop == '+' || sTop == '-') {
      return 2;
    } else if (sTop == '*' || sTop == '/') {
      return 4;
    } else if (sTop == '^' || sTop == '$') {
      return 5;
    } else if (sTop == '(') {
      return 0;
    } else if (Character.isLetter(sTop)) {
      return 8;
    } else {
      System.exit(0);
      return -1;
    }
  }

  static int fPrecedence(char nextChar) {
    if (nextChar == '+' || nextChar == '-') {
      return 1;
    } else if (nextChar == '*' || nextChar == '/') {
      return 3;
    } else if (nextChar == '^' || nextChar == '$') {
      return 6;
    } else if (nextChar == '(') {
      return 9;
    } else if (nextChar == ')') {
      return 0;
    } else if(Character.isLetter(nextChar)) {
      return 7;
    }
    else {
        System.exit(0);
        return -1;
    }
  }
}
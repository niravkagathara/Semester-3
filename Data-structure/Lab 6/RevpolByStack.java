import java.util.Scanner;
import java.util.Stack;

public class RevpolByStack {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Type postfix or prefix to choose: ");
    String choice = sc.next().toLowerCase();
    System.out.print("Enter Infix String: ");
    String Infix = sc.next();
    if (choice.equals("postfix")) {
      Infix = "(" + Infix + ")" + " ";
      Logic l = new Logic(Infix, choice);
    } else if (choice.equals("prefix")) {
      String revreseInfix = "";
      for (int i = Infix.length() - 1; i >= 0; i--) {
        if (Infix.charAt(i) == '(') {
          revreseInfix += ')';
        } else if (Infix.charAt(i) == ')') {
          revreseInfix += '(';
        } else {
          revreseInfix += Infix.charAt(i);
        }
        revreseInfix = "(" + revreseInfix + ")" + " ";
      }

      Logic l = new Logic(revreseInfix, choice);
    } else {
      System.out.println("You must write correct spelling.");
    }
  }
}

class Logic {

  String FinalString;
  String choice;

  Logic(String str, String choice) {
    this.choice = choice;
    FinalString = str;
    Stack<Character> stack = new Stack<>();
    String Revpol = "";
    char nextChar;
    int i = 0;
    int rank = 0;
    stack.push('(');
    nextChar = FinalString.charAt(i++);
    while (nextChar != ' ') {
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
      nextChar = FinalString.charAt(i++);
    }
    if (choice.equals("postfix")) {
      System.out.println(Revpol);
    } else if (choice.equals("prefix")) {
      String ReverseRevpol = "";
      for (int j = Revpol.length() - 1; j >= 0; j--) {
        ReverseRevpol += Revpol.charAt(j);
      }
      System.out.println(ReverseRevpol);
    }
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
    } else if (Character.isLetter(nextChar)) {
      return 7;
    } else {
      System.exit(0);
      return -1;
    }
  }
}

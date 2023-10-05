import java.util.Scanner;
public class Revpol {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Infix String: ");
    String S = sc.nextLine();

    int Slength = S.length(); //(a+b-d/c)
    char a[] = new char[Slength + 10];
    String revpol = "";
    char nextChar;
    a[0] = '(';
    char pop;
    int top = 0, rank = 0;
    int i = 0;
    nextChar = S.charAt(i);
    while (nextChar != ' ' && i < Slength) {
      nextChar = S.charAt(i);
      while (gPrecedence(a[top]) > fPrecedence(nextChar)) {
        char temp = a[top + 1];
        revpol += temp;
        a[top + 1] = nextChar;

        if (
          nextChar == '+' ||
          nextChar == '-' ||
          nextChar == '/' ||
          nextChar == '*' ||
          nextChar == '^' ||
          nextChar == '$'
        ) {
          rank -= 1;
        } else {
          rank += 1;
        }

        if (rank < 1) {
          System.out.println("Invalid String");
        }

        if (gPrecedence(a[top]) != fPrecedence(nextChar)) {
          a[top] = nextChar;
        } else {
          pop = a[top];
          top--;
        }
      }
      i++;
    }
    

    System.out.println("Revpol: " + revpol);
  }

  static int gPrecedence(char sTop) {
    if (sTop == '+' || sTop == '-') {
      return 2;
    } else if (sTop == '*' || sTop == '/') {
      return 4;
    } else if (sTop == '^') {
      return 5;
    } else if (sTop == '(') {
      return 9;
    } else if (sTop == ')') {
      return 0;
    } else {
      return 8;
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
    } else {
      return 7;
    }
  }
}

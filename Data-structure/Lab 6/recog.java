import java.util.Scanner;

public class recog {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter String: ");
    String S = sc.next().toLowerCase();
    int clocation = (S.length() / 2);
    String Cbefore = "", Cafter = "";
    char next;

    if (S.charAt(clocation) != 'c') {
      System.out.println(
        "-------------------------------------\nString Invalid C is not at middle\n-------------------------------------"
      );
    } else {
      for (int i = 0; i < S.length() / 2; i++) {
        next = S.charAt(i);
        if (next != 'c' && next != ' ') {
          Cbefore += next;
        }
      }

      for (int i = clocation + 1; i < S.length(); i++) {
        next = S.charAt(i);
        if (next != 'c' && next != ' ') {
          Cafter += next;
        }
      }

      String reverseCafter = "";
      for (int i = 0; i < Cafter.length(); i++) {
        reverseCafter = Cafter.charAt(i) + reverseCafter;
      }

      if (Cbefore.equals(reverseCafter)) {
        System.out.println(
          "----------------------------------\nString Valid after full procedure\n----------------------------------"
        );
      } else {
        System.out.println(
          "-------------------------------------\nString Invalid after full procedure\n-------------------------------------"
        );
      }
      sc.close();
    }
  }
}

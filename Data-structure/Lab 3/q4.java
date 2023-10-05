import java.util.Scanner;

public class q4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number: ");
    int n = sc.nextInt();
    int a[] = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    int temp = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (a[j] > a[j + 1]) {
          temp = a[j];
          a[j] = a[j + 1];
          a[j + 1] = temp;
        }
      }
    }

    System.out.print("Enter number you want to delete: ");
    int num = sc.nextInt();

    sc.close();

    for (int i = 0; i < a.length; i++) {
      if (a[i] == num) {
        a[i] = a[i + 1];
        temp = i;
      } else if ((i + 1) > temp) {
        a[i - 1] = a[i];
      }
    }

    for (int i = 0; i < a.length-1 ; i++) {
      System.out.println(a[i]);
    }
  }
}

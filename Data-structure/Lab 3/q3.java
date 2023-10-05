import java.util.Scanner;

public class q3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number: ");
    int n = sc.nextInt();
    int a[] = new int[n];
    int b[] = new int[n + 1];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    System.out.print("Enter number you want to insert: ");
    int num = sc.nextInt();

    sc.close();

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

    for (int i = 0; i <a.length; i++) {
      for (int j = 0; j < b.length; j++) {
        if (a[i] <= num) {
          b[i] = a[i];
          b[i + 1] = num;
        } else {
          b[i + 1] = a[i];
        }
      }
    }

    System.out.println("Your array is: ");
    for (int i = 0; i < b.length; i++) {
      System.out.println(b[i]);
    }
  }
}

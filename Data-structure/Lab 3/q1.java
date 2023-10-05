import java.util.Scanner;

public class q1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number: ");
    int n = sc.nextInt();
    int a[] = new int[n];
    int b[] = new int[n + 1];

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    System.out.print("Enter that number you want to insert in the array: ");
    int num = sc.nextInt();
    System.out.print("Enter the index in the array: ");
    int ind = sc.nextInt();

    int temp;

    for (int i = 0; i < b.length; i++) {
      if (i == ind) {
        b[i] = num;
      } else if ((i + 1) > ind) {
        b[i] = a[i - 1];
      } else {
        b[i] = a[i];
      }
    }

    for (int i = 0; i < b.length; i++) {
      System.out.println(b[i] + " ");
    }
    sc.close();
  }
}

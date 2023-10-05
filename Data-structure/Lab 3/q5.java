import java.util.Scanner;

public class q5 {

  public static void main(String[] args) {
    int n1, n2, temp;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of elements for first array: ");
    n1 = sc.nextInt();
    int a[] = new int[n1];
    System.out.println("Enter number of elements for second array: ");
    n2 = sc.nextInt();
    int b[] = new int[n2];
    temp = n1 + n2;
    int c[] = new int[temp];
    System.out.println("Enter elements of first array: ");
    for (int i = 0; i < n1; i++) {
      a[i] = sc.nextInt();
      c[i] = a[i];
    }

    System.out.println("Enter elements of first array: ");
    for (int i = 0; i < n2; i++) {
      b[i] = sc.nextInt();
        for (int j = 0; j < c.length; j++) {
            c[n1+i] = b[i];
        }
    }
    System.out.println("Your array after merge: ");
    for (int i = 0; i < c.length; i++) {
        System.out.print(c[i]+" ");
    }
    System.out.println();
    int swapper = 0;
    for (int i = 0; i < temp; i++) {
      for (int j = 0; j < temp - i - 1; j++) {
        if (c[j] > c[j + 1]) {
          swapper = c[j];
          c[j] = c[j + 1];
          c[j + 1] = swapper;
        }
      }
    }
    System.out.println("Unsorterd arrays Merged and also sorted: ");
    for (int i = 0; i < c.length; i++) {
        System.out.print(c[i]+" ");
    }
  }
}

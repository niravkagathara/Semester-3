import java.util.Scanner;

public class q6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 2 for 2x2 // 3 for 3x3 and so on: ");
    int n = sc.nextInt();
    int a[][] = new int[n][n];
    int b[][] = new int[n][n];

    System.out.print("Enter  elements of matrix one: ");
    for (int i = 0; i < n; i++) {
      for(int j = 0; j < n; j++){
        a[i][j] = sc.nextInt();
      }
    }
    int c[][] = new int[n][n];

    System.out.print("Enter  elements of matrix two: ");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
          b[i][j] = sc.nextInt();
      }
    }
    
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        c[i][j] = a[i][j] + b[i][j];
      }
    }

    System.out.println("Summation of matrices is : ");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
          System.out.print(c[i][j]+" ");
      }
      System.out.println();
    }
  }
}

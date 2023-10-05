import java.util.Scanner;

public class q7 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter rows of first matrix: ");
    int row1 = sc.nextInt();
    System.out.print("Enter cols of first matrix: ");
    int col1 = sc.nextInt();

    int a[][] = new int[row1][col1];
    System.out.print("Enter rows of second matrix: ");
    int row2 = sc.nextInt();
    System.out.print("Enter rows of second matrix: ");
    int col2 = sc.nextInt();

    int b[][] = new int[row2][col2];

    if (row1 == col2) {
      int ans[][] = new int[row1][col2];

      System.out.println("Enter elements of matrix one: ");
      for (int i = 0; i < row1; i++) {
        for (int j = 0; j < col1; j++) {
          a[i][j] = sc.nextInt();
        }
      }
      System.out.println("Enter elements of matrix two: ");
      for (int i = 0; i < row2; i++) {
        for (int j = 0; j < col2; j++) {
          b[i][j] = sc.nextInt();
        }
      }

      for (int i = 0; i < row1; i++) {
        for (int j = 0; j < col2; j++) {
          for (int k = 0; k < row2; k++) {
            ans[i][j] += a[i][k] * b[k][j];
          }
        }
      }
      for (int i = 0; i < row1; i++) {
        for (int j = 0; j < col2; j++) {
          System.out.print(ans[i][j]+" ");
        }
        System.out.println();
      }
    }
  }
}

import java.util.Scanner;

public class q5 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number: ");
    int n = sc.nextInt();
    int a[] = new int[n];
    int b[] = new int[n];
    int top = 0;

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
      if (i>0) {
        if (a[i] == a[i-1]) {
        b[top] = a[i];
        top++;
      }
      }
    }
    sc.close();
    
    System.out.print("Duplicate value/values: ");
    for (int i = 0; i < top; i++) {
      System.out.print(b[i] + " ");
    }
  }
}

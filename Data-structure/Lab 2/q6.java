import java.util.Scanner;

public class q6 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number: ");
    int n = sc.nextInt();
    int a[] = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    System.out.print("Enter that number which is already in the array: ");
    int a1 = sc.nextInt();
    System.out.print("Enter that number you want to replace in the array: ");
    int b1 = sc.nextInt();
    
    for (int i = 0; i < n; i++) {
        if (a[i]==a1) {
            a[i] = b1;
            System.out.println("Index of replaced number is: "+i);
        }
    }
    System.out.println("Array after changes: ");
    for (int i = 0; i < n; i++) {
        System.out.println(a[i]);
    }
  }
}

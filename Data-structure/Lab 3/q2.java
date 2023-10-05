import java.util.Scanner;

public class q2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number: ");
    int n = sc.nextInt();
    int a[] = new int[n+1];

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    System.out.print("Enter the index from where you want to delete from the array: ");
    int del = sc.nextInt();

    for (int i = 0; i < a.length; i++) {
      if (i == del) {
        a[i] = a[i+1];
      } else if((i+1)>del){
        a[i-1] = a[i];
      }
      else{
        a[i] = a[i];
      }
    }

    for (int i = 0; i < a.length-2; i++) {
      System.out.println(a[i] + " ");
    }
    sc.close();
  }
}

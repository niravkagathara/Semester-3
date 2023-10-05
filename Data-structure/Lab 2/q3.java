import java.util.Scanner;

public class q3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double avg = 0;
    System.out.println("Enter number: ");
    int n = sc.nextInt();
    sc.close();
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += i;
    }
    avg = sum/n;
    System.out.print("Avg from 1 to "+n+" is : "+avg);
  }
}

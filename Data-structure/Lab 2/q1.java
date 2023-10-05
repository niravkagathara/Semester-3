import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int [n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        System.out.print("Your elements: ");
        for (int i = 0; i < n; i++) {
                System.out.print(a[i]+ " ");
        }
    }
}

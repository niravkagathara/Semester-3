import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int min = 10000000;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();

            if (a[i]<min) {
                min = a[i];
            }
        }
        sc.close();
        System.out.print("Minimum element among your numbers is : "+min);
    }
}

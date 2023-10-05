import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting: ");
        int a = sc.nextInt();
        System.out.print("Enter ending: ");
        int b = sc.nextInt();
        sc.close();
        int ans = 0;

        if (a>b) {
            for (int i = b; i <= a; i++) {
                ans += i;
            }
        } else if (b>a) {
            for (int i = a; i <= b; i++) {
                ans += i;
            }
        }
        System.out.print("Summation of "+a+" to "+b+" is : "+ ans);
    }
}

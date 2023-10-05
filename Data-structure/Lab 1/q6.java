import java.util.Scanner;
public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int a = sc.nextInt();
        System.out.print("Enter Power: ");
        int b = sc.nextInt();
        sc.close();
        int ans = 1;
        for (int i = 1; i <= b; i++) {
            ans *= a;
        }
        System.out.println("Answer is : "+ ans);
    }
}

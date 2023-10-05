import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        sc.close();
        int ans = loc(n);
        System.out.print("Factorial = "+ ans);
    }

    static int loc(int n){
        if (n==0 || n==1) {
            return n;
        }
        else{
            return n*loc(n-1);
        }
    }
}

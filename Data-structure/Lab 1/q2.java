import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        sc.close();
        if (n%2==0) {
            System.out.println("Entered number is Even.");
        } else {
            System.out.println("Entered number is odd.");
        }
    }
}

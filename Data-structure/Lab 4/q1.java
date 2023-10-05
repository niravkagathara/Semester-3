import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();
        Swapper(n1, n2);
    }

    static void Swapper(int n1, int n2){
        int temp;
        temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("------------------------------");
        System.out.println("updated first number: "+n1);
        System.out.println("updated second number: "+n2);
    }
}

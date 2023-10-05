import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int a[] = {45, 23, 1, 45, 74, 56};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find: ");
        int key = sc.nextInt();

        for(int i = 0; i< a.length; i++){
            if (a[i] == key) {
                System.out.println("Element found at: "+i);
                break;
            }
        }
        sc.close();
    }
}

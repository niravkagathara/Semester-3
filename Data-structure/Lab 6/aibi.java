import java.util.Scanner;

public class aibi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =sc.next().toLowerCase();
        int count=0;
        char next;
        for (int i = 0; i < str.length(); i++) {
            next = str.charAt(i);

            if (next == 'a') {
                count++;
            } else if (next == 'b') {
                count--;
            }
            else{
                count++;
            }
        }
        if (count == 0) {
            System.out.println("String Valid");
        } else {
            System.out.println("String Invalid");
        }
        sc.close();
    }
}
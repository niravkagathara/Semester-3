import java.util.Scanner;

public class q1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter radius: ");
    double radius = sc.nextInt();
    sc.close();
    System.out.println("Area of circle having radius " + radius + " is " + Area(radius));
  }

  static double Area(double radius) {
    return 3.14 * radius * radius;
  }
}

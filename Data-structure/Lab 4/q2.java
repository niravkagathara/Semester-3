import java.util.Scanner;

public class q2 {

  public static void main(String[] args) {
    EmpDetails e1 = new EmpDetails();
    e1.GetEmployeeDetails();
    e1.DisplayEmployeeDetails();
  }
}

class EmpDetails {

  Scanner sc = new Scanner(System.in);
  int Employee_ID, Age;
  double Salary;
  String Employee_Name, Designation;

  void GetEmployeeDetails() {
    System.out.println("-----------------------------------");
    System.out.print("Employee_ID: ");
    Employee_ID = sc.nextInt();
    System.out.print("Employee_Name: ");
    Employee_Name = sc.next();
    System.out.print("Age: ");
    Age = sc.nextInt();
    System.out.print("Designation: ");
    Designation = sc.next();
    System.out.print("Salary: ");
    Salary = sc.nextDouble();
  }

  void DisplayEmployeeDetails() {
    System.out.println("-----------------------------------");
    System.out.println("Employee_ID: " + Employee_ID);
    System.out.println("Employee_Name: " + Employee_Name);
    System.out.println("Age: " + Age);
    System.out.println("Designation: " + Designation);
    System.out.println("Salary: " + Salary);
  }
}

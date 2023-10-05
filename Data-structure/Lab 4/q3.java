import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Student_Details sd = new Student_Details();
        sd.read_Stu();
        sd.Display_Stu();
    }
}

class Student_Details{
    Scanner sc = new Scanner(System.in);
    int Enrollment_No, semester;
    String Name;
    double cpi;

    Student_Details[] a = new Student_Details[5];

    void read_Stu(){
        for (int i = 0; i < 5; i++) {
            a[i] = new Student_Details();
            a[i].Enrollment_No = sc.nextInt();
            a[i].semester = sc.nextInt();
            a[i].cpi = sc.nextDouble();
            a[i].Name = sc.next();   
        }
    }

    void Display_Stu(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Enroll No: " +a[i].Enrollment_No);
            System.out.println("Semester : "+a[i].semester );
            System.out.println("CPI      :" +a[i].cpi);
            System.out.println("Name    :"+a[i].Name);
        }
    }
}
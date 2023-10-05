import java.util.Scanner;

public class Stactprog {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of array: ");
    int size = sc.nextInt();
    logic s = new logic(size);

    while (true) {
      System.out.print(
        "Enter 1 for push  2 for pop 3 for peep 4 for change 5 for display and 6 to exit: "
      );
      int n = sc.nextInt();
      switch (n) {
        case 1:
          s.push();
          break;
        case 2:
          s.pop();
          break;
        case 3:
          s.peep();
          break;
        case 4:
          s.change();
          break;
        case 5:
          s.display();
          break;
        case 6:
          System.exit(6);
          break;
      }
    }
  }
}

class logic {

  Scanner sc = new Scanner(System.in);

  int size;
  int a[];
  int top = -1;

  logic(int size) {
    this.size = size;
    a = new int[size];
  }

  void push() {
    top++;
    if (top < size) {
      System.out.println("Enter the element you want to push: ");
      int pushn = sc.nextInt();
      a[top] = pushn;
      
    } else {
      top--;
      System.out.println("---------------\nStack Overflow\n---------------");
    }
  }

  void pop() {
    if (top>=0) {
      System.out.println("Element poped: "+a[top]);
    top--;  
    }else{
      System.out.println("---------------\nStack Underflow\n---------------");
    }
    
  }

  void peep() {
    System.out.print("Enter the index to get the value: ");
      int iposi = sc.nextInt();
    if (iposi <= top+1) {
      System.out.println("Element at position " + iposi + " is: " + a[(top - iposi) + 1]);
    }
    else{
      System.out.println("---------------\nStack Underflow\n---------------");
    }
  }

  void change() {
    System.out.print("Enter the index to change the element: ");
    int iposi = sc.nextInt();

    if (iposi <= size) {
    System.out.print("Enter the element you want to change: ");
    int xele = sc.nextInt();
    a[(top - iposi) + 1] = xele;
    System.out.println(
      "Element at position " + iposi + " is changed(Agar bharosa nhi hea to dekhke aa)"
    );
    } else {
      System.out.println("---------------\nStack Underflow\n---------------");
    }
  }

  void display() {
    System.out.println(
      "------------------------\nYour Stack looks like: \n------------------------"
    );

    for (int i = top; i >= 0; i--) {
      System.out.println(a[i] +" "+i);
    }
  }
}

import java.util.Scanner;

public class CQueuebyArray {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of array: ");
    int size = sc.nextInt();
    sc.close();
    logic l = new logic(size);

    while (true) {
      System.out.print("Enter 1 to Enqueue 2 to Dequeue and 3 to Display: ");
      int n = sc.nextInt();
      switch (n) {
        case 1:
          l.CIREnque();
          break;
        case 2:
          l.CIRDeque();
          break;
        case 3:
          l.CIRDisplay();
          break;
        case 0:
          System.exit(0);
          break;
      }
    }
  }
}

class logic {

  Scanner sc = new Scanner(System.in);
  int size, rear = 0, front = -1, a[];

  logic(int size) {
    this.size = size;
    a = new int[size];
  }

  void CIREnque() {
    if (rear == size && front > 0) {
      rear = 0;
    }

    if (rear == front || rear >= size) {
      System.out.println("---------------\nQueue Overflow\n---------------");
    } else {
      System.out.print("Enter the element to insert: ");
      int cqin = sc.nextInt();
      a[rear] = cqin;
      rear++;
      if (rear == front || rear >= size) {
        front = 0;
        rear = 0;
      }
    }
    if (front == -1) {
      front = 0;
    }
  }

  void CIRDeque() {
    if (rear == size && front > 0) {
      rear = 0;
    }
    if (front == -1) {
      System.out.println("---------------\nQueue Underflow\n---------------");
    } else {
      System.out.println("Element deleted: " + a[front]);
      a[front] = 0;
      front++;
      if (front == size || front == -1) {
        rear = 0;
        front = -1;
      }
    }
  }
  void CIRDisplay() {
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }
    System.out.println();
  }
}
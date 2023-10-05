import java.util.Scanner;

public class queuebyArray {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of array: ");
    int size = sc.nextInt();
    logic l = new logic(size);
    while (true) {
      System.out.print("Enter 1 to Enqueue 2 to Dequeue and 3 to Display: ");
      int n = sc.nextInt();
      switch (n) {
        case 1:
          l.Enque();
          break;
        case 2:
          l.Deque();
          break;
        case 3:
          l.Display();
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
  int size, rear = 0, front = 0, a[];

  logic(int size) {
    this.size = size;
    a = new int[size];
  }

  void Enque() {
    if (front == size && rear == size) {
      front = rear = 0;
    }
    if (rear < size) {
      System.out.print("Enter the element to insert: ");
      int cqin = sc.nextInt();
      a[rear] = cqin;
      rear++;
    } else {
      System.out.println("---------------\nQueue Overflow\n---------------");
    }
  }

  void Deque() {
    if (front < size && front != rear) {
      System.out.println("Element deleted: "+a[front]);
      a[front] = 0;
      front++;
    }
    else{
      System.out.println("---------------\nQueue Underflow\n---------------");
    }
  }

  void Display() {
    
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }
    System.out.println();
  }
}

//System.out.println("Front: "+front +" Rear: "+ rear);

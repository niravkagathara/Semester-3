import java.util.Scanner;

public class CircularLL {

  static Scanner sc = new Scanner(System.in);
  static Node head, tail;
  static int size = 0;

  // Inserting element at First position
  static void InsertFirst(int Info) {
    Node Node = new Node(Info);
    if (head == null) {
      head = Node;
      tail = head;
      tail.Next = Node;
    } else {
      tail.Next = Node;
      tail = Node;
      Node.Next = head;
    }
    size++;
  }

  // Inserting element at Last position
  static void InsertLast(int Info) {
    Node Node = new Node(Info);
    tail.Next = Node;
    tail = Node;
    Node.Next = head;

    size++;
  }

  // Deleting element from Specified position
  static int DeleteSpecified() {
    System.out.print("Enter index less than " + size + ": ");
    int Index = sc.nextInt();
    int deletedVal;
    Node pred = null, shift = head;
    if (Index == 1) {
      System.out.println("Element deleted: " + head.Info);
      deletedVal = head.Info;
      head = head.Next;
      tail.Next = head;
    } else if (Index == size) {
      System.out.println("Element deleted: " + tail.Info);
      deletedVal = tail.Info;
      for (int i = 1; i < size; i++) {
        pred = shift;
        shift = shift.Next;
      }
      pred.Next = head;
    } else {
      for (int i = 1; i <= Index; i++) {
        pred = shift;
        shift = shift.Next;
      }
      deletedVal = shift.Info;
      System.out.println("Element deleted: " + shift.Info);
      pred.Next = shift.Next;
    }
    size--;
    return deletedVal;
  }

  //Display all the nodes
  static void Display() {
    if (head == null) {
      System.out.println("Empty head");
    } else {
      Node disp = head;
      while (true) {
        System.out.println(disp.Info + " -> " + disp.Next);
        if (disp.Next == head) {
          break;
        }
        disp = disp.Next;
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int Info = 0;
    System.out.print(
      "1 to INSERT at FIRST,\n2 to INSERT at LAST,\n3 to DISPLAY,\n4 to DELETE FROM INDEX\n"
    );
    while (true) {
      
      System.out.print("Enter choice: ");
      int n = sc.nextInt();
      if (n == 1 || n == 2) {
        System.out.print("Enter Element to Insert: ");
        Info = sc.nextInt();        
      }
      switch (n) {
        case 1:
          InsertFirst(Info);
          break;
        case 2:
          InsertLast(Info);
          break;
        case 3:
          Display();
          break;
        case 4:
          DeleteSpecified();
          break;
        case 0:
          sc.close();
          System.exit(0);
          break;
      }
    }
  }
}
class Node {

  int Info;
  Node Next;

  Node(int Info) {
    this.Info = Info;
    this.Next = null;
  }
}
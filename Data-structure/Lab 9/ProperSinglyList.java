import java.util.Scanner;

public class ProperSinglyList {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Logic L = new Logic();
    System.out.print(
      "1 to INSERT at FIRST,\n2 to INSERT at LAST,\n3 to DELETE at FIRST,\n4 to DELETE at LAST,\n5 to DISPLAY\n"
    );

    while (true) {
      System.out.print("Enter choice: ");
      int n = sc.nextInt();

      switch (n) {
        case 1:
          L.InsertFirst();
          break;
        case 2:
          L.InsertLast();
          break;
        case 3:
          L.DeleteFirst();
          break;
        case 4:
          L.DeleteLast();
          break;
        case 5:
          L.DeleteSpecified();
          break;
        case 6:
          L.Display();
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

class Logic {

  int size = 0;

  Scanner sc = new Scanner(System.in);
  Node head, tail;

  //Insert at First position of list
  void InsertFirst() {
    System.out.print("Enter the node to insert: ");
    int Info = sc.nextInt();
    Node Node = new Node(Info);
    Node.Next = head;

    if (head == null && tail == null) {
      tail = Node;
      Node.Next = null;
      head = Node;
    } else {
      Node.Next = head;
      head = Node;
    }
    size += 1;
  }

  //Insert at Last position of list
  void InsertLast() {
    System.out.print("Enter the node to insert: ");
    int Info = sc.nextInt();
    Node Node = new Node(Info);
    tail.Next = Node;
    tail = Node;
    size += 1;
  }

  //Display all the nodes
  void Display() {
    Node disp = head;
    while (disp != null) {
      System.out.println(disp.Info + " -> " + disp.Next);
      disp = disp.Next;
    }
    // for(int i = 0; i < size; i++) {
    //   System.out.println(disp.Info + " -> " + disp.Next);
    //   disp = disp.Next;
    // }
  }

  //Delete the element from first
  void DeleteFirst() {
    if (head == null) {
      System.out.println("Linked List is Empty.");
    } else {
      System.out.println("Element Deleted: " + head.Info);
      head = head.Next;
      size -= 1;
    }
  }

  //Delete the element from last
  void DeleteLast() {
    Node shift = head;
    Node pred = null;

    if (head == null) {
      System.out.println("Linked List is Empty.");
    } else {
      while (shift.Next != null) {
        pred = shift;
        shift = shift.Next;
      }
      System.out.println("Element Deleted: " + shift.Info);
      pred.Next = null;
      size -= 1;
    }
  }

  //Delete From specified position

  void DeleteSpecified() {
    if (head == null) {
      System.out.println("Linked List is Empty.");
    } else {
      System.out.print("Enter index less than " + size + ": ");
      int Index = sc.nextInt();
      if (Index == 1) {
        DeleteFirst();
      } else if (Index == size) {
        DeleteLast();
      } else if(Index > 1 && Index < size){
        Node shift = head;
        Node pred = null;

        for (int i = 1; i < Index; i++) {
          pred = shift;
          shift = shift.Next;
        }
        pred.Next = shift.Next;
        System.out.println("Element Deleted: " + shift.Info);
      }
      else
      {
        System.out.println("Java dey Loda.Aukaat ma re");
      }
    }
  }
}
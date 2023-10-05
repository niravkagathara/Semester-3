import java.util.Scanner;

public class DoublyLL {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DoublyLogic Logic = new DoublyLogic();

    System.out.print(
            "1 to INSERT at FIRST,\n2 to INSERT at LAST,\n3 to DELETE SPECIFIED,\n4 to DISPLAY\n"
          );
    while (true) {
        System.out.print("Enter Choice: ");
        int n = sc.nextInt();
      switch (n) {
        case 1:Logic.InsertFirst();break;
        case 2:Logic.InsertLast();break;
        case 3:Logic.DeleteSpecified();break;
        case 4:Logic.Display();break;
        case 0:sc.close();System.exit(0);
      }
    }
  }
}

class Node {

  int Info;
  Node Lptr;
  Node Rptr;

  Node(int Info) {
    this.Info = Info;
    this.Lptr = null;
    this.Rptr = null;
  }
}

class DoublyLogic {

  Scanner sc = new Scanner(System.in);
  Node head;
  Node tail;
  int size = 0;

  void InsertFirst() {
    System.out.print("Enter element to insert: ");
    int Info = sc.nextInt();
    Node Node = new Node(Info);

    if (head == null) {
      head = Node;
      tail = Node;
    } else {
      Node.Rptr = head;
      head.Lptr = Node;
      head = Node;
    }

    size++;
  }

  void InsertLast() {
    System.out.print("Enter element to insert: ");
    int Info = sc.nextInt();
    Node Node = new Node(Info);

    tail.Rptr = Node;
    Node.Lptr = tail;
    tail = Node;

    size++;
  }

  //Deleting a Node from specified Index
  void DeleteSpecified() {
    System.out.println("Enter Index less than " + size + ": ");
    int Index = sc.nextInt();
    Node shift = head;
    Node pred = null;

    if (Index == 1) {
        head = head.Rptr;
        head.Lptr = null;
        Display();
    } else if (Index == size) {
        tail = tail.Lptr;
        tail.Rptr = null;
        Display();
    } else {
      for (int i = 1; i < Index; i++) {
        pred = shift;
        shift = shift.Rptr;
      }
      pred.Rptr = shift.Rptr;
      shift.Rptr.Lptr = pred;
      Display();
    }
    size--;

  }

  //Display all the nodes
  void Display() {
    Node disp = head;
    while (disp != null) {
      System.out.print(disp.Info);
      if(disp.Rptr != null){
        System.out.print(" <--> ");
      }
      disp = disp.Rptr;
    }
    System.out.println();
  }
}
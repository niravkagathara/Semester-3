import java.util.Scanner;

public class QueueUsingSinglyList {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Queue Queue = new Queue();

    while (true) {
      System.out.print(
        "Enter 1 to Insert 2 to Delete and 3 to Display and 0 to Exit: "
      );
      int n = sc.nextInt();
      switch (n) {
        case 1:
          System.out.print("Enter element to insert: ");
          int in = sc.nextInt();
          Queue.InsertInQueue(in);
          break;
        case 2:
          Queue.DeleteInQueue();
          break;
        case 3:
          Queue.Display();
          break;
        case 0:
          System.exit(0);
      }
    }
  }
}

class Queue {

  Node head, tail;
  int size;

  Queue() {
    this.size = 0;
  }

  class Node {

    int Info;
    Node Next;

    Node(int Info) {
      this.Info = Info;
      this.Next = null;
    }
  }

  void InsertInQueue(int Info) {
    Node Node = new Node(Info);
    if (head == null) {
      head = Node;
      tail = Node;
    }
    else{
      tail.Next = Node;
      tail = Node;
    }
    size++;
  }

  void DeleteInQueue() {
    if (head == null) {
        System.out.println("Queue is Empty");
    }
    else{
        System.out.println("Element deleted: "+head.Info);
        head=head.Next;
    }
  }

  void Display() {
    Node Disp = head;
    while (Disp != null) {
      System.out.println(Disp.Info + " -> " + Disp.Next);
      Disp = Disp.Next;
    }
    System.out.println("END");
  }
}
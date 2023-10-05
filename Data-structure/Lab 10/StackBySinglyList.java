import java.util.Scanner;

class StackBySinglyList {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Stack Stack = new Stack();
    while (true) {
      System.out.print("Enter 1 to Enqueue 2 to Dequeue and 3 to Display: ");
      int n = sc.nextInt();
      switch (n) {
        case 1:
          System.out.print("Enter the element to insert: ");
          int Info = sc.nextInt();
          Stack.Push(Info);
          break;
        case 2:
          Stack.Pop();
          break;
        case 3:
          Stack.Display();
          break;
        case 0:
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

class Stack {

  Node head;
  Node tail;
  int size = 0;
  
  void Push(int Info) {
    Node Node = new Node(Info);
    if (head == null) {
      head = Node;
      tail = Node;
    }
    else{
      tail.Next = Node;
      tail = Node;
    }
    size += 1;
  }

  void Pop() {
    Node save = head;
    Node pred = null;

    if (size <= 1) {
      System.out.println("Element deleted: " + head.Info);
      System.out.println(size);
    } else {
      while (save.Next != null) {
        pred = save;
        save = save.Next;
      }
      System.out.println("Element deleted: " + save.Info);
      System.out.println(size);
    }

    if (save == head) {
      head = null;
    } else {
      tail = pred;
      tail.Next = null;
    }

    size -= 1;
  }

  void Display() {
    Node disp = head;

    while (disp != null) {
      System.out.print(disp.Info + " -> ");
      disp = disp.Next;
    }
    System.out.println("END");
    // for(int i = 0; i < size; i++) {
    //   System.out.println(disp.Info + " -> " + disp.Next);
    //   disp = disp.Next;
    // }
  }
}

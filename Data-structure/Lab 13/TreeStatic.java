public class TreeStatic {
    public static void main(String[] args) {
        Node n1 =  new Node();
        n1.Info = 12;
        n1.Left = null;
        n1.Right = null;

        Node root = n1;

        Node n2 =  new Node();
        n2.Info = 15;
        n2.Left = null;
        n2.Right = null;

        if (n2.Info < root.Info) {
            root.Left = n2;
        }
        else{
            root.Right = n2;
        }

        Node n3 =  new Node();
        n3.Info = 18;
        n3.Left = null;
        n3.Right = null;
        
        if (n3.Info < root.Info) {
            root.Left = n3;
        }
        else{
            root.Right = n3;
        }
        
        Node n4 =  new Node();
        n4.Info = 20;
        n4.Left = null;
        n4.Right = null;

        Node current = root;
        
        while (current.Left != null || current.Right != null) {
            if(n4.Info < current.Info) {
                current = current.Left;
            }
            else{
                current = current.Right;
            }
        }
        if (n4.Info < current.Info) {
            current.Left = n4;
        }
        else{
            current.Right = n4;
        }

    }    
}

class Node {
    int Info;
    Node Left;
    Node Right;
}

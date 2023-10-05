
import java.util.Scanner;

public class TreeJaate {
    static Node root = null;
    static class Node{
        int Info;
        Node left;
        Node right;

        Node(int Info){
            this.Info = Info;
        }
    }

    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if (val < root.Info) {
            root.left = insert(root.left, val);
        }
        else{
            root.right = insert(root.right, val);
        }

        return root;
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        while (true) {
            System.out.print("1 to INSERT, 2 to DELETE, 3 TO TRAVERSE: ");
            int n = sc.nextInt();

            if (n == 1) {
                System.out.println("Enter Node: ");
                int val = sc.nextInt();
                root = insert(root, val);
            }
            else if (n == 2) {
                
            }

            else if (n == 3) {
                System.out.println("IN for INORDER\nPOST for POSTORDER\nPRE for PREORDER");
                String check = sc.next();
                switch (check) {
                    case "IN":
                        inorder(root);
                        break;
                    case "POST": Postorder(root);
                        break;
                    case "PRE": Preorder(root);
                        break;    
                    default:  System.out.println("Galti kayko karta hea, thik se likhna bidu.");
                        break;
                }
            }

            else if (n == 0) {
                System.exit(0);
            }
        }
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.Info+" ");
        inorder(root.right);
    }

    public static void Preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.Info+" ");
        Preorder(root.left);
        Preorder(root.right);
    }

    public static void Postorder(Node root){
        if(root == null){
            return;
        }
        
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.Info+" ");
    }
}

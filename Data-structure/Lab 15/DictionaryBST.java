class Node {
    int key;
    String value;
    Node left;
    Node right;

    public Node(int key, String value) {
        this.key = key;
        this.value = value;
        left = null;
        right = null;
    }
}

public class DictionaryBST {

    private Node root;

    DictionaryBST() {
        root = null;
    }

    public static void main(String[] args) {
        DictionaryBST dictionary = new DictionaryBST();

        dictionary.insert(1, "One");
        dictionary.insert(2, "Two");
        dictionary.insert(3, "Three");
        dictionary.insert(4, "Four");
        dictionary.insert(5, "Five");
        dictionary.insert(6, "Six");

        System.out.println("Value for key 6: " + dictionary.search(6));
        System.out.println("Value for key 4: " + dictionary.search(4));
    }

    public void insert(int key, String value) {
        root = insertRec(root, key, value);
    }

    private Node insertRec(Node root, int key, String value) {
        if (root == null) {
            root = new Node(key, value);
            return root;
        }

        if (key < root.key) {
            root.left = insertRec(root.left, key, value);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key, value);
        }

        return root;
    }

    public String search(int key) {
        Node result = searchRec(root, key);
        return (result != null) ? result.value : null;
    }

    private Node searchRec(Node root, int key) {
        if (root == null || root.key == key) {
            return root;
        }

        if (key < root.key) {
            return searchRec(root.left, key);
        }

        return searchRec(root.right, key);
    }

    
}

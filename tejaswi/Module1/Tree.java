
class BST {
    class Node {
        int val;
        Node left, right;
    
        Node(int val) {
            this.val = val;
            left = right = null;
        }
    }
    Node root;

    void insert(int val) {
        root = insertRec(root, val);
    }

    Node insertRec(Node root, int val) {
        if (root == null) return new Node(val);
        if (val < root.val) root.left = insertRec(root.left, val);
        else if (val > root.val) root.right = insertRec(root.right, val);
        return root;
    }

    void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node root) {
        if(root == null){
            return;
        }

        
    }
}

public class Tree {
    public static void main(String[] args) {
        BST tree = new BST();
        int[] values = {50, 30, 20, 40, 70, 60, 80};
        for (int val : values) tree.insert(val);

        tree.inorder(); // Output will be: 20 30 40 50 60 70 80
    }
}

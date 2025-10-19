package Tree;

class Node {
    int key, height;
    Node left, right;

    Node(int d) {
        key = d;
        height = 1;
    }
}

public class tree {

    private Node root;

    // Get height of a node
    private int height(Node N) {
        if (N == null)
            return 0;
        return N.height;
    }

    // Get balance factor
    private int getBalance(Node N) {
        if (N == null)
            return 0;
        return height(N.left) - height(N.right);
    }

    // Right rotate subtree rooted with y
    private Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x; // New root
    }

    // Left rotate subtree rooted with x
    private Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        // Update heights
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y; // New root
    }

    // Insert a key in the AVL tree
    private Node insert(Node node, int key) {
        // 1. Perform normal BST insertion
        if (node == null)
            return new Node(key);

        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);
        else
            return node; // Duplicates not allowed

        // 2. Update height
        node.height = 1 + Math.max(height(node.left), height(node.right));

        // 3. Get balance factor
        int balance = getBalance(node);

        // 4. Balance the tree
        // Case 1 - Left Left
        if (balance > 1 && key < node.left.key)
            return rightRotate(node);

        // Case 2 - Right Right
        if (balance < -1 && key > node.right.key)
            return leftRotate(node);

        // Case 3 - Left Right
        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Case 4 - Right Left
        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node; // unchanged
    }

    // Wrapper insert
    public void insert(int key) {
        root = insert(root, key);
    }

    // Inorder traversal (sorted order)
    public void inorder() {
        inorderTraversal(root);
        System.out.println();
    }

    private void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.key + " ");
            inorderTraversal(node.right);
        }
    }

    // Find minimum value node
    private Node minValueNode(Node node) {
        Node current = node;
        while (current.left != null)
            current = current.left;
        return current;
    }

    // Delete a key
    private Node delete(Node root, int key) {
        if (root == null)
            return root;

        if (key < root.key)
            root.left = delete(root.left, key);
        else if (key > root.key)
            root.right = delete(root.right, key);
        else {
            // Node with one child or no child
            if ((root.left == null) || (root.right == null)) {
                Node temp = null;
                if (root.left != null)
                    temp = root.left;
                else
                    temp = root.right;

                if (temp == null) {
                    root = null;
                } else {
                    root = temp;
                }
            } else {
                // Node with two children
                Node temp = minValueNode(root.right);
                root.key = temp.key;
                root.right = delete(root.right, temp.key);
            }
        }

        // If only one node
        if (root == null)
            return root;

        // Update height
        root.height = Math.max(height(root.left), height(root.right)) + 1;

        // Balance the tree
        int balance = getBalance(root);

        // Left Left
        if (balance > 1 && getBalance(root.left) >= 0)
            return rightRotate(root);

        // Left Right
        if (balance > 1 && getBalance(root.left) < 0) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // Right Right
        if (balance < -1 && getBalance(root.right) <= 0)
            return leftRotate(root);

        // Right Left
        if (balance < -1 && getBalance(root.right) > 0) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    public void delete(int key) {
        root = delete(root, key);
    }

    // Main method for testing
    public static void main(String[] args) {
        tree avl = new tree();

        int[] keys = {10, 20, 30, 40, 50, 25};
        for (int key : keys)
            avl.insert(key);

        System.out.println("Inorder traversal of AVL tree:");
        avl.inorder();

        avl.delete(40);
        System.out.println("After deleting 40:");
        avl.inorder();
    }
}
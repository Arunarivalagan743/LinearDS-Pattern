package Tree.AVL;
class AVLTree {

    class Node {
        int val, height;
        Node left, right;

        Node(int val) {
            this.val = val;
            height = 1;
        }
    }

    Node root;

    // Get height
    int height(Node n) {
        return n == null ? 0 : n.height;
    }

    // Get balance factor
    int balance(Node n) {
        return n == null ? 0 : height(n.left) - height(n.right);
    }

    Node rightRotate(Node x)
    {
        Node y = x.left;
        Node t3  =  y.right;
        y.right = x;
        x.left = t3;
        x.height =  Math.max(height(x.left),height(x.right)) + 1;
        y.height =  Math.max(height(y.left),height(y.right)) + 1;
        return y;
    }
    Node leftRotate(Node y)
    {
        Node x = y.right;
        Node t3  =  x.left;
        x.left = y;
        y.right= t3;
        y.height =  Math.max(height(y.left),height(y.right)) + 1;
        x.height =  Math.max(height(x.left),height(x.right)) + 1;
        return x;
    }
    // Insert node
    Node insert(Node node, int val) {

        // 1. Normal BST insertion
        if (node == null)
            return new Node(val);

        if (val < node.val)
            node.left = insert(node.left, val);
        else if (val > node.val)
            node.right = insert(node.right, val);
        else
            return node; // duplicates not allowed

        // 2. Update height
        node.height = 1 + Math.max(height(node.left), height(node.right));

        // 3. Get balance
        int bf = balance(node);
//case  1 :  LL
        if(bf > 1 && val < node.left.val)
        {
            return rightRotate(node);
        }
        //case 2 : LR

        if(bf > 1 && val >node.left.val)
        {
           node.left  = leftRotate(node.left);
           return rightRotate(node);
        }
        //case 3 :  RR
        if(bf  < -1 && val > node.right.val)
        {
            return leftRotate(node);
        }
        //case 4 :  RL
        if(bf < -1 && val < node.right.val)
        {
            node.right  = rightRotate(node.right);
            return leftRotate(node);
        }
        return node;
    }

    // Inorder traversal
    void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.val + " ");
            inorder(node.right);
        }
    }

    // -------- TEST ALL 4 CASES --------
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();

        // Uncomment ONE case at a time

//         LL Case: 30, 20, 10
         int[] arr = {30, 20, 10};

        // RR Case: 10, 20, 30
        // int[] arr = {10, 20, 30};

        // LR Case: 30, 10, 20
        // int[] arr = {30, 10, 20};

//        // RL Case: 10, 30, 20
//        int[] arr = {10, 30, 20};

        for (int x : arr)
            tree.root = tree.insert(tree.root, x);

        System.out.print("Inorder Traversal: ");
        tree.inorder(tree.root);
    }
}

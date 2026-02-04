package Tree.BinarySearchTree;



class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BST {

  public static Node insert(int val,Node root)
  {
      if(root== null)
      {
          Node newNode =  new Node(val);
          return newNode;
      }
      if(val < root.data)
      {
          root.left =  insert(val,root.left);
      } else if (val > root.data) {
          root.right =  insert(val,root.right);

      }
      return root;
  }
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }


public static  boolean balnced(Node root)
{
    if(root == null) return true;
    int l =  height(root.left);
    int r = height(root.right);
    if(Math.abs(l-r) > 1)return false;
    return balnced(root.right) && balnced(root.left);
}

    public static void main(String[] args) {
        Node root = null;

        int[] values = {3,2,1,4};

        for (int val : values) {
            root = insert(val,root);
        }
        int h   = height(root);
        System.out.println(h);
        System.out.println(balnced(root));



    }
}

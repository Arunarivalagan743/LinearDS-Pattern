package Tree.BinaryTree.BFS;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class ZigZagLevelBfs {

//      Definition for a binary tree node.
      public class TreeNode {
         int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
      }


        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            List<List<Integer>> res = new ArrayList<>();
            Deque<TreeNode> q = new LinkedList<>();
            if(root == null)
                return res;

            q.offer(root);
            boolean rev = false;
            while(!q.isEmpty())
            {
                int size =  q.size();
                List<Integer> inner = new ArrayList<>(size);
                for(int i  =0;i<size;i++)
                {
                    if(rev == false){
                        TreeNode cur =  q.pollFirst();
                        inner.add(cur.val);
                        if(cur.left!=null) q.offerLast(cur.left);
                        if(cur.right!=null) q.offerLast(cur.right);

                    }else{
                        TreeNode cur =  q.pollLast();
                        inner.add(cur.val);
                        if(cur.right!=null) q.offerFirst(cur.right);
                        if(cur.left!=null) q.offerFirst(cur.left);
                    }
                }
                rev = !rev;
                res.add(inner);
            }
            return res;
        }
    }


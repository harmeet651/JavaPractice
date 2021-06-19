package LeetCode;

import binaryTrees.BinaryTreeNode;
import binaryTrees.BinaryTreeUse;
public class MergeTwoBinTree {

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
		BinaryTreeNode<Integer> child1 = new BinaryTreeNode<>(2);
		BinaryTreeNode<Integer> child2 = new BinaryTreeNode<>(3);
		BinaryTreeNode<Integer> child1_child1 = new BinaryTreeNode<>(10);
		root.left = child1;
		root.right = child2;
		child1.left = child1_child1;
		BinaryTreeNode<Integer> root2 = new BinaryTreeNode<>(4);
		BinaryTreeNode<Integer> child2_1 = new BinaryTreeNode<>(5);
		BinaryTreeNode<Integer> child2_2 = new BinaryTreeNode<>(1);

		root2.left = child2_1;
		root.right = child2_2;
		BinaryTreeNode<Integer> ans = mergeTrees(root, root2);
		printPreorder(ans);
	}
	public static BinaryTreeNode mergeTrees(BinaryTreeNode t1, BinaryTreeNode t2) {
        if(t1==null)
        	return t2;
        if(t2==null)
        	return t1;
        t1.data = (int)t1.data + (int)t2.data;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }
	public static void printPreorder(BinaryTreeNode<Integer> node)
	{
		if (node == null) 
            return; 
  
        /* first print data of node */
        System.out.print(node.data + " "); 
  
        /* then recur on left sutree */
        printPreorder(node.left); 
  
        /* now recur on right subtree */
        printPreorder(node.right); 
	}
}

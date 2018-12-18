package binaryTress;

import java.util.Scanner;

public class BinaryTreeUse {

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
		BinaryTreeNode<Integer> child1 = new BinaryTreeNode<>(2);
		BinaryTreeNode<Integer> child2 = new BinaryTreeNode<>(3);
		root.left = child1;
		root.right = child2;
		printPreorder(root);
	}
	public static BinaryTreeNode<Integer> takeInput(Scanner s)
	{
		int rootData = s.nextInt();
		if(rootData == -1)
		{
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		root.left = takeInput(s);
		root.right = takeInput(s);
		return root;
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

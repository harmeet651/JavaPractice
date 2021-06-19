package trees;

import java.util.Scanner;
import StacksAndQueues.*;
public class treeUse {

	public static void main(String[] args) throws QueueEmptyException 
	{
		Scanner s = new Scanner(System.in);
		//treeNode<Integer> root = takeInput(s);
		
		treeNode<Integer> root = takeInputLevelWise();
		
		print(root);
		
		//printLevelWise(root);
		
		int no_of_child = noOfNodes(root);
		System.out.println(no_of_child +" nodes");
		
		treeNode<Integer> maxnode = maxNode(root);	
		System.out.println(maxnode.data+" is the max node");
	    
		int x =40;
		int greaterThanX = numNodeGreater(root, x);
		System.out.println(greaterThanX+" nodes greater than x");
		
		int height = height(root);
		System.out.println(height+" is the height of the tree");
		
		int leafs = noOfleafs(root);
		System.out.println(leafs+" leafs");
		
		int k1=1;
		printAtDepthK(root, k1);
	}

	public static treeNode<Integer> takeInputLevelWise() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter root data");
		int n = s.nextInt();
		QueueWithLinkedList<treeNode<Integer>> queue = new QueueWithLinkedList<>();
		treeNode<Integer> root = new treeNode<Integer>(n);
		queue.enqueue(root);
		while(!queue.isEmpty())
		{
			try {
				treeNode<Integer> frontNode = queue.dequeue();
				System.out.println("Enter number of children of "+frontNode.data+"");
				int children = s.nextInt();
				for(int i=0;i<children;i++)
				{
					System.out.println("Enter "+(i+1)+"th child of "+frontNode.data);
					int newChild = s.nextInt();
					treeNode<Integer> child = new treeNode<Integer>(newChild);
					frontNode.children.add(child);
					queue.enqueue(child);
				}
			} catch (QueueEmptyException e) {
				//shouldnt come here
				return null;
			}
		}		
		return root;
	}

	public static treeNode<Integer> takeInput(Scanner s)
	{
		int n, children;
		System.out.println("Enter data for node");
		n = s.nextInt();
		treeNode<Integer> root = new treeNode<Integer>(n);
		System.out.println("Enter number of children");
		children = s.nextInt();
		for(int i=0;i<children;i++)
		{
			treeNode<Integer> child = takeInput(s);
			root.children.add(child);
		}
		return root;
	}
	
	public static void print(treeNode<Integer> root)
	{
		String s = root.data + " : ";
		for(int i=0;i<root.children.size();i++)
		{
			s = s + root.children.get(i).data + ", ";
		}		
		System.out.println(s);
		for(int i=0;i<root.children.size();i++)
		{
			print(root.children.get(i));
		}
	}
	
	public static void printLevelWise(treeNode<Integer> root)
    {
      	QueueWithLinkedList<treeNode<Integer>> queue = new QueueWithLinkedList<treeNode<Integer>>();
      	if(root==null)
        {
          return;
        }
      	
      	queue.enqueue(root);
      	queue.enqueue(null);
      	while(!queue.isEmpty())
        {
          treeNode<Integer> currNode = null;
		try {
			currNode = queue.dequeue();
		} catch (QueueEmptyException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
          
          if(currNode==null)
          {
            treeNode<Integer> currNode1 = null;
			try {
				currNode1 = queue.front();
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            if(currNode1==null)
            {
              break;
            }
            System.out.println();
          }
          else
          {
          	System.out.print(currNode.data+" ");
          }
          if(currNode!=null)
          {
          	for(int i=0;i<currNode.children.size();i++)
          	{
             	queue.enqueue(currNode.children.get(i));
          	}
            
          }
          if(currNode==null)
          {
          	queue.enqueue(null);
          }
        }
	}
	
	public static int noOfNodes(treeNode<Integer> root)
	{
		int count = 1;
		for(int i=0;i<root.children.size();i++)
		{
			count += noOfNodes(root.children.get(i));
		}
		return count;
	}
	
	public static treeNode<Integer> maxNode(treeNode<Integer> root) 
	{
		treeNode<Integer> max = root;
		for(int i=0;i<root.children.size();i++)
		{
			treeNode<Integer> max_till_now = maxNode(root.children.get(i));
			if(max_till_now.data>max.data)
			{
				max = max_till_now;
			}
		}
		return max;
	}
	
	public static int numNodeGreater(treeNode<Integer> root,int x)
	{
		int count=0;
      for(int i=0;i<root.children.size();i++)
      {
        count = count +numNodeGreater(root.children.get(i), x);
        if(x<root.children.get(i).data)
        {
        	count++;
        }
      }
      return count;
	}
	
	public static int height(treeNode<Integer> root)
	{
		int max = 1;
		for(int i=0;i<root.children.size();i++)
		{
			int size = height(root.children.get(i))+1;
			if(max<size)
			{
				max = size;
			}
		}
		return max;
	}
	
	public static int noOfleafs(treeNode<Integer> root)
	{
		if(root.children.size()==0)
		{
			return 1;
		}
		int count =0;
		for(int i=0;i<root.children.size();i++)
		{
			count = count + noOfleafs(root.children.get(i));
		}
		return count;
	}

	public static void printAtDepthK(treeNode<Integer> root, int k)
	{
		if(k<0)
		{
			return;
		}
		if(k==0)
		{
			System.out.println(root.data +" ");
		}
		for(int i=0;i<root.children.size();i++)
		{
			printAtDepthK(root.children.get(i),k-1);
		}
	}
}

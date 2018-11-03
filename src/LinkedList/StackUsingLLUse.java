package LinkedList;

import java.util.Scanner;

import StacksAndQueues.StackEmptyException;
import StacksAndQueues.StackUsingLinkedList;

public class StackUsingLLUse {

	public static void main(String[] args) throws StackEmptyException {
		Scanner scan = new Scanner(System.in);   
		StackUsingLinkedList<Integer> stack = new StackUsingLinkedList<>();
		for(int i=1;i<=10;i++)
		{
			stack.push(i);
		}
		stack.display();
		while(!stack.isEmpty())
		{
			try {
				System.out.println(stack.pop());
			} catch (StackEmptyException e) 
			{				
				//never reaches as ! is there
			}
		}
		scan.close();
	}

}

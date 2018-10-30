package LinkedList;

import java.util.Scanner;

public class LinkedListUse {
	public static void main(String[] args) {

		Node<Integer> head = takeInput();
		System.out.println("new list");
		//head = insert(head, 22, 0);
		//head = delete(head, 2);
		print(head);
		Node<Integer> mid = midOfLL(head);
		System.out.println(mid.data+" middle element");
	}
	
	public static Node<Integer> takeInput() 
	{
		Scanner s = new Scanner(System.in);
		Node<Integer> head = null, tail =null;
		int data = s.nextInt();
		
		while(data!=-1)
		{
			Node<Integer> newNode = new Node<Integer>(data);
			if(head==null)
			{
				head = newNode;
				tail = newNode;
			}
			else
			{
				//			Node<Integer> temp = head;
				//			while(temp.next!=null)
				//			{
				//	 			temp = temp.next;
				//			}
				//			temp.next = newNode;
				//          using tail to improve time from O(n ^ 2) to O(n)
				tail.next = newNode;
				tail = tail.next;
			}
			data = s.nextInt();
		}
		return head;
	}
	
	public static Node<Integer> insert(Node<Integer> head, int data, int pos)
	{
		Node<Integer> newNode = new Node<Integer>(data);
		Node<Integer> temp = head;
		if(pos==0)
		{
			newNode.next = head;
			return newNode;
		}
		else
		{
			int i=0;
			while(i<pos-1)
			{
				temp = temp.next;
				i++;
			}
			newNode.next = temp.next;
			temp.next = newNode;	
		}
		return head;
	}
	
	public static Node<Integer> delete(Node<Integer> head, int pos)
	{
		if(head == null)
		{
			return null;
		}
		Node<Integer> temp = head;
		int i=0;
		if(pos == 0)
		{
			return head.next;
		}
		while(i<pos-1)
		{
			temp = temp.next;
			i++;
		}
		temp.next = temp.next.next;
		return head;	
	}
	
	public static Node<Integer> midOfLL(Node<Integer> head)
	{
		Node<Integer> slow = head;
		Node<Integer> fast = head;
		while(fast.next!= null && fast.next.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		Node<Integer> mid = slow;
		return mid;
	}
	
	public static void print(Node<Integer> head)
	{
		while(head!=null)
		{
			System.out.println(head.data);
			head=head.next;
		}
	}
}

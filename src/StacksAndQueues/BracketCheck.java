package StacksAndQueues;

import LinkedList.StackUsingLLUse;

public class BracketCheck {

	public static void main(String[] args) throws StackEmptyException {
		String exp = "}{([]))}";
		boolean res = checkBrackets(exp);
		System.out.println(res);

	}

	private static boolean checkBrackets(String exp) throws StackEmptyException {
		StackUsingLinkedList<Character> stack = new StackUsingLinkedList<Character>();
		for(int i=0;i<exp.length();i++)
		{
			if(exp.charAt(i)=='{' || exp.charAt(i)=='[' || exp.charAt(i)=='(')			
			{
				stack.push(exp.charAt(i));
			}
			if(exp.charAt(i)=='}' || exp.charAt(i)==']' || exp.charAt(i)==')')
			{
				if(stack.isEmpty())
				{
					return false;
				}
				else if(!pairBrackets(stack.pop(),exp.charAt(i)))
				{
					return false;
				}
			}
		}	
		if(stack.isEmpty())
		{
			return true;
		}
		return false;
	}
	
	private static boolean pairBrackets(char c1, char c2)
	{
		if(c1=='{' && c2=='}')
			return true;
		else if(c1=='[' && c2==']')
			return true;
		else if(c1=='(' || c2 ==')')
			return true;
		return false;	
	}

}

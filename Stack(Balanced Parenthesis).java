class Stack
{
	int top;
	int max = 1000;
	int[] arr = new int[max];

	Stack()
	{
		top = -1;
	}

	boolean isEmpty()
	{
		return top<0;
	}

	int push(int x)
	{
		if(top>=max-1)
		{
			System.out.println("Stack Overflown");
			return top;
		}
		top++;
		arr[top] = x;
		return x;
	}

	int pop()
	{
		if(top<0)
		{
			System.out.println("Stack Underflown");
			return 0;
		}
		int ans = arr[top];
		top--;
		return ans;
	}

	int peek()
	{
		if(top<0)
		{
			System.out.println("Stack Underflown");
			return 0;
		}
		int x = arr[top];
		return x;
	}

	boolean balancedParenthesis(char exp[])
	{
		Stack s = new Stack();
		for(int i=0;i<exp.length;i++)
		{
			if(exp[i]=='(' || exp[i]=='{' || exp[i]=='[')
			{
				s.push(exp[i]);
			}

			if(exp[i]==')' || exp[i]=='}' || exp[i]==']')
			{
				if(s.isEmpty())
					return false;
				else if(!matchingPair(s.pop(),exp[i]))
				{
					return false;
				}
			}
		}

		if(s.isEmpty())
			return true;
		else
			return false;
	}

	boolean matchingPair(char n1, char n2)
	{
		if(n1=='(' && n2==')')
			return true;
		else if(n1=='{' && n2=='}')
			return true;
		else if(n1=='[' && n2==']')
			return true;
		else
			return false;
	}

	public static void main(String[] args)
	{
		char[] exp = {'{','(',')','}','[',']'}; 
		if(balancedParenthesis(exp))
			System.out.println("Balanced Parenthesis");
		else
			System.out.println("Not Balanced");
	}
}
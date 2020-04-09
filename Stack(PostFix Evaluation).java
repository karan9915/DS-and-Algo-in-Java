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

	int postfixEvaluation(String exp)
	{
		Stack s = new Stack();
		for(int i=0;i<exp.length();i++)
		{
			char val = exp.charAt(i);
			if(Character.isDigit(val))
				s.push(val - '0');
			else
			{
				int n1 = s.pop();
				int n2 = s.pop();
				switch(val)
				{
					case '+':
					s.push(n2+n1);
					break;

					case '-':
					s.push(n2-n1);
					break;

					case '/':
					s.push(n2/n1);

					case '*':
					s.push(n2*n1);
					break;
				}
			}
		}
		return s.pop();
	}

	public static void main(String[] args)
	{
		String exp="231*+9-"; 
		Stack s = new Stack();
		System.out.println("Postfix Evaluation is " + s.postfixEvaluation(exp));  
       
	}
}
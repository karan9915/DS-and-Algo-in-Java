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

	public static void main(String[] args)
	{
		Stack s = new Stack();
		System.out.println(s.push(10) + " Pushed in Stack");
		System.out.println(s.push(20) + " Pushed in Stack");
		System.out.println(s.push(30) + " Pushed in Stack");
		System.out.println(s.push(40) + " Pushed in Stack");
		System.out.println(s.push(50) + " Pushed in Stack");
		System.out.println(s.pop() + " Popped from Stack");
		System.out.println(s.pop() + " Popped from Stack");
		System.out.println(s.peek() + " Top element in Stack");

	}
}
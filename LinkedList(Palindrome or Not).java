class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}

class LinkedList
{
	static Node head;
	Node second_half;

	boolean isPalindrome(Node head)
	{
		Node slow = head;
		Node fast = head;
		Node behind_slow = head;
		Node midnode = null;
		boolean res = true;

		while(fast!=null && fast.next!=null)
		{
			fast = fast.next.next;
			behind_slow = slow;
			slow = slow.next;
		}

		if(fast!=null)
		{
			midnode = slow;
			slow = slow.next;
		}

            second_half = slow;
	    behind_slow.next = null;
	    reverse();
	    res = compareLists(head,second_half);
	    reverse();

	    if(midnode!=null)
	    {
	    	behind_slow.next = midnode;
	    	midnode.next = second_half;
	    }
	    else
	    {
	    	behind_slow.next = second_half;
	    }
	    return res;
	}

	boolean compareLists(Node head1, Node head2)
	{
		Node temp1 = head1;
		Node temp2 = head2;
		while(temp1!=null && temp2!=null)
		{
			if(temp1.data==temp2.data)
			{
				temp1 = temp1.next;
				temp2 = temp2.next;
			}
			else
				return false;
		}

		if(temp1==null && temp2==null)
			return true;

		return false;
	}

	void reverse()
	{
		Node next = null;
		Node curr = second_half;
		Node prev = null;
		while(curr!=null)
		{
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		second_half = prev;
	}

	void printList(Node node)
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.print("null");
	}

	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		list.head = new Node(10);
		list.head.next = new Node(20);
		list.head.next.next = new Node(30);
		list.head.next.next.next = new Node(20);
		list.head.next.next.next.next = new Node(10);

		list.printList(head);
		System.out.println();
		if(list.isPalindrome(head))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}
}
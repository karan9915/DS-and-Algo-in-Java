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

    Node deleteAtGivenPositionFromEnd(int pos)
    {
    	reverse();

    	Node prev;
    	Node temp = head;
    	int count = 1;
    	while(count<pos-1)
    	{
    		temp = temp.next;
    		count++;
    	}
        prev = temp.next;
    	temp.next = prev.next;
    	prev.next = null;

    	reverse();
	    return temp;
    }

	void reverse()
	{
		Node next = null;
		Node curr = head;
		Node prev = null;
		while(curr!=null)
		{
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
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
		list.head.next.next.next = new Node(40);
		list.head.next.next.next.next = new Node(50);

		list.deleteAtGivenPositionFromEnd(2);
		list.printList(head);
	}
}

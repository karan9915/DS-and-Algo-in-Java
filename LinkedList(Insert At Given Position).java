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

	void insertAtPosition(int x, int pos)
	{
		Node temp = new Node(x);
		Node temp1 = head;
		int count = 1;
		while(count<pos-1)
		{
			temp1 = temp1.next; 
			count++;
		}
		Node current = temp1.next;
		temp.next = current;
		temp1.next = temp;
	}

	void printList()
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

                list.insertAtPosition(25,3);
		list.printList();
	}
}
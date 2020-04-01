import java.util.*;
import java.io.*;

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

	int detectLoop(Node head)
	{
		Node slow = head;
		Node fast = head;
		while(slow!=null && fast!=null && fast.next!=null)
		{
			slow = slow.next;
			fast = fast.next.next;

			if(slow==fast)
			{
				System.out.println("Loop Detected");
				return 1;
			}
		}
		return 0;
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

		list.head.next.next.next.next.next = list.head;

		list.detectLoop(head);
		list.printList(head);
	}
}
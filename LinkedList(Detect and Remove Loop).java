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

	int detectAndRemoveLoop(Node head)
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
				removeLoop(slow,head);
				return 1;
			}
		}
		return 0;
	}

	void removeLoop(Node slow, Node curr)
	{
		Node ptr1 = null;
		Node ptr2 = null;

		ptr1 = curr;
		while(1==1)
		{
			ptr2 = slow;
			while(ptr2.next!=null && ptr2.next!=ptr1)
			{
				ptr2 = ptr2.next;
			}

			if(ptr2.next == ptr1)
				break;

			ptr1 = ptr1.next;
		}

		ptr2.next = null;
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

		list.head.next.next.next.next.next = head.next.next;

		list.detectAndRemoveLoop(head);
		list.printList(head);
	}
}
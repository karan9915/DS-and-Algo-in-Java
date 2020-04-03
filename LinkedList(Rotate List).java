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

	void rotateList(int k)
	{
		Node ptr1 = head;
		int count = 1;

		if(k==0)
			return ;

		while(count<k && ptr1!=null)
		{
			ptr1 = ptr1.next;
			count++;
		}

		if(ptr1 == null)
			return ;

		Node curr = ptr1;

		while(ptr1.next!=null)
		{
			ptr1 = ptr1.next;
		}

		ptr1.next = head;
		head = curr.next;
		curr.next = null;
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

		list.rotateList(3);
		list.printList(head);
	}
}
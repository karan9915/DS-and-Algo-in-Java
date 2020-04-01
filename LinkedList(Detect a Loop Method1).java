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

    boolean detectLoop(Node node)
    {
    	HashSet<Node> set = new HashSet<Node>();
    	while(node!=null)
    	{
    		if(set.contains(node))
    		{
    			return true;
    		}
    		else
    		{
    			set.add(node);
    		}
    		node = node.next;
    	}
    	return false;
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

		if(list.detectLoop(head))
			System.out.println("Loop Detected");
		else
			System.out.println("No Loop");
		list.printList(head);
	}
}
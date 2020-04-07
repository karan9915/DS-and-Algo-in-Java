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

    static Node commonNode(Node head1, Node head2)
    {
    	Node n1 = head1;
    	Node n2 = head2;
    	HashSet<Node> set = new HashSet<>();
    	while(n1!=null)
    	{
    		set.add(n1);
    		n1 = n1.next;
    	}

    	while(n2!=null)
    	{
    		if(set.contains(n2))
    		{
    			return n2;
    		}
    		n2 = n2.next;
    	}

    	return null;
    }
      
	static void printList(Node head)
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
		Node n1 = new Node(1);
		n1.next = new Node(2);
		n1.next.next = new Node(3);
		n1.next.next.next = new Node(4);
		n1.next.next.next.next = new Node(5);
		n1.next.next.next.next.next = new Node(6);
		n1.next.next.next.next.next.next = new Node(7);

		Node n2 = new Node(10);
		n2.next = new Node(9);
		n2.next.next = new Node(8);
		
		n2.next.next.next = n1.next.next.next;
		printList(n1);
		System.out.println();
		printList(n2);
		System.out.println();
		System.out.println(commonNode(n1,n2).data);
	}
}
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
	static Node head1,head2;

    int getNode()
    {
    	int c1 = getCount(head1);
    	int c2 = getCount(head2);
    	int d;

    	if(c1>c2)
    	{
    		d = c1-c2;
    		return intersectNode(head1,head2,d);
    	}
    	else
    	{
    		d = c2-c1;
    		return intersectNode(head2,head2,d);
    	}
    }

	int intersectNode(Node head1, Node head2, int d)
	{
		Node n1 = head1;
		Node n2 = head2;
		for(int i=0;i<d;i++)
		{
			if(n1==null)
				return -1;
			n1 = n1.next;
		}

		while(n1!=null && n2!=null)
		{
			if(n1.data == n2.data)
			{
				return n1.data;
			}
			n1 = n1.next;
			n2 = n2.next;
		}

		return -1;
	}

	int getCount(Node head)
	{
		Node temp = head;
		int count = 0;
		while(temp.next!=null)
		{
			count++;
			temp = temp.next;
		}
		return count;
	}
      
    void printList(Node head)
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
        list.head1 = new Node(3); 
        list.head1.next = new Node(6); 
        list.head1.next.next = new Node(9); 
        list.head1.next.next.next = new Node(15); 
        list.head1.next.next.next.next = new Node(30); 
  
        list.head2 = new Node(10); 
        list.head2.next = new Node(15); 
        list.head2.next.next = new Node(30); 

        System.out.println(list.getNode());


	}
}
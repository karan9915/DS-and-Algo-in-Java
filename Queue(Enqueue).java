class Node{

	int data;
	Node next;

	Node(int d){

		data = d;
		next=null;
	}
}

class Queue{

	Node front,rear;
	int length;

	Queue(){

		this.front = null;
		this.rear = null;
		this.length = 0;
	}

	boolean isEmpty(){

		return length==0;
	}

	void enQueue(int x){

		Node temp = new Node(x);
		if(isEmpty()){
			front = temp;
		}else{
			rear.next = temp;
		}
		rear = temp;
		length++;
	}

	void printQueue(){

		Node temp = front;
		while(temp!=null){
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println("null");
		System.out.println("Length of Queue is: " + length);
	}

	public static void main(String[] args){
		Queue q = new Queue();
		q.enQueue(10);
		q.enQueue(20);
		q.enQueue(30);
		q.enQueue(40);
		q.enQueue(50);

		q.printQueue();
	}
}
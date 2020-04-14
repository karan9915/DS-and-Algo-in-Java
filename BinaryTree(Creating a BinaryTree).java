class Node
{
	int data;
	Node left,right;
	Node(int d)
	{
		data = d;
		left = right = null;
	}
}

class BinaryTree
{
	static Node root;

	BinaryTree()
	{
		root = null;
	}

	BinaryTree(int x)
	{
		root = new Node(x);
	}

	public static void main(String[] args)
	{
	     BinaryTree tree = new BinaryTree();
	     tree.root = new Node(4); 
             tree.root.left = new Node(2); 
             tree.root.right = new Node(5); 
             tree.root.left.left = new Node(1); 
             tree.root.left.right = new Node(3);   
	}
}
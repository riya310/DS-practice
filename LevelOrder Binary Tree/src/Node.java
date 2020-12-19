import java.util.Queue;
import java.util.LinkedList;
public class Node {
int key;
Node left,right;
Node(int value)
{
	key=value;
	left=right=null;
}
}
class BinaryTree{
	Node root;
	void LevelOrder()
	{
		Queue<Node> queue=new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty())
		{
			Node temp=queue.poll();
			System.out.print(temp.key+" ");
			if(temp.left!=null)
			{
				queue.add(temp.left);
			}
			if(temp.right!=null)
				queue.add(temp.right);
		}
	}
	public static void main(String[] args)
	{
	
	        BinaryTree tree = new BinaryTree(); 
	        tree.root = new Node(1); 
	        tree.root.left = new Node(2); 
	        tree.root.right = new Node(3); 
	        tree.root.left.left = new Node(4); 
	        tree.root.left.right = new Node(5); 
	  
	        System.out.println("Level order traversal of binary tree is - "); 
	        tree.LevelOrder(); 
	}
}
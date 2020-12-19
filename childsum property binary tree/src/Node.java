
public class Node {
Node left,right;
int key;

Node(int value)
{
	key=value;
	left=right=null;
}
}
class BinaryTree{
	Node root;
	public static  void main(String[] args)
	{
		BinaryTree tree=new BinaryTree();
		tree.root=new Node(10);
		tree.root.left=new Node(8);
		tree.root.right=new Node(2);
		tree.root.left.left=new Node(3);
		tree.root.left.right=new Node(5);
		tree.root.right.left=new Node(2);
		System.out.println(tree.isSum(tree.root));
	}
	boolean isSum(Node root)
	{
		if(root==null)
			return true;
		if(root.left==null && root.right==null)
			return true;
		int sum=0;
		if(root.left !=null) {sum+=root.left.key;}
		if(root.right!=null) {sum+=root.right.key;}
		
		return ((root.key==sum)&& isSum(root.left) && isSum(root.right));
	}
}



public class Node {
Node left,right=null;
int key;
Node(int value)
{
	key=value;
}
}
 class BinarySearchTree{
	Node root;
	static boolean res;
	void inorder(Node root)
	{
		if(root!=null)
		{
		inorder(root.left);
		System.out.print(root.key+" ");
		inorder(root.right);
		}
	}
	void insert(int key)
	{
		root=insertRec(root,key);
	}
	Node insertRec(Node root,int x)
	{
		if(root==null)
		{
			root=new Node(x);
			return root;
		}
		if(x<root.key)
			root.left=insertRec(root.left,x);
		if(x>root.key)
			root.right=insertRec(root.right,x);
		return root;
	}
      boolean search(int key)
	{
		res=searchRec(root,key);
		return res;
	}
	Boolean searchRec(Node root,int x)
	{
		if(root==null)
			return false;
		else if(root.key==x)
			return true;
		else if(root.key<x)
			return searchRec(root.right,x);
		else
			return searchRec(root.left,x);
	}
	public static void main(String[] args) {
		BinarySearchTree tree=new BinarySearchTree();
		tree.insert(50); 
        tree.insert(30); 
        tree.insert(20); 
        tree.insert(40); 
        tree.insert(70); 
        tree.insert(60); 
        tree.insert(80); 
		tree.inorder(tree.root);
		tree.search(31);
		System.out.println(res);
	}
}


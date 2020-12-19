
public class Node {
int key,k;
Node left,right;
Node(int value)
{
	key=value;
	left=right=null;
}
}
class BinaryTree{
	Node root;
	Node r;
	//BinaryTree(int key)
	//{
		//root= new Node(key);
	//}
	//BinaryTree()
	//{
		//root=null;
	//}
	public static void main(String[] args)
	{
		BinaryTree tree=new BinaryTree();
		tree.root=new Node(10);
		tree.root.left=new Node(20);
		tree.root.right=new Node(30);
		tree.root.right.left=new Node(40);
		tree.root.right.right=new Node(50);
		System.out.print("preorder:");
		tree.preorder(tree.root);
		System.out.print("inorder:");
		tree.inorder(tree.root);
		System.out.print("postorder:");
		tree.postorder(tree.root);
		System.out.println("size of tree:" + tree.getsize(tree.root));
		tree.printKnodes(tree.root,2);
	}
	 //void inorder()    {     inorder(root);   } 
	// void preorder() { preorder(root); }
	// void postorder() { postorder(root); }
     // int getsize() {  return getsize(root);}
      //void printKnodes(){ printKnodes(root,k);}
	void inorder(Node node) 
    { 
        if (node != null) 
        {
        inorder(node.left); 
        System.out.print(node.key + " "); 
        inorder(node.right); 
        }
    } 
	void preorder(Node node)
	{
		if(node!=null)
		{
			System.out.print(node.key+" ");
			preorder(node.left);
			preorder(node.right);
		}
	}
	void postorder(Node node)
	{
		if(node!=null)
		{
			postorder(node.left);
			postorder(node.right);
			System.out.print(node.key+" ");
		}
	}
	int getsize(Node node)
	{
		if(node==null)
			return 0;
		else
		return (1+getsize(node.left)+getsize(node.right));
	}
void printKnodes(Node node,int k)
{
	if(node==null)
		return;
	else if(k==0)
		System.out.print(node.key+" ");
	else
	{
		printKnodes(node.left,k-1);
		printKnodes(node.right,k-1);
	}
}
}

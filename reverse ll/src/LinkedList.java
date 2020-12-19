
public class LinkedList {
Node head;
public void insert(int data)
{
	Node node=new Node();
	node.data=data;
	node.next=null;
	
	if(head==null)
	{
		head=node;
	}
	else
	{
		Node n=head;
		while(n.next!=null)
		{
			n=n.next;
		}
		n.next=node;
	}
}
	public void reverse()
	{
		Node prev=null;
		Node next=null;
		Node current=head;
		while(current!=null)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
	}
	public void show()
	{
		Node node=head;
		while(node.next!=null)
		{
			System.out.print(node.data);
			System.out.print(" ");
			node=node.next;
		}
		
		System.out.print(node.data);
	}

}


public class Deletion {
Node head;
Node tail;
public void delete(Node del)
{
	if(head==del)
	{
		head=del.next;
	}
	if(del.next!=null)
	{
		del.next.prev=del.prev;
	}
	if(del.prev!=null)
	{
		del.prev.next=del.next;
	}
	return;
}
public void insert(int data)
{
Node newNode=new Node(data);
	if(head==tail)
	{
		head=tail=newNode;
		head.prev=null;
		tail.next=null;
	}
	else
	{
		tail.next=newNode;
		newNode.prev=tail;
		tail=newNode;
		tail.next=null;
	}
}
public void show()
{
	Node n=head;
	if(head==null)
	{
		System.out.println("list is empty");
		return;
	}
	System.out.println("doubly linked list");
	while(n!=null)
	{
		System.out.println(n.data+" ");
		n=n.next;
	}
}
}

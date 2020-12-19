
public class Reverse {
Node head;
Node tail;

class Node {
	
		int data;
		Node next;
		Node prev;
		Node(int data)
		{
			this.data=data;
		}
	
}

public void insert(int data)
{
	Node node=new Node(data);
	if(head==null)
	{
		head=tail=node;
		head.prev=null;
		tail.next=null;
	}
	else
	{
		tail.next=node;
		node.prev=tail;
		tail=node;
		tail.next=null;
	}
}
public void reverse()
{
	Node temp=null;
	Node curr=head;
	while(curr!=null)
	{
		temp=curr.prev;
		curr.prev=curr.next;
		curr.next=temp;
		curr=curr.prev;
	}
	head=temp.prev;
}
public void show()
{
	Node n=head;
	if(head==null)
	{
		System.out.println("list is empty");
		return;
	}
	while(n!=null)
	{
		System.out.print(n.data+" ");
		n=n.next;
	}
}


	public static void main(String[] args)
	{
		Reverse list=new Reverse();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		System.out.println("before reverse");
		list.show();
		list.reverse();
		System.out.println();
		System.out.println("after reverse");
		list.show();
	}

}

 

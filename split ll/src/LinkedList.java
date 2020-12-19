
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
		if(n.next!=null)
		{
			n=n.next;
		}
		n.next=node;
	}
}
public void split()
{
	Node evenend=null;
	Node evenstart=null;
	Node oddstart=null;
	Node oddend=null;

	for(Node current=head;current!=null;current=current.next)
	{
		int x=current.data;
		if(x%2==0)
		{
			if(evenstart==null)
			{
				evenstart=current;
				evenend=evenstart;
			}
			else
			{
				evenend.next=current;
				evenend=evenend.next;
			}
		}
		else
		{
			if(oddstart==null)
			{
				oddstart=current;
				oddend=oddstart;
			}
			else
			{
				oddend.next=current;
				oddend=oddend.next;
			}
		}
		
	}
	Node temp1=oddstart;
	Node temp2=evenstart;
	System.out.println("list with odd elements");
	while(temp1!=null)
	{
		System.out.println(temp1.data);
		temp1=temp1.next;
	}
	System.out.println("list with even elements");
	while(temp2!=null)
	{
		System.out.println(temp2.data);
		temp2=temp2.next;
	}
}
}

package insertofdll;

public class LinkedList {
Node head;
public void insert(int index,int data)
{
	Node node=new Node();
	node.data=data;
	node.next=null;
	
}

public void insertAtStart(int data)
{
	Node node=new Node();
	node.data=data;
	node.next=null;
}

public void insertAtEnd(int data)
{
	Node node=new Node();
	node.data=data;
	node.next=null;
}

public void show()
{
	
}
}

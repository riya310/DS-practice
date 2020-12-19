

public class DLL {
Node head;
Node tail;
public void insertAtEnd(int data)
{
	Node newNode = new Node(data);  
    if(head == null) {  //empty list
        head = tail = newNode;   
        head.prev = null;   
        tail.next = null;  
    }  
    else {    
        tail.next = newNode;  
        newNode.prev = tail;    
        tail = newNode;  
        tail.next = null;  
    }  
}
public void insertAtStart(int data)
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
		head.prev=newNode;
		newNode.next=head;
		head=newNode;
		head.prev=null;
	}
}

public void insert(int index,int data)
{
	Node newNode=new Node(data);
	if(index==0)
	{
		insertAtStart(data);
	}
	else
	{
		Node n=head;
		for(int i=0;i<index-1;i++)
		{
			n=n.next;
		}
		
		newNode.prev=n;
		newNode.next=n.next;
		n.next=newNode;
		newNode.next.prev=newNode;
		
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
	Node n = head;  
    if(head == null) {  
        System.out.println("Doubly linked list is empty");  
        return;  
    }  
    System.out.println("Nodes of doubly linked list: ");  
    while(n!= null) {  
        System.out.print(n.data + " ");  
        n = n.next;  
    }  
}

}

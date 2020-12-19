


 class Runner {
static class Node{
	int data;
	Node next;
}

static Node insert(Node head,int value)
{
	Node node=new Node();
	node.data=value;
	node.next=head;
	head=node;
	return head;
}

 static void add(Node head)
 {
	 Node t=head;
	 int sum=0;
	 while(t!=null) {
		 sum+=t.data;
		 t=t.next;
	 }
	 System.out.println(sum);
 }
 
 public static void main(String[] args)
 {
	 Node head=null;
	 int x,n=0;
	 Scanner s=new Scanner(System.in);
	 n=s.nextInt();
	 for(int i=0;i<n;i++)
	 {
		 x=s.nextInt();
		 head=insert(head,x);
	 }
	 add(head);
 }
}

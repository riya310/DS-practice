
public class Queue {

Node front;
Node rear;
 Queue(){
	 this.front=this.rear=null;
 }
 void enqueue(int data)
 {
	 Node temp=new Node(data);
	 if(this.rear==null)
	 {
		 this.front=this.rear=temp;
		 return;
	 }
	 this.rear.next=temp;
	 this.rear=temp;
 }
 void dequeue()
 {
	 if(this.front==null)
		 return;
	 this.front=this.front.next;
	 
 }
}

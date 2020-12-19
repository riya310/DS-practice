
public class Runner {
public static void main(String[] args)
{
	Queue q=new Queue();
	q.enqueue(10);
	q.enqueue(20);
	q.dequeue();
	q.dequeue();
	q.enqueue(30);
	q.enqueue(40);
	q.enqueue(50);
	q.dequeue();
	System.out.println();
	System.out.println();
}
}

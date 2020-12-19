
public class Runner {
		public static void main(String[] args)
		{
			Queue queue=new Queue(1000);
			queue.enqueue(10);
			queue.enqueue(20);
			queue.enqueue(30);
			queue.enqueue(40);
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
			System.out.println(queue.getFront());
			System.out.println(queue.getRear());
		}
	
}

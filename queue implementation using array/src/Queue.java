
public class Queue {
int size,cap;
int front=0;
int []arr;
Queue(int c)
{
	cap=c;
	size=0;
	arr=new int[cap];
}
void enqueue(int x)
{
	if(isFull())
		return;
	else
	{
		arr[size]=x;
		size++;
	}
}
int dequeue()
{
	if(isEmpty())
		return 0;
	else
	{
		int item=arr[front];
		for(int i=0;i<size-1;i++)
			arr[i]=arr[i+1];
		size--;
		return item;
	}
}
int getFront()
{
	if(isEmpty())
		return -1;
	else
		return 0;
}
int getRear()
{
	if(isFull())
		return -1;
	else
		return size-1;
}
boolean isFull()
{
	return (size==cap);
}
boolean isEmpty()
{
	return (size==0);
}
int size()
{
	return size;
}
}


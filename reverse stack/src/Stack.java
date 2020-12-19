
public class Stack {
int top;
int size;
char[] a;
Stack(int n)
{
	top=-1;
	size=n;
	a=new char[size];
}
public void push(char x)
{
	if(top>=size)
		System.out.println("stack is full");
	else
	{
		a[++top]=x;
	
	}
}
public char pop()
{
	if(top<0)
	{
		System.out.println("stack is empty");
		return 0;
	}
	else
	{
		char data=a[top--];
		return data;
	}
}
}

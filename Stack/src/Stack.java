
public class Stack {
int top=0;
int st[]=new int[5];

public void push(int data)
{
	if(top==5)
	{
		System.out.println("stack is full");
	
	}
	else {
	st[top]=data;
	top++;
	}
}
public int pop()
{
	if(top==0)
	{
		System.out.println("stack is empty");
		return 0;
	}
	else
	{
	int data;
	top--;
	data=st[top];
	st[top]=0;
	return data;
	}
}
public int size()
{
	return top;
}

public void show()
{
	for(int i=0;i<st.length;i++)
	{
		System.out.print(st[i]+" ");
	}
	System.out.println();
}
}

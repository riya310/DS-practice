import java.util.Scanner;

public class SelectionSort {
public static void main(String args[])
{
	int[] a; //for string- atring a[]
	int min,temp=0; // string temp
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	a=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		min=i;
		for(int j=i+1;j<n;j++)
		{
			if(a[j]<a[min]) // if(a[j].comparetoa[min]<0)
				min=j;
		}
		temp=a[i];
		a[i]=a[min];
		a[min]=temp;
	}
	for(int i=0;i<n;i++)
	{
		System.out.print(a[i]+" ");
		
	}
}
}

import java.util.Scanner;

public class InsertionSort {
public static void main(String[] args)
{
	int []a;
	int temp,j;
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	a=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	for(int i=1;i<n;i++)
	{
       temp=a[i];
       j=i;
       while(j>0 && a[j-1]>temp) {
    	   a[j]=a[j-1];
    	   j=j-1;
       }
       a[j]=temp;
	}
	for(int i=0;i<n;i++)
	{
		System.out.print(a[i]+" ");
	}
}
}

import java.util.Scanner;
public class LinearSearch {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int i,n,m,a[];
	n=s.nextInt();
	a=new int[n];
	for(i=0;i<n;i++)
		a[i]=s.nextInt();
	
	m=s.nextInt();
	
	for(i=0;i<n;i++)
	{
		if(a[i]==m)
		{
			System.out.println(m+" is present at"+(i)+" position");
			break;
		}
	}
	if(i==n)
		System.out.println(m+"not present in array");
}
}

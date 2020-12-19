import java.util.Scanner;
public class BinarySearch {
public static void main(String[] args) {
int hl,ll=0,n,a[],m,ml;
Scanner s=new Scanner(System.in);
n=s.nextInt();
a=new int[n];
hl=a.length-1;
ml=(hl+ll)/2;
for(int i=0;i<n;i++)
{
	a[i]=s.nextInt();
}
m=s.nextInt();
while(ll<=hl)
{
	if(a[ml]==m) {
		System.out.println("element is at "+ml+" index position");
		break;
	}
	else if(a[ml]<m)
		ll=ml+1;
	else
		hl=ml-1;
	ml=(hl+ll)/2;
}
if(ll>hl)
	System.out.println("element not found");
}
}

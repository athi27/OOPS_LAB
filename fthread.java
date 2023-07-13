import java.util.Scanner;
class fib implements Runnable
{
	int n,N,f1=0,f2=1,f3=0;
	public void run()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the limit for fibonacci : ");
	N=sc.nextInt();
	System.out.println("0");
	System.out.println("1");
	for(int i=1;i<=N;i++)
	{
	f3=f1+f2;
	System.out.println(f3);
	f1=f2;
	f2=f3;
	}
	}
}
class ev implements Runnable{

	public void run()
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the limit for even : ");
		n=sc.nextInt();
		for(int i=2;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}
public class fthread
{
	public static void main(String args[])
	{
	fib m=new fib();
	ev p=new ev();
	Thread t1=new Thread(m);
	Thread t2=new Thread(p);
	t2.start();
	t1.start();
	
	}
}
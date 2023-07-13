import java.util.Scanner;
class Employee
{
	String eno,ename;
	int esalary;
	Scanner sc=new Scanner(System.in);
	void read()
	{
		System.out.println("\n Enter Employee ID : ");
		eno=sc.next();
		System.out.println("\n Enter Employee Name: ");
		ename=sc.next();
		System.out.println("\n Enter monthly salary : ");
		esalary=sc.nextInt();
	}

	void display()
	{
		System.out.println("\n Employee Number : "+eno);
		System.out.println("\n  Employee Name : "+ename);
		System.out.println(" \n  Salary: "+esalary);
	}
	
}

public class Emp
{
	public static void main(String args[])
	{
		int i,n,f=0;
		String x;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter Number of Employees: ");
		n=sc.nextInt();
		Employee e[]=new Employee[n];

		for(i=0;i<e.length;i++)
		{
			e[i]=new Employee();
            System.out.println("\n Employee "+(i+1));
			e[i].read();
		}

		System.out.println(" \n SEARCH ...........");
		x=sc.next();
		for(i=0;i<e.length;i++)
		{
			if(e[i].eno.equals(x))
			{ 
   				f=1;
   				System.out.println("\n Employee Found ......");
   				System.out.println("\n Details of the Employee");
				e[i].display();
				break;
			}
		}
		if(f==0)
		System.out.println("Employee not found");
	}
}

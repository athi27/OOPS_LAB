import java.util.Scanner;

class Person{
	String name;
	char gender;
	String address;
	int age;
	Person(String name,char gen,String addr,int age){
		this.name=name;
		this.gender=gen;
		this.address=addr;
		this.age=age;
	}
}
class Employee extends Person{
	int empid;
	String company_name;
	String qual;
	float sal;
	Employee(String name,char gen,String addr,int age,int id,String cname,String qual,float sal){
		super(name,gen,addr,age);
		this.empid=id;
		this.company_name=cname;
		this.qual=qual;
		this.sal=sal;
	}
}
class Teacher extends Employee{
	String dept;
	String sub;
	int t_id;
	Teacher(String name,char gen,String addr,int age,int id,String cname,String qual,float sal,String dpt,String sub,int tid){
		super(name,gen,addr,age,id,cname,qual,sal);
		this.dept=dpt;
		this.sub=sub;
		this.t_id=tid;
	}
	void disp(){
			System.out.print("\n"+name+"\t"+gender+"\t"+address+"\t"+age+"\t"+empid+"\t"+company_name+"\t"+qual+"\t"+sal+"\t"+"dept"+"\t"+sub+"\t"+t_id);
			
	}
}
class NTeacherDetails{
	public static void main(String []args){
		int n,tid,empid,age;
		String name,addr="",dept,sub,qual,cname;
		char gen;
		float sal=0;
		char ch;
		Scanner sc= new Scanner(System.in);
		do{
			System.out.print("\nEnter the no.of teachers(n):");
			n=sc.nextInt();
			Teacher t[]=new Teacher[n];
			System.out.print("\nEnter the teacher's details.");
			for(int i=0;i<n;i++){
				System.out.println("\nTeacher "+(i+1)+" : ");
				System.out.print("\nEmployee ID: ");
				empid=sc.nextInt();
				System.out.print("\nName: ");
				name=sc.next();
				System.out.print("\nGender: ");
				gen=sc.next().charAt(0);
				System.out.print("\nDept name: ");
				dept=sc.next();
				System.out.print("\nAddress: ");
				addr=sc.next();
				System.out.print("\nSubject: ");
				sub=sc.next();
				System.out.print("\nQualification: ");
				qual=sc.next();
				System.out.print("\nCompany name: ");
				cname=sc.next();
				System.out.print("\nTeacher ID: ");
				tid=sc.nextInt();
				System.out.print("\nAge: ");
				age=sc.nextInt();
				System.out.print("\nSalary(in Rs.): ");
				sal=sc.nextFloat();
				t[i]=new Teacher(name,gen,addr,age,empid,cname,qual,sal,dept,sub,tid);
			}
			System.out.println("\n ...Teacher's details...");
			System.out.println("Name \tGender \tAddress \tAge \tEmp_id \tCompany_name \tQualification \tSalary  \tDept. \tSubject \tTeacher_id ");
			for(Teacher tr: t){
				tr.disp();
			}
			System.out.println("\nDo you wish to continue?(Y/N):");
			ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');
	}
}
import java.util.Scanner;
class Employee1{
	int empid;
	String name;
	float salary;
	String addr;
	Employee1(int id,String name,float sal,String addr){
		this.empid=id;
		this.name=name;
		this.salary=sal;
		this.addr=addr;
	}
}
class Teacher extends Employee1{
	String dept;
	String sub[];
	Teacher(int id,String name,float sal,String addr,String dpt,String sub[]){
		super(id,name,sal,addr);
		this.dept=dpt;
		this.sub=sub;
	}
	void disp(){
			System.out.print("\n"+empid+"\t"+name+"\t"+dept+"\t");
			for(int i=0;i<3;i++){
					System.out.print(sub[i]+"\t");
			}
			System.out.print(salary+"\t"+addr);
	}
}

class TeacherDetails{
	public static void main(String []args){
		int n,id;
		String name,addr="",dept;
		String sub[] = new String[3];
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
				System.out.print("\nID: ");
				id=sc.nextInt();
				System.out.print("\nName: ");
				name=sc.next();
				System.out.print("\nDept name: ");
				dept=sc.next();
				System.out.print("\nEnter the 3 Subjects taught by the teacher(if applicable):");
				for(int j=0;j<3;j++){
					System.out.print("\nSub"+(j+1)+": ");
					sub[j]=sc.next();
				}
				System.out.print("\nAddress: ");
				addr=sc.next();
				System.out.print("\nSalary(in Rs.): ");
				sal=sc.nextFloat();
				t[i]=new Teacher(id,name,sal,addr,dept,sub);
			}
			System.out.println("\n ...Teacher's details...");
			System.out.println(" Emp id\t Name \tDept \tSub1 \tSub2 \tSub3 \tSalary \tAddress ");
			for(Teacher tr: t){
				tr.disp();
			}
			System.out.println("\nDo you wish to continue?(Y/N):");
			ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');
	}
}
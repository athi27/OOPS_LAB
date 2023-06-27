import java.util.Scanner;
class Publisher{
	String name;
	Publisher(String name){
		this.name=name;
	}
	String getPublisher(){
		return (this.name);
	}
}
class Book extends Publisher{
	String title;
	//Publisher pub;
	//Book(String title,Publisher pub){
		Book(String title,String pub){
			super(pub);
			this.title=title;
	}
	void disp(){
		System.out.print("\n"+title);
		//System.out.println("Publisher : "+pub.getPublisher());
		System.out.print("\t"+getPublisher());
	}
}
class Literature extends Book{
	String author;
	Literature(String title,String pub,String auth){
		super(title,pub);
		this.author=auth;
	}
	@Override
	void disp(){
		super.disp();
		System.out.print("\t\t"+this.author);
	}
	
}

class Fiction extends Book{
	String genre;
	Fiction(String title,String pub,String genre){
		super(title,pub);
		this.genre=genre;
	}
	@Override
	void disp(){
		super.disp();
		System.out.print("\t\t"+this.genre);
	}
}

class Inherit{
	public static void main(String args[]){
		String pname,title,auth,genre,cat;
		int ch,n,i;
		Scanner sc=new Scanner(System.in);
		char choice;
		do{
			System.out.println("\nEnter the no.of books: ");
			n=sc.nextInt();
			//Publisher pub = new Publisher(pname);
			System.out.println("\nSelect category ");
			System.out.println("1.Literature");
			System.out.println("2.Fiction");
			System.out.println("Enter your choice(1/2): ");
			ch=sc.nextInt();
			switch(ch){
				case 1: 
							Literature lt[]=new Literature[n];
							for(i=0;i<n;i++){
								System.out.println("\nEnter the book details :");
								System.out.print("\nTitle : ");
								title=sc.next();
								System.out.print("\nPublisher name:");
								pname=sc.next();
								System.out.print("\nAuthor :");
								auth=sc.next();
								lt[i]=new Literature(title,pname,auth);
							}
							System.out.println("\n...Book Details...");
							System.out.print("\nTitle\tPublisher\tAuthor");
							for(Literature lit : lt)
								lit.disp();
							break;
				case 2: 
							Fiction f[]=new Fiction[n];
							for(i=0;i<n;i++){
								System.out.println("\nEnter the book details :");
								System.out.print("\nTitle : ");
								title=sc.next();
								System.out.print("\nPublisher name:");
								pname=sc.next();
								System.out.print("\nGenre :");
								genre=sc.next();
								f[i]=new Fiction(title,pname,genre);
							}
							System.out.println("\n...Book Details...");
							System.out.print("\nTitle\tPublisher\tGenre");
							for(Fiction fic : f)
								fic.disp();
							break;
				default:
							System.out.println("Invalid category");
			}
		System.out.println("\nDo you wish to continue?(Y/N):");
			choice=sc.next().charAt(0);
		}while(choice=='y'||choice=='Y');		
	}
}
import java.util.Scanner;
class product
{
    int pcode;
    String pname;
    float price;
    
    product(int pc,String pn,float pr)
    {
        pcode=pc;
        pname=pn;
        price=pr;
    }
    static void lower(float p1,float p2,float p3)
    {
        if(p1<p2 && p1<p3)
        {
            System.out.println("1st product have lowest price that is "+ p1);
        }
        else if(p2<p1)
        {
            System.out.println("2nd product have lowest price that is "+ p2);
        }
        else
        {
            System.out.println("3rd product have lowest price that is "+ p3);
        }
    }
    void display()
    {
        System.out.println(pcode+" "+pname+" "+price+" ");
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int pc0,pc1,pc2;
        String pn0,pn1,pn2;
        float pr0,pr1,pr2;
        System.out.println("1st product");
        System.out.print("Enter the code of 1st product: ");
        pc0=sc.nextInt();
        System.out.print("Enter the name of 1st product: ");
        pn0=sc.next();
        System.out.print("Enter the price of 1st product: ");
        pr0=sc.nextFloat();
        System.out.println("2nd product");
        System.out.print("Enter the code of 2nd product: ");
        pc1=sc.nextInt();
        System.out.print("Enter the name of 2nd product: ");
        pn1=sc.next();
        System.out.print("Enter the price of 2nd product: ");
        pr1=sc.nextFloat();
        System.out.println("3rd product");
        System.out.print("Enter the code of 3rd product: ");
        pc2=sc.nextInt();
        System.out.print("Enter the name of 3rd product: ");
        pn2=sc.next();
        System.out.print("Enter the price of  product: ");
        pr2=sc.nextFloat();
        product obj[]=new product[3];
        obj[0]=new product(pc0,pn0,pr0);
        obj[1]=new product(pc1,pn1,pr1);
        obj[2]=new product(pc2,pn2,pr2);
        obj[0].display();
        obj[1].display();
        obj[2].display();
        lower(obj[0].price,obj[1].price,obj[2].price);
    }
}
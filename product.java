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
    static void lower(product p1,product p2,product p3)
    {
        if(p1.price<p2.price && p1.price<p3.price)
        {
            System.out.println("product " + p1.pname+ " have lowest price that is "+ p1.price);
        }
        else if(p2.price<p3.price)
        {
            System.out.println("product" + p2.pname+ " have lowest price that is "+ p2.price);
        }
        else
        {
            System.out.println(" product" + p3.pname+ " have lowest price that is "+ p3.price);
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
        lower(obj[0],obj[1],obj[2]);
    }
}
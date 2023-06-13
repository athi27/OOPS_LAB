import java.util.Scanner;
class complex
{
    int real,imaginary;
    complex (int real,int imaginary)
    {
        this.real=real;
        this.imaginary=imaginary;
    }
    void display()
    {
        System.out.println(real+" + "+imaginary+"i");
    }
    static void add(complex c1,complex c2)
    {
        int sumreal,sumimg;
        sumreal=c1.real+c2.real;
        sumimg=c1.imaginary+c2.imaginary;
        System.out.println("sum of complex numbers is: "+sumreal+" + "+sumimg+"i");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r1,r2,i1,i2;
        System.out.println("enter 1st complex number: ");
        System.out.print("Enter the real part: ");
        r1=sc.nextInt();
        System.out.print("Enter the imaginary part: ");
        i1=sc.nextInt();
        System.out.println("enter 2nd complex number: ");
        System.out.print("Enter the real part: ");
        r2=sc.nextInt();
        System.out.print("Enter the imaginary part: ");
        i2=sc.nextInt();
        complex obj[]=new complex[2];
        obj[0]=new complex(r1,i1);
        obj[1]=new complex(r2,i2);
        obj[0].display();
        obj[1].display();
        add(obj[0],obj[1]);
    }
}
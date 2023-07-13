import java.util.*;
interface Shape {
    public void area();
    public void perimeter();
}

class Circle implements Shape {
    Scanner sc = new Scanner(System.in);
    Double r;
    Double ar,pr;
    public void area() {
        System.out.print("Enter the radius : ");
        r = sc.nextDouble();
       ar=3.14*r*r;
        System.out.println("Area  :" + ar);

    }

    public void perimeter() {
        System.out.print("Enter the radius : ");
        r = sc.nextDouble();
         pr=2*3.14*r;
        System.out.println("Perimeter : "+ pr);
    }

}

class Rectangle implements Shape {
    Scanner sc = new Scanner(System.in);
    int l, b;

    public void area() {
        System.out.print("Enter the Length : ");
        l = sc.nextInt();
        System.out.print("Enter the breadth : ");
        b =sc.nextInt();
       int ar1 =l * b;
        System.out.println("Area :" + ar1);

    }

    public void perimeter() {
        System.out.print("Enter the Length : ");
        l = sc.nextInt();
        System.out.print("Enter the breadth : ");
        b = sc.nextInt();
        int pr1 =2 * (l + b);
        System.out.println("Perimeter : "+ pr1);

    }
}

class Ap
{
public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        int n;
        while (true) {
            System.out.println("1:Area of Circle");
            System.out.println("2:Perimeter of Circle");
            System.out.println("3:Area of Rectangle");
            System.out.println("4:Perimter of Rectangle");
            System.out.println("5:EXIT");
            System.out.println("Enter Your choice ");
            n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1:
                    c.area();
                    break;
                case 2:
                    c.perimeter();
                    break;
                case 3:
                    r.area(); 
                    break;
                case 4:
                    r.perimeter();
                    break;
                case 5:
                    System.out.println("Exiting the Program");
                    System.exit(0);
                default:
                    System.out.println("invalid! choice");

            }
        }

    }
}
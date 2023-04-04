import java.util.Scanner;
class search
{
    static int pos=0;
        public static void main(String args[])
        {
            int x;
            int val;
            int count=0;
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the size of array:");
            x= sc.nextInt();
            int[] arr = new int[10];  
            System.out.println("Enter the element:");
            for(int i=0;i<x;i++)
            arr[i]= sc.nextInt();
            System.out.println("Array elemts are:");
            for(int i=0;i<x;i++)
            System.out.println(arr[i]);
            System.out.print("enter the value to be searched:");
            val= sc.nextInt();
            for(int i=0;i<x;i++)
            {
                if(arr[i]==val)
                {
                    count=count+1;
                    System.out.println("element is found at position"+(i+1)+"in array");
                    break;
                }

            }
            if(count==0)
            System.out.println("element is not found");
       }
}
    
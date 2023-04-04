import java.util.Scanner;
class twoD
{
		public static void main(String args[])
        {
			int x,y;
            int count=0;
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the size of rows of array:");
		    x= sc.nextInt();
            System.out.print("Enter the size of columns of array:");
		    y= sc.nextInt();
			int[][] arr = new int[20][20];  
		    System.out.println("Enter the element:");
		    for(int i=0;i<x;i++)
               for(int j=0;j<y;j++)
		            arr[i][j]= sc.nextInt();
			System.out.println("Array elemts are:");
            for(int i=0;i<x;i++)
            {
               for(int j=0;j<y;j++)
                {
		            System.out.print(arr[i][j]+" ");
                }
                System.out.println(" ");
            }
	   }

	
}
import java.util.Scanner;
class matrixadd
{
    public static void main(String[] args)
    {
        int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        x=sc.nextInt();
        System.out.println("Enter the number of columns ");
        y=sc.nextInt();
        int[][] A = new int[20][20];  
         System.out.println("Enter the element for first 2D array:");
		    for(int i=0;i<x;i++)
               for(int j=0;j<y;j++)
		            A[i][j]= sc.nextInt();
            System.out.println("Array elemts are:");
            for(int i=0;i<x;i++)
            {
               for(int j=0;j<y;j++)
                {
		            System.out.print(A[i][j]+" ");
                }
                System.out.println(" ");
            }
        int[][] B = new int[20][20];  
		    System.out.println("Enter the element for first 2D array:");
		    for(int i=0;i<x;i++)
               for(int j=0;j<y;j++)
		            B[i][j]= sc.nextInt();
            System.out.println("Array elemts are:");
            for(int i=0;i<x;i++)
            {
               for(int j=0;j<y;j++)
                {
		            System.out.print(B[i][j]+" ");
                }
                System.out.println(" ");
            }
        int[][] C = new int[20][20];
        for(int i=0;i<x;i++)
               for(int j=0;j<y;j++)
                    C[i][j]=A[i][j]+B[i][j];
        System.out.println("Array after addition:");
            for(int i=0;i<x;i++)
            {
               for(int j=0;j<y;j++)
                {
		            System.out.print(C[i][j]+" ");
                }
                System.out.println(" ");
            }

    }
}
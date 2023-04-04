import java.util.Scanner;
class oneD
{
		public static void main(String args[]){
			int x;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size of array:");
		    x= sc.nextInt();
			int[] arr = new int[10];  
		System.out.println("Enter the element:");
		for(int i=0;i<x;i++)
			arr[i]= sc.nextInt();
			System.out.println("Array elemts are:");
		for(int i=0;i<x;i++)
			System.out.println(arr[i]);
	}
	
}
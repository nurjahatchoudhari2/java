package pack_JaggedArray;

import java.util.Scanner;

public class Jagged2darray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many classes in the collge??");
		int size = scan.nextInt();
		
		int arr[][] = new int[size][];
		
		for(int i =0; i<arr.length;i++)
		{
			System.out.println("Enter how many student in class"+(i+1)+":");
			int a = scan.nextInt();
			arr[i] = new int[a];
		}
		//classes input
		
		for(int i = 0;i<arr.length;i++)
		{
			System.out.println("Enter Marks of Class"+(i+1)+": ");
			for(int j = 0;j<arr[i].length;j++)
			{
				System.out.print("Student"+(j+1)+": ");
				arr[i][j] = scan.nextInt();
			}
		}
		//output
		for(int i = 0;i<arr.length;i++)
		{
			for(int j = 0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	
}
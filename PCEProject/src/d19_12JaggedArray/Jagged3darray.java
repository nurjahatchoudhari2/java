package d19_12JaggedArray;

import java.util.Scanner;

public class Jagged3darray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many colleges??");
		int size = scan.nextInt();
		
		
		int arr[][][] = new int[size][][];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter how many classes in college"+(i+1)+":");
			int a = scan.nextInt();
			arr[i] = new int[a][];
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter how many student in class"+(j+1)+":");
				int b = scan.nextInt();
				arr[i][j] = new int[b]; 
			}
		}
        
        
      
		//classes input
		for(int i = 0;i<arr.length;i++)
		{
			System.out.println("College"+(i+1)+": ");
			for(int j = 0;j<arr[i].length;j++)
			{
				System.out.println("Class"+(j+1)+": ");
				for(int k = 0;k<arr[i][j].length;k++)
				{
					System.out.print("Enter Marks of Student"+(k+1)+": ");
					arr[i][j][k] = scan.nextInt();
					
				}
			}
		}
		//output
		for(int i = 0;i<arr.length;i++)
		{ 
			for(int j = 0;j<arr[i].length;j++)
			{
				for(int k = 0;k<arr[i][j].length;k++)
				{
					 
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}

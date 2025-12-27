package pack_2DArrray;

import java.util.Scanner;

public class Arr3Ddemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many colleges??");
		int a = scan.nextInt();
		System.out.println("Enter how many claases in each college??");
		int b = scan.nextInt();
		System.out.println("Enter how many student in each class??");
		int c = scan.nextInt();
		
		
		int arr[][][] = new int[a][b][c];
		
		
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
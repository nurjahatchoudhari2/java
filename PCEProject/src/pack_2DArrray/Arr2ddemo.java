package pack_2DArrray;

import java.util.Scanner;

public class Arr2ddemo {

	public static void main(String[] args) {
		//dimension in 2d array == like each class have same students. for diffrent we use jagged array.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many classes in school??");
		int c = scan.nextInt();
		System.out.println("Enter how many students in each classes??");
		int s = scan.nextInt();
		
		int arr[][] = new int[c][s];
		
		for(int i = 0;i<arr.length;i++)
		{
			System.out.println("Enter Marks of Class"+(i+1)+": ");
			for(int j = 0;j<arr[i].length;j++)
			{
				System.out.print("Student"+(j+1)+": ");
				arr[i][j] = scan.nextInt();
			}
		}
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
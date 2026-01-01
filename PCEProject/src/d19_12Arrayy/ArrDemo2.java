package d19_12Arrayy;

import java.util.Scanner;

public class ArrDemo2
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter How Many Students in the Class??");
		int size = scan.nextInt();
		int a[] = new int[size];
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println("Enter Marks of Student" + (i+1));
			a[i] = scan.nextInt();
		}
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println("Marks of student"+(i+1)+": "+a[i]);
		}
	}
}

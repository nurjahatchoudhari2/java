package d19_12Arrayy;

import java.util.Scanner;

public class ArrString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter How Many Employees in the Company??");
		int size = scan.nextInt();
		String a[] = new String[size];
		scan.nextLine();
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println("Enter Names of Employee" + (i+1));
			a[i] = scan.nextLine();	
		}
		for(int i=0; i<a.length; i++)
		{
			System.out.println("Name of Employee"+(i+1)+": "+a[i]);
		}
	}
}

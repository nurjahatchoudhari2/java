package d20_12dsa;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a[] = {10,20,30,40,50,60};
		System.out.println("Enter index1");
		int n1 = scan.nextInt();
		System.out.println("Enter index2");
		int n2 = scan.nextInt();
		int n = 0;
		
		n = a[n2];
		a[n2] = a[n1];
		a[n1] = n;
		
		 
		for (int i = 0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
			 
	}
}

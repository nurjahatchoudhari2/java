package d27_12instance;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter height of the traingle : ");
		float h = scan.nextFloat();
		System.out.println("Enter base of the traingle : ");
		float b = scan.nextFloat();
		
		
		
		AreaofTriangle a = new AreaofTriangle(h,b);
		System.out.println("Area of Triangle : " +a.Disp());
		

	}

}

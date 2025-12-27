package pack_constructor;

import java.util.Scanner;

public class EmpDetails
{
	public static void main(String [] args)
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Emp Id : ");
		int id = scan.nextInt();
		System.out.println("Enter Emp Salary : ");
		int sal = scan.nextInt();
		System.out.println("Enter Emp Name : ");
		String name = scan.next();
		

		 
		Emp a = new Emp(id,sal,name);
		 
		
		System.out.println(a.getEmpId());
		System.out.println(a.getEmpSal());
		System.out.println(a.getEmpName());
		
	}

}

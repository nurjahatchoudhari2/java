package d24_12scheduingproblem;

import java.util.Scanner;

import d24_12constructor.Emp;

public class EmpDetails {

	public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = scan.nextLine();
		System.out.println("Enter Age : ");
		int age = scan.nextInt();
		System.out.println("Enter Gender : ");
		String gender = scan.next();
		

		 
		Student1 s1 = new Student1(name,age,gender);
		 
		
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		System.out.println(s1.getGender());
		

	}

}

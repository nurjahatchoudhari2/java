package pack_Encapsulation;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		
		StudentApp s = new StudentApp();
		
		Scanner scan = new Scanner(System.in);
		

		System.out.println("Enter Name :");
		String name = scan.nextLine();
		System.out.println("Enter Age :");
		int age = scan.nextInt();
		System.out.println("Enter Gender :");
		String gender = scan.next();
		
		
		s.setData(name,age,gender);
		
		System.out.println("Name : "+ s.getName());
		System.out.println("Age : "+ s.getAge());
		System.out.println("Gender : "+ s.getGender());
		
		

	}

}

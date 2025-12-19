package pack_Details;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		StudentDetails sd = new StudentDetails();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name");
		sd.name = scan.nextLine();
		System.out.println("Enter age");
		sd.age = scan.nextInt();
		System.out.println("Enter Gender");
		sd.gender = scan.next();
		System.out.println("Enter MobNO");
		sd.MobNo = scan.next();
		System.out.println("Enter College Id");
		sd.Clgid = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter College name");
		sd.Clgname = scan.nextLine();
		System.out.println("Enter Aadhar card no");
		sd.aadharNo = scan.next();
		System.out.println("Enter email address");
		sd.emailaddress = scan.next();
		
		System.out.println("StudentDetails:");
		System.out.println("Name : "+sd.name);
		System.out.println("Age : " +sd.age);
		System.out.println("Gender : "+sd.gender);
		System.out.println("Mob No : "+sd.MobNo);
		System.out.println("College id : "+sd.Clgid);
		System.out.println("College Name : "+sd.Clgname);
		System.out.println("Aadhar N0 : "+sd.aadharNo);
		System.out.println("Email Address"+sd.emailaddress);
		 
		
		
		 
		
		
	}

}

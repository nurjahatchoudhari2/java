package pack_student;

public class Program {
	public static void main(String[] args)
	{
		Student s1 = new Student();
		
		System.out.println("Before assiging");
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.gender);
		
		System.out.println("After assigning");
		s1.name = "Arth";
		s1.age = 21;
		s1.gender = "male";
		
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.gender);
		

	}
	


}

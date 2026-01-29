package new29_01Dayhalf;

public class Main
{
	public static void main(String [] args)
	{
		
		Student s1 = new Student("Neha ",21," female");
		Student s2 = new Student("John ",22," male");
		Student s3 = new Student("Arsh ",23," male");
		
		Student [] arr = {s1, s2, s3};
		
		for(Student s : arr)
		{
			System.out.print(s.getName());
			System.out.print(s.getAge());
			System.out.println(s.getGender());
			System.out.println("---------------");
			
			
		}
	}
}
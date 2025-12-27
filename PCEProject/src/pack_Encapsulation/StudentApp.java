package pack_Encapsulation;

public class StudentApp 
{
	private String name;
	private int age;
	private String gender;
	
	public void setData(String na, int a, String g)
	{
		name = na;
		age = a;
		gender = g;
	}

	public String getName()
	{
		return name;
		
	} 
	public int getAge()
	{
		return age;
		
	}
	public String getGender()
	{
		return gender;
		
	}


}

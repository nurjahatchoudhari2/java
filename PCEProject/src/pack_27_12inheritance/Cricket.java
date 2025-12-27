package pack_27_12inheritance;

public class Cricket extends Player
{	
	public Cricket(String name,int age,String country)
	{	
		this.name = name;
		this.age = age;
		this.country = country;
	}
	
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String getCountry()
	{
		return country;
	}

	public void disp()
	{
		System.out.println("Cricket");
	}
}

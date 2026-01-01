package d27_12inheritance;

public class Cricket extends Player
{	
	int centuries;
	public Cricket(String name,int age,String country,int centuries)
	{	
		this.name = name;
		this.age = age;
		this.country = country;
		this.centuries = centuries;
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

	public int getCenturies()
	{
		return centuries;
	}
	public void disp()
	{
		System.out.println("Cricket");
	}
}

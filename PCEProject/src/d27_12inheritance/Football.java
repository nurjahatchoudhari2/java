package d27_12inheritance;

public class Football extends Player
{
	int goals;
	int assist;
	public Football(String name,int age,String country,int goals,int assist)
	{	
		this.name = name;
		this.age = age;
		this.country = country;
		this.goals = goals;
		this.assist = assist;
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
	public int getGoals()
	{
		return goals;
	}
	public int getAssist() {
		return assist;
	}

	public void disp()
	{
		System.out.println("Football");
	}

}

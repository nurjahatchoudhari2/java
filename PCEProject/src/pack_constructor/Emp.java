package pack_constructor;

public class Emp {
	private int id;
	private int salary;
	private String name;
	
	public Emp(int Id,int sal, String Name)
	{
		id = Id;
		salary = sal;
		name = Name;	
	}
	
	public int getEmpId()
	{
		return id;
	}
	public int getEmpSal()
	{
		return salary;
	}
	public String getEmpName()
	{
		return name;
	}

}

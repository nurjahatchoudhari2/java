package d26_12constroverloadding;

public class Employe {
	int empid;
	String name;
	int salary;
	//Local chaining;
	
	public Employe()
	{
		this(101,"Arsh",20);
		System.out.println("0 parametrize constructor call");
	}
	
	public Employe(int empid)
	{
		System.out.println("1 parametrize constructor call");
	}
	public Employe(int empid,String name)
	{
		this(101);
		System.out.println("2 parametrize constructor call");
	}
	public Employe(int empid,String name,int salary)
	{
		this(101,"Arsh");
		System.out.println("3 parametrize constructor call");
	}

}

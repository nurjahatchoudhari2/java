package pack_26_12inheritance;

public class Employee extends Object{

	private int empid;
	private String name;
	private int salary;
	
	public Employee(int empid,String name,int salary)
	{
		this.empid = empid;
		this.name = name;
		this.salary = salary;	
	}
	
	public int getEmpid()
	{
		return empid;
	}
	public String getName()
	{
		return name;
	}
	public int getSalary()
	{
		return salary;
	}
	public Employee()//zero parametrized constructor
	{
		this(101,"ARsh",20);
	}
	 
	//super method is always the first line of the constructor regardness of whether programmer has explicitely return it or not.
	//super method takes the control to the constructor of the direct parent class this is also known as contructor chaining.
	//in other word constructor chaining is the process of calling the constructor of the direct parent class by using super method in only one case when the programmer has explicitly return or called this() method.
	//super will not be the first line of the constructor.
	//this ()method can be used to call the constructor od the same class.
	//this process of calling thw constructor from another constructor of the same class by using this() method is also known as local chaining.
	//both this() method as well as suer() method have to be the first line of a constructor hence inside a constructor we can either call this or super method.
	//local chainig & constructor chaining
}
 
package d30_12ploymorphism;

public class poly1 
{ 
	public static void main(String [] args)
	{
		poly(new Army1());
		poly(new Navy1());
		
	}
	static void poly(Security s)
	{
		s.protect();
	}
}

class Security
{
	void protect()
	{
		System.out.println("protect");
	}
}

class Army1 extends Security
{
	void protect()
	{
		System.out.println("army");
	}
}

class Navy1 extends Security
{

	void protect()
	{
		System.out.println("navy");
	}
}



package d29_12Rulesofinheritance;

public class constructor {

	//local chaining & constructor chaining
	public static void main(String[] args) {
		Child7 c = new Child7(100,99);
		System.out.println(c.a + " " + c.b);
	}
}

class Parent7
{
	int a;
	int b;
	public Parent7()
	{
		this(99,99);
		a=10;
		b=20;
		System.out.println("O parametrized parent");
	}
	public Parent7(int a,int b)
	{
		this.a =a;
		this.b =b;
		System.out.println("2 parametrized parent");
	}
}

class Child7 extends Parent7
{ 
	public Child7()
	{
		a=30;
		b=40;
		System.out.println("O parametrized child");
	}
	public Child7(int a,int b)
	{ 
		this();
		this.a =a;
		this.b =b;
		System.out.println("2 parametrized child");
	}
}
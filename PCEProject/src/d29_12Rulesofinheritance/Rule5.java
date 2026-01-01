package d29_12Rulesofinheritance;

public class Rule5 {
	
	//Multi-Level Inheritance

	public static void main(String[] args) {
		Child5 c = new Child5();
		System.out.println(c.a);
		System.out.println(c.b);
	}

}

class GrandParent
{
	int a = 10;
	public GrandParent()
	{
		System.out.println("Grandparent Class");
	}
	
}
class Parent5 extends GrandParent
{
	int b = 20;
	public Parent5()
	{
		System.out.println("Parent Class");
	}
	
}
class Child5 extends Parent5
{
	public Child5()
	{
		System.out.println("Child Class");
	}
	
}

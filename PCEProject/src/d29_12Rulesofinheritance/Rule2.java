package d29_12Rulesofinheritance;

public class Rule2 {

	public static void main(String[] args) {
		Child1 c = new Child1();
		//System.out.println(c.a); // you cannot access the private member of the parent class.
		System.out.println(c.b);
		
		System.out.println("===========================");
		//c.Disp(); //you cannot acces the private methods of the class.

	}

}
class Parent1{
	
	private int a = 10;
	int b = 20;
	
	private void Disp() {
		System.out.println(a);
		System.out.println(b);
		
	}
}
class Child1 extends Parent1{
	
}
	
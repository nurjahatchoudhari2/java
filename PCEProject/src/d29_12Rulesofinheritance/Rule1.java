package d29_12Rulesofinheritance;

public class Rule1 {
	//rule1

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.a);
		System.out.println("===========================");
		c.Disp();

	}

}
class Parent{
	
	int a = 10;
	int b = 20;
	
	void Disp() {
		System.out.println(a);
		System.out.println(b);
		
	}
}
class Child extends Parent{
	
}

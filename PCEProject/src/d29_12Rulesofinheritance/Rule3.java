package d29_12Rulesofinheritance;

public class Rule3 {

	public static void main(String[] args) {
		Child2 c = new Child2();
		

	}

}
class Parent2{
	
	public Parent2() {
		System.out.println("Parent Constructor");
	}
	

}
class Child2 extends Parent2{
	//default constuctor's first line is super() that will directly call the parent of this class which ia parent2.
}

	
	 
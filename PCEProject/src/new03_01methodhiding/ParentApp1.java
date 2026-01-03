package new03_01methodhiding;


public class ParentApp1 {

	public static void main(String[] args) {

		Parent1 p = new Parent1();
		p.disp();
		Child1 c = new Child1();
		c.disp();
		Parent1 p1 = new Child1();
		p1.disp();           //parent.disp() //output = parent
		

	}

}

class Parent1 {
	 static void disp()
		{
			System.out.println("PArent Class");
		}
	

}

class Child1 extends Parent1{
	static void disp()
	{
		System.out.println("Child Class");
	}

}


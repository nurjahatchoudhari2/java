package new03_01methodriding;

public class ParentApp {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.disp();
		Child c = new Child();
		c.disp();
		Parent p1 = new Child();
		p1.disp();           //output depends only on the which class object we had create.
		
		 
	}

}
  
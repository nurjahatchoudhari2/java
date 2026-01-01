package d30_12ploymorphism;


public class Poly2 {

	public static void main(String[] args) {
		duty(new javaTrainer1());
		duty(new aptiTrainer1());
		duty(new testTrainer1());
		

	}
	static void duty(Trainer1 t)
	{
		t.Teacher();
	}

}
class Trainer1
{
	void Teacher()
	{
		System.out.println("teacher");
	}
}


class javaTrainer1 extends Trainer1
{
	void Teacher()
	{
		System.out.println("JavaTrainer");
	}
	
}
class aptiTrainer1 extends Trainer1
{
	void Teacher()
	{
		System.out.println("aptiTrainer");
	}
	
}
class testTrainer1 extends Trainer1
{
	void Teacher()
	{
		System.out.println("testTrainer");
	}
	
}
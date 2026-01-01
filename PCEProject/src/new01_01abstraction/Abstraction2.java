package new01_01abstraction;

public class Abstraction2 {

	public static void main(String[] args) {
		duty(new javaTrainer());
		duty(new aptiTrainer());
		duty(new testTrainer());
		

	}
	static void duty(Trainer t)
	{
		t.Teacher();
	}

}

abstract class Trainer
{
	abstract void Teacher();
}


class javaTrainer extends Trainer
{
	void Teacher()
	{
		System.out.println("JavaTrainer");
	}
	
}
class aptiTrainer extends Trainer
{
	void Teacher()
	{
		System.out.println("aptiTrainer");
	}
	
}
class testTrainer extends Trainer
{
	void Teacher()
	{
		System.out.println("testTrainer");
	}
	
}
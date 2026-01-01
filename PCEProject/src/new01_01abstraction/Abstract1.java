package new01_01abstraction;

public class Abstract1{
	public static void main(String[] args) {

		Ploy(new Navy());
		Ploy(new Army());
		Ploy(new AirForce());
		
		

	}
	static void Ploy(SecurityForce s)
	{
		s.protect();
	}

}

abstract class SecurityForce{
	abstract void protect();
}

class Army extends SecurityForce
{

	@Override
	void protect() {
		System.out.println("Armyy");
		
	}
}
class Navy extends SecurityForce
{
	void protect() {
		System.out.println("Navy");
	}
}
class AirForce extends SecurityForce
{
	void protect()
	{
		System.out.println("AirForcee");
	}
}
//in the above example it is certain the protect method of security force class shall always be overwritten.by the child classes
//hence there is no need of the methods in the security force class(Parent).
//but if we try to remove the method from the parent class the corresponding methods present in the child class will become spcialize.
//as a parent type reference can not access the specialized methodof child class so that we will not be achieved a benefits of polymorphism.
//to overcome the this problem in the above program we use abstraction.


//such method which have only signature and not the body are known as incomplete method or abstract methods.
//to declare a method as abstract we must use abstrct keyword.


//in java if a class has even a single abstract method the class itself must be declared as abstract.
//the biggest advantage of having abstract methods is that (i)there is no body hence less memory ocuupieeed
//(ii)the corresponding method in the child class remains overwritten hence the benefits of polymorphism could be achieved.
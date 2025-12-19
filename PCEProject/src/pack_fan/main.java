package pack_fan;

public class main 
{
	public static void main(String[] args)
	{
		Fan f1 = new Fan();
		Fan f2 = new Fan();
		
		System.out.println("After assigning");
		f1.brand = "BMW";
		f1.Cost = 500000000;
		f1.color = "Blue";
		
		System.out.println(f1.brand);
		System.out.println(f1.Cost);
		System.out.println(f1.color);
		
		f2.brand = "Mercedes";
		f2.Cost = 300000000;
		f2.color = "Black";
		
		System.out.println(f2.brand);
		System.out.println(f2.Cost);
		System.out.println(f2.color);
	}

}

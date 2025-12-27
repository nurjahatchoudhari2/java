package pack_27_12inheritance;

public class Program 
{
	public static void main(String[] args) {
		Cricket c = new Cricket("RohitSharma",34,"India");
		
		System.out.println(c.getName());
		System.out.println(c.getAge());
		System.out.println(c.getCountry());
		
		c.disp();
		c.show();
		
		Football f = new Football("Messi",38,"USA");
		
		System.out.println(f.getName());
		System.out.println(f.getAge());
		System.out.println(f.getCountry());
		
		f.disp();
		f.show();
		
	}
}

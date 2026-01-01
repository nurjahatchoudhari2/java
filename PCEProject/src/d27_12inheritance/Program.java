package d27_12inheritance;

public class Program 
{
	public static void main(String[] args) {
		Cricket c = new Cricket("RohitSharma",34,"India",100);
		
		System.out.println(c.getName());
		System.out.println(c.getAge());
		System.out.println(c.getCountry());
		System.out.println(c.getCenturies());
		
		c.disp();
		c.show();
		
		Football f = new Football("Messi",38,"USA",22,87);
		
		System.out.println(f.getName());
		System.out.println(f.getAge());
		System.out.println(f.getCountry());
		System.out.println(f.getGoals());
		System.out.println(f.getAssist());
		
		f.disp();
		f.show();
		
	}
}

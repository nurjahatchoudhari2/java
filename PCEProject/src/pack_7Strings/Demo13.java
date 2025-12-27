package pack_7Strings;

public class Demo13 {

	public static void main(String[] args) {
		 String s1 = "Arsh";
		 String s2 = new String("Arsh");
		 
		 if(s1==s2)
		 {
			 System.out.println("equal");
		 }
		 else
		 {
			 System.out.println("Not equal");
		 }
		 
		 if(s1.equals(s2))
		 {
			 System.out.println("equal");
		 }
		 else {
			 System.out.println("not equal");
		 }
		 

		 if(s1.equalsIgnoreCase(s2))
		 {
			 System.out.println("equal");
		 }
		 else {
			 System.out.println("not equal");
		 }

	}

}

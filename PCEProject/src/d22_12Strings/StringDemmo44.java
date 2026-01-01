package d22_12Strings;

public class StringDemmo44 {

	public static void main(String[] args) {
	
		 String s1 = new String("Deep");
		 String s2 = s1.intern();
		 
		 String s3 = s1.intern();
		  
		 
		 
		 if(s2==s3)
		 {
			 System.out.println("Equal");
		 }
		 else
		 {
			 System.out.println("Not Equal");
		 }
		 
		 if(s2.equals(s3))
		 {
			 System.out.println("Equal");
		 }
		 else
		 {
			 System.out.println("Not Equal");
		 }

	}

}

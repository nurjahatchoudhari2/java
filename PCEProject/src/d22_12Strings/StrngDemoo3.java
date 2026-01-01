package d22_12Strings;

public class StrngDemoo3 {

	public static void main(String[] args) {
		 String s1 = "md ";
		 String s2 = "Arsh";
		 
		 String s3 = "md "+"Arsh"; 
		 String s4 = "md Arsh";
		 
		 
		 if(s3==s4)
		 {
			 System.out.println("Equal");
		 }
		 else
		 {
			 System.out.println("Not Equal");
		 }
		 
		 if(s3.equals(s4))
		 {
			 System.out.println("Equal");
		 }
		 else
		 {
			 System.out.println("Not Equal");
		 }
		 

	}

}

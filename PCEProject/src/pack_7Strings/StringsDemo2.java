package pack_7Strings;

public class StringsDemo2 {

	public static void main(String[] args) {
		 String s1 = "md ";
		 String s2 = "Arsh";
		 
		 String s3 = s1.concat(s2);
		 String s4 = "md Arsh";
		 System.out.println(s2);
		 System.out.println(s1);
		 System.out.println(s3);
		 System.out.println(s4);
		 
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

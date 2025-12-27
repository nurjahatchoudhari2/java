package pack_7MutableString;

public class Demo1 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		
		sb.append("Ronaldo");
		System.out.println(sb.capacity()); 
		sb.append("Is a Great footballer");
		System.out.println(sb.capacity());
		
		 

	}

}

package d22_12MutableString;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ensure capacity
		

		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		sb.ensureCapacity(31);
		System.out.println(sb.capacity());
	}

}

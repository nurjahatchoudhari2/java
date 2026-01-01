package d22_12MutableString;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("Ronaldo");
		sb.trimToSize();
		System.out.println(sb.capacity());

	}

}

package pack_27_12staticblock;

public class Signatures 
{
	//main overloading;
	public static void main(String [] args) {
		 System.out.println("float");
		 main();
		 main("Hello");
		 int [] a = {1,2,3};
		 main(a);
	}
	
	public static void main(int [] args) {
		 System.out.println("int");
	}

	public static void main() {
		 System.out.println("no input");
	}

	public static void main(String a) {
		 System.out.println("accepting string");
	}
	

}

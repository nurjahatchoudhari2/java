package d20_12dsa;

public class ArrayCoppy {

	public static void main(String[] args) {
		int a[] = {10,20,30,40,50};
		
		int b[] = new int[a.length];
		
		int j = a.length-1;
		
		for(int i=0;i<a.length;i++)
		{
			b[i] = a[j-i];
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.println(b[i]);
			
		}
		 
		
	}

}

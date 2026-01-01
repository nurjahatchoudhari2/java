package d22_12demos;

public class BubbleSort {

	public static void main(String[] args)
	{
		 int a[] = {40,30,10,50,20,60};
		
		 int temp = 0;
		
		 
		 for(int i = 0; i < a.length; i++)
		 {
			 for(int j = 0; j < a.length-1; j++)
			 {
				 if(a[j] > a[j+1])
				 {
					 temp = a[j];
					 a[j] = a[j+1];
					 a[j+1] = temp;
				 }
			 }
		 }
		 
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.print(a[i] + "  ");
			 
		 }
	} 
}

package new29_01Dayhalf;

public class Demo1
{
	public static void main(String [] args)
	{

        String [] sarr = new String[5];
		sarr[0] = "mustang";
		sarr[1] = "RangeRover";
		sarr[2] = "Fortuner";
		sarr[3] = "mercedes";
		sarr[4] = "BMW";
		
		for(String s : sarr)
		{
			System.out.print(s + " ");
		}
		
		
		System.out.println();
		
		
		int [] Arr = new int[5];
		Arr[0] = 11;
		Arr[1] = 22;
		Arr[2] = 33;
		Arr[3] = 44;
		Arr[4] = 55;
		
		for(int a : Arr)
		{
			System.out.print(a + " ");
		}
		 
	}
}

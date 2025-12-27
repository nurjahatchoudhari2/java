package Pack_DaY5;

import java.util.Scanner;

public class Arrayelemnt {

	public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num to search in array");
        int num = scan.nextInt();
        
        boolean found = false;
        int idx = 0;
        
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				found = true;
				idx = i;
				break; 
			}	
		}
		if(found) {
			System.out.println("Key Present at index :" + idx);
		}
		else
		{
			System.out.println("Not found");
		}
	}

}

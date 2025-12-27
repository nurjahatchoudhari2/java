package Pack_DaY5;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int a[] = {10,20,30,40,50,60,};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num to search");
		int key = scan.nextInt();
		
		int low = 0;
		int high = a.length-1;
		Boolean found = false;

		int mid = (low + high)/2;
		int idx = 0;
		
		while(low <= high) 
		{ 
			if(a[mid] == key)
			{
					found = true;
					idx=mid;
					break;
			}
			else if(a[mid]<key)
			{
				low = mid + 1;
				mid = (low+ high)/2;
			}
			else  
			{
				high = mid-1;
				mid = (low+ high)/2;
		    }
		 
		}
		
		if(found)
		{
			System.out.println("Found at "+idx);
		}
		else
		{
			System.out.println("Not Found");
		}
	
	}

}

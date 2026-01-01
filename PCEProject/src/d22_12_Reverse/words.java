package d22_12_Reverse;

import java.util.StringTokenizer;

public class words {

	public static void main(String[] args) {
		String s = "Department of Computer Technology";
		StringTokenizer st = new StringTokenizer(s," ");
		
		
		 
		int count = 0;
		
		while(st.hasMoreTokens()==true)
		{
			count = count + 1;
			st.nextToken();
			
		}
		System.out.print(count);

	}

}

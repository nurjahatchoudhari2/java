package d22_12_Reverse;

import java.util.StringTokenizer;

public class movetoken {

	public static void main(String[] args) {
		String s = "Department of Computer Technology";
		System.out.println(s);
		StringTokenizer st = new StringTokenizer(s," ");
		
		//incomplete
		String ss1 = " ";
		String ss2 = " ";
		char c [] = s.toCharArray();
		
		
		for(int i = c.length-1; i >= 0; i--)
		{
			 System.out.print(c[i]);
			 
			 
		}
		System.out.println();
		
		while(st.hasMoreTokens()==true)
		{
		
			ss2 = st.nextToken()+" "+ss2;
			
			
		}
		System.out.println(ss2);
		 
		
		while(st.hasMoreTokens()==true)
		{
		
			ss1 = st.nextToken()+" "+ss1;
			
			
		}
		System.out.println(ss1);
		 

	}

}

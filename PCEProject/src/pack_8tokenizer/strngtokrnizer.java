package pack_8tokenizer;

import java.util.StringTokenizer;

public class strngtokrnizer {

	public static void main(String[] args) {
		String s = "Department of Computer Technology";
		StringTokenizer st = new StringTokenizer(s," ");
		
		while(st.hasMoreTokens()==true)
		{
			System.out.println(st.nextToken());
			
		}

	}

}

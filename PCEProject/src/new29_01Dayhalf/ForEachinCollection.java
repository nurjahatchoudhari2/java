package new29_01Dayhalf;

import java.util.ArrayList;
import java.util.Iterator;

public class ForEachinCollection {

	public static void main(String [] args)
	{
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(60);
		al.add(70);
		al.add(90);
		al.add(75);
		al.add(86);
		System.out.println(al);
		
		System.out.println("For Loop : ");
		for (int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i) + " ");
		}
		
		
		System.out.println();
		
		
		System.out.println("For Each : ");
		for(Object x : al)
		{
			System.out.print(x + " ");
		}
		
		
		
	}
}

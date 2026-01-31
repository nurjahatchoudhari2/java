package new31_01Dayy;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo 
{
	public static void main(String [] args)
	{
		Vector v = new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		System.out.println(v);
		
		
		Enumeration en = v.elements();
 
		while(en.hasMoreElements())
		{
			System.out.print(en.nextElement() + "   ");
		}
 		
	}
}

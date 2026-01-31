package new27_01Dayy;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraylistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add("Arsh");
		al.add(30.5);
		al.add(true);
		al.add('A');
		
		System.out.println(al);
		
		
		
		for (int i=0; i<al.size(); i++)
		{
			System.out.println(al);
		}
		
		for (Object  a : al)
		{
			System.out.print(a);
		}
		
		System.out.println();
		
		Iterator i = al.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next() + " ");
		}
		
		System.out.println();
		
		ListIterator i1 = al.listIterator();
		while(i1.hasNext())
		{
			System.out.print(i1.next()+" ");
		}
		
		System.out.println();
		
//		Iterator i2 = al.descendingIterator();
//		{
//			
//		}
////		
////		Enumeration en = al.elements();
//		 
//		while(en.hasMoreElements())
//		{
//			System.out.print(en.nextElement() + "   ");
//		}
// 		

		
	}
}
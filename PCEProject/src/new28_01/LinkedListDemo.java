package new28_01;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
	public static void main(String [] args)
	{
		LinkedList l1 = new LinkedList();
		l1.add(100);
		l1.add(50);
		l1.add(150);
		l1.add(99);
		l1.add(25);
		l1.add(1,99);
		System.out.println(l1);
		System.out.println(l1.get(2));

		
		LinkedList l2 = new LinkedList();
		l2.push(10);
		l2.push(20);
		l2.push(30);
		System.out.println(l2);
		
		l2.pop();
		System.out.println(l2);
		System.out.println(l2.peek());
		System.out.println(l2.peekFirst());
		System.out.println(l2.peekLast());
		System.out.println(l2.poll());
		System.out.println(l2);
		
		
		for (int i=0; i<l1.size(); i++)
		{
			System.out.println(l1);
		}
			
		for (Object  a : l1)
		{
			System.out.print(a);
		}
			
		
		System.out.println();
			
		Iterator i = l1.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next() + " ");
		}
			
		System.out.println();
			
		ListIterator i1 = l1.listIterator();
		while(i1.hasNext())
		{
			System.out.print(i1.next()+" ");
		}
			
		System.out.println();
			
		Iterator i2 = l1.descendingIterator();
        {
        	System.out.print(i2 + " ");
        }
        
        System.out.println();

//      Enumeration en = l2.elements();	 
//      while(en.hasMoreElements())
//		{
//			System.out.print(en.nextElement() + "   ");
//		}
//	 		

			
		}

		
	}
	

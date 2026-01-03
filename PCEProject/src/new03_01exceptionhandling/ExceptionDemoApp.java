package new03_01exceptionhandling;

import java.util.Scanner;

public class ExceptionDemoApp {

	public static void main(String[] args) {
		try {
		
		System.out.println("Connection---established");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num 1:");
		int a = scan.nextInt();
		System.out.println("Enter num 2 to Divide:");
		int b = scan.nextInt();
		int c = a/b;
	    System.out.println(c);
	    
	    System.out.println("Please enter size of an array");
	    int size = scan.nextInt();
	    int [] arr = new int[size];
	    System.out.println("Pleasee enter index number");
	    int n = scan.nextInt();
	    arr[n] = 999;
			
		} 
		//catch (Exception e){                        //you can't write the parent exception in the first because it directly handle all the exception then there is no need of other.
		//	System.out.println("other problem");             //then other blocks will be unreachable .
			
	    //	}
		catch (ArithmeticException e){
			System.out.println("Divide by 0 is not allowed");
			
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("please enter the index no. within the range");
			
		}
		catch (NegativeArraySizeException  e){
			System.out.println("please enter positive size of array");
			
		}
		catch (Exception e){
			System.out.println("other problem");
			
		}
		System.out.println("Connection----Terminated");
	}
}
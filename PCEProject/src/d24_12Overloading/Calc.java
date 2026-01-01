package d24_12Overloading;

public class Calc {
	
	
	int add(int a , int b)
	{
		int c = a + b;
		return c;
	}
	
	float add(int a , float b)
	{
		float c = a + b;
		return c;
	}
	
	float add(float a , int b)
	{
		float c = a+b;
		return c;
	}
	
	double add(double a , double b)
	{
		double c = a+b;
		return c;
	}
	
	double add(int a , float b, double c)
	{
		double d = a+b+c;
		return d;
	}
	double sub(double a , double b, double c)
	{
		double d = a+b+c;
		return d;
	}
	
		
	
}
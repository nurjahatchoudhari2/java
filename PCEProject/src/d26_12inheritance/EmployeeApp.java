package d26_12inheritance;


public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		Employee emp = new Employee();//correct
		//Employee emp = new Employee();//error
		//in the above program the compiler will look for such a constructor which does not accept any argument but there is no such constructor present in our class and hence we are going to get a compile time error.
		//only and only if the programmer has not define a constructor in the class the compiler will add the zero parametrized constructor.
		//such a constructor which is provided by a compiler when no constructor was provided by the programmer is known as default constructor.
		 
		
		System.out.println(emp.getEmpid());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		
		Employee e1 = new Employee(101,"Arsh",20);

		System.out.println(e1.getEmpid());
		System.out.println(e1.getName());
		System.out.println(e1.getSalary());
		
		
		
		

	}

}

package eclipse_test;

public class Main {

	public static void main(String[] args) 
	{
		//some logic will be implemented in here
		int i = 6;
		System.out.println("Hi there");
		System.out.println(factorial(i));
	}

	
	public static int factorial(int n)
	{
		if(n == 1)
			return 1;
		
		return n * factorial(n-1);
	}
}

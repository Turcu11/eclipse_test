package eclipse_test;
import java.util.ArrayList;
import java.util.*;

public class Main {

	public static void main(String[] args) 
	{
		//System.out.println(factorial(5));
		
		//ArrayList2D();
	}

	public static int factorial(int n)
	{
		if(n == 1)
			return 1;
		
		return n * factorial(n-1);
	}
	
	public static void ArrayList2D()
	{
		ArrayList<ArrayList<String>> listaMare = new ArrayList();
		
		ArrayList<String> listaBautura = new ArrayList();
		listaBautura.add("suc");
		listaBautura.add("apa minerala");
		listaBautura.add("cafea");
		
		ArrayList<String> listaBrutarie = new ArrayList();
		listaBrutarie.add("paine");
		listaBrutarie.add("cornuri");
		listaBrutarie.add("covrigi");

		listaMare.add(listaBautura);
		listaMare.add(listaBrutarie);
		
		System.out.println(listaMare);
	}
}

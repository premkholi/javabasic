package ab55;

public class MethodOverloading {

	
	static void add(int a, double b)
	{
		
		
	}
	
	static void add(int a,double b,int c)
	{
		
	}
	
	static void add (int a,int b)
	{
		
	}
	
	static void add (double a,double b)
	{
		
	}
	 void add (float a,float b)
	{
		
	}
	public static void main(String[] args) {
		add(100,3.144);
		add(100,3.145,5);
		add(100,5);
		add(100,5);
		MethodOverloading g1= new MethodOverloading();
		g1.add(2,3);
	}

}

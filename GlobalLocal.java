package ab53;

public class GlobalLocal {
	
	final static double pi=Math.PI;
	
	static int days=100;
	
	static void method1()
	{
		final int a= 100;
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		
		days= 10; //global variable 
		//pi=5; cannot change value now as its final
		int a=10; //local variable
		
		

	}

}

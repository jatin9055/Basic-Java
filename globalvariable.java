package ab53;

public class globalvariable {
	
	int a= 100;//global
	static int b=100;//global
	
	int c= 100;// non static global variable or instance variable
	
	
	static void add()
	{
		globalvariable g1= new globalvariable();
		System.out.println(g1.a);
		System.out.println(g1.a+b);
	}
	
	static void sub()
	{
		globalvariable g1= new globalvariable();
		System.out.println(g1.a);
		System.out.println(g1.a-b);
	}
	public static void main(String[] args) {
		
		globalvariable g1= new globalvariable();
		//System.out.println(g1.c);
		
		
		//System.out.println(g1.a);
		
		add();
		sub();

	}

}

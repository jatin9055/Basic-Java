package ab53;

public class NonStaticMethod {
	
	static double salary= 9000; // global variable
	int days =31; //global variable
	static double pi;
	static String name;
	
	
	void add()
	{
		System.out.println("Addition");
	}
	
	void sub()
	{
		System.out.println("Subtraction");
	}
	
	void mul()
	{
		System.out.println("Multiplication");
	}
	public static void main(String[] args) {
		
			System.out.println(name);
			System.out.println(pi);
		//Create an object
		//syntax- Classname variable= new classname();
		
		//with the help of refrence variable
		//variable.nonstaticmethod();
		
		NonStaticMethod n= new NonStaticMethod(); //create an object
		n.add();
		n.sub();
		n.mul();
		
		
	}

}

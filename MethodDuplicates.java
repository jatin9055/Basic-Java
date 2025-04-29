package ab53;

public class MethodDuplicates {

	//static method overloading
	static void add()
	{
		System.out.println("Method overloading 1");
	}
	static void add(int a)
	{
		System.out.println("Method overloading 2");

	}
	
	static void add(int a, int b)
	{
		System.out.println("Method overloading 3");

	}
	static void add(char a)
	{
		System.out.println("Method overloading 6");
	}
	
	static void add(String a, String b)
	{
		System.out.println("Method overloading 4");

	}
	
	//non-static method overloading
	void add(boolean a)
	{
		System.out.println("Method overloading 5");

	}
	
	
	public static void main(String[] args) {
		
		add();
		add(100);
		add(100, 56);
		add("Jatin", "Rose");
		MethodDuplicates m1= new MethodDuplicates();
		m1.add(true);
		add('J');
	}

}

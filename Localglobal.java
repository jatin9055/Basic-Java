package ab53;

public class Localglobal {
	
	
	int a=10;
	static int days=30;
	
	public static void main(String[] args) {
			
		//how to update value of local variable
		int b;
		b=100;
		System.out.println(b);
		
		
		
		//how to update the value of global variable?
		
		days=31;
		System.out.println(days);
		Localglobal l1= new Localglobal();
		l1.a=100;
		System.out.println(l1.a);
		
	}

}

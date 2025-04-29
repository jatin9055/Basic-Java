package ab53;

public class SIB_IIBprogram {
	
	//SIB 
	static
	{
		System.out.println("SIB");
	}
	
	//Constructor
	SIB_IIBprogram()
	{
		System.out.println("Constructor");
	}
	
	//IIB
	{
		
		System.out.println("IIB");
	}
	
	
	//Main Method
	public static void main(String[] args) {
		System.out.println("Main method");
		new SIB_IIBprogram();
		new SIB_IIBprogram();

	}

}

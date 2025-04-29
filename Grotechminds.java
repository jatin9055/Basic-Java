package ab53;

public class Grotechminds {
	
	
	Grotechminds() //1st contructor
	{
		System.out.println("This is  my 1 st constructor");
	}
	
	Grotechminds(int a) //2nd contructor
	{
		System.out.println("This is  my 2nd constructor");
	}
	
	public static void main(String[] args) {
		
		
	Grotechminds g1= new Grotechminds(); //1st syntax object creation
	new Grotechminds(); //object creation by 2nd syntax
	
	Grotechminds g2= new Grotechminds(50);
	new Grotechminds(100);
		
	}

}

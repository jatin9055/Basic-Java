package ab53;


abstract class AbstractClassProgram
{
	abstract void login();
	abstract void Logout();
}
public class concreteClass extends AbstractClassProgram
{
	
	static void add()
	{
		
	}
	
	void sub()
	{
		
	}

	public static void main(String[] args) {
		
		
		
	}

	void login() //concrete method
	{
		System.out.println("Logic");
	}

	@Override
	void Logout() //concrete method
	{
		 System.out.println("logout");
		
	}

}

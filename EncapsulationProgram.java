package ab53;
	
class SensitiveInformation{
	
	private String username="contact@grotechminds.com";
	public String getUsername() 
	{
		return username;
	}
	
	public void setUsername(String username)
	{
		
		this.username= username;
		
	}
	
	
	
	
}




public class EncapsulationProgram {

	public static void main(String[] args) {
		
		SensitiveInformation s1= new SensitiveInformation();
		s1.setUsername("Jatin@gmail.com");
		System.out.println(s1.getUsername());
		
		
		
	}

}

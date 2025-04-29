package ab53;

public class Switchcase {

	public static void main(String[] args) {
		
		String browser = "safari";
		
		switch (browser) {
		case "Chrome":
			System.out.println("Launching chrome broswer");
			//ChromeDriver driver = new ChromeDriver();
			break;
		case "edge":
			System.out.println("launching edge browser");
			break;
		case "safari":
			System.out.println("launching safari browser");
			break;
		case "firefox":
			System.out.println("launching firefox browser");
			break;
			
	
		default: System.out.println("please pass the right browser");
			break;
		}
		
		
		//=======================================
		
		switch(3) {
		case 1: System.out.println();
			break;
		case 2: System.out.println();
			//break;
		case 3: System.out.println("edge is launching");
			break;
		default: System.out.println();
		}

	}

}

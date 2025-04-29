package ab53;

import java.util.Scanner;

public class HumanInput {

	public static void main(String[] args) {
		
		
		Scanner s1= new Scanner(System.in);//to call the parameterized constructors	
		System.out.println("Enter the value of a");
		int a= s1.nextInt();
		
		System.out.println("Enter the value of b");
		int b= s1.nextInt();
		int sum= a+b;
		System.out.println("sum of given numbers is: " + sum);
		s1.close();

	}

}

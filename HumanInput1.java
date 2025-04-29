package ab53;


import java.util.Scanner;

public class HumanInput1 {

	public static void main(String[] args) {
		
		Scanner s1= new Scanner(System.in);
		
		String a= s1.next();
		int b = s1.nextInt();
		double c= s1.nextDouble();
		byte d= s1.nextByte();
		float e= s1.nextFloat();
		short f= s1.nextShort();
		long g= s1.nextLong();
		boolean l= s1.nextBoolean();
		
		s1.close();
		
	}

}

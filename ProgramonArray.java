package ab53;

import java.util.Arrays;

public class ProgramonArray 
{
public static void main(String[] args)
{

	String [] name=new String[3];
	name[0]="ram";
	name[1]="ankush";
	name[2]="jyoti";
	
	for(int i=0;i<3;i++)
	{
	System.out.println(name[i]);
	}
	System.out.println(Arrays.toString(name));
	
	int [] num= new int[5];  // datatype [] variablename = new datatype[size];
	num[0]= 90;
	num[1]= 54;
	num[2]= 76;
	num[3]= 67;
	num[4]= 89;
	//num[5]= 99; Array index out of bond exception
	
	System.out.println(Arrays.toString(num)); // method to print array statement
	
	char [] chart= new char[2];
	chart[0]= 'a';
	chart[1]= 'H';
	//chart[2]= 'G';
	
	System.out.println("Char array is : " + Arrays.toString(chart));
	
	
	
}
}

package Arrays_Concept;

import java.util.Arrays;

public class Arrayprogram1 {

	public static void main(String[] args) {
		//creating a simple array to store int values
		
		//datatype [] variablename= new datatype[size];
		
		int [] arr= new int[5];
		arr[0]= 10;
		arr[1]= 20;
		arr[2]= 20;
		arr[3]= 30;
		arr[4]= 50;
		
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(arr[i]);
		}
		System.out.println(Arrays.toString(arr));
		
	}
}

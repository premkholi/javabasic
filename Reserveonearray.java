package ab55;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Reserveonearray {

	public static void main(String[] args) {
	

		
		int []array1=new int [3];
		array1[0]=56;
		array1[1]=72;
		array1[2]=84;
		
		
		int[]array2=new int[array1.length];
		
		for(int i=0,j=3;i<array1.length;i++,j--)
		{
			
			array2[j]=array1[i];
		}
		
		System.out.println("this my 1st array -->"+Arrays.toString(array1));
		
		System.out.println("this my copied array -->"+Arrays.toString(array2));
		
		
				
	}

}

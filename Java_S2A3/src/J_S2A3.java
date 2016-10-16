/*   program to print the following pattern:
					  a
					 aba
					abcba
					 aba
					  a
  */

import java.util.*; // For using Scanner class for input

public class J_S2A3 {

	public static void main(String[] args) {
		int j;
		for(int i = 1; i <= 3; i++) //for 3 loops
		{
		for(j = 1; j <= 4-i; j++) //for spaces
		System.out.print(" ");
		for(j = 1; j <= 2*i-1; j++)
		if(j <= i)
		System.out.print((char)(char)(j+96)+""); //for printing values
		else
		System.out.print((char)(char)(2*i-j+96)+"");
		System.out.println(); //for line break
		}
		for(int m = 2; m >= 1; m--) //for 2 loops
		{for(int n = 1; n <= 4-m; n++)
		System.out.print(" "); //for spaces
		for(int n = 1; n <= 2*m-1; n++)
		if(n <= m)
		System.out.print((char)(char)(n+96)); //for printing values
		else
		System.out.print((char)(char)(2*m-n+96)); //for printing values
		System.out.println(); //for line break
		}
	}}

// Thank You

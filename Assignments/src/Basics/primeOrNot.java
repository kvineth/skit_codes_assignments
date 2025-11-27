package Basics;

import java.util.Scanner;

public class primeOrNot 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number to check prime or not:");
		int n=s.nextInt();
		boolean res=PrimeOrNot(n);
		if(res==true)
			System.out.println(n+" is a prime number");
		else
			System.out.println(n+" is not a prime number");
	}
	public static boolean PrimeOrNot(int n)
	{
		int c=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				c++;
		}
		return c==0;
	}
}

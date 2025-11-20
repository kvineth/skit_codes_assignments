package Assignments;

import java.util.Scanner;

public class PrimeOrNot 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check prime or not:");
		int n=sc.nextInt();
		boolean res=PrimeOrNot(n);
		if(res==true)
			System.out.println(n+" is a Prime number.");
		else
			System.out.println(n+" is not a prime number.");
	}
	public static boolean PrimeOrNot(int n)
	{
		int count=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				count++;
		}
		return count==0;
	}
}

package Basics;
import java.util.Scanner;

public class FactorialOfANumber 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to find factorial of it:");
		int n=s.nextInt();
		int f=1;
		for(int i=1;i<=n;i++)
		{
			f*=i;
		}
		System.out.println("Factorial of a given number is :"+f);
	}
}

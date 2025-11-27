package Basics;
import java.util.Scanner;

public class fibonacciSeries 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the numbers required in fibonacci series:");
		int n=s.nextInt();
		int f1=0,f2=1,f3;
		for(int i=1;i<=n;i++)
		{
			f3=f1+f2;
			System.out.print(f1+" ");
			f1=f2;
			f2=f3;
		}
	}
}

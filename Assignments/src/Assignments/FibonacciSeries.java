package Assignments;
import java.util.Scanner;

public class FibonacciSeries 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n value for number of fibonacci series:");
		int n=s.nextInt();
		int f1=0,f2=1,f3;
		for(int i=1;i<=n;i++)
		{
			f3=f1+f2;
			System.out.println(f1+" ");
			f1=f2;
			f2=f3;
		}
	}
}

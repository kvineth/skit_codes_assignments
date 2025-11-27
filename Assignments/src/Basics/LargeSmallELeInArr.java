package Basics;
import java.util.Scanner;

public class LargeSmallELeInArr
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length of an array:");
		int size=s.nextInt();
		int x[]=new int[size];
		System.out.println("Enter the elements of an array:");
		for(int i=0;i<size;i++)
		{
			x[i]=s.nextInt();
		}
		
		int big=x[0],small=x[0];
		
		for(int i=0;i<x.length;i++)
		{
			if(x[i]>big)
				big=x[i];
			
			if(x[i]<small)
				small=x[i];
		}
		System.out.println("Smallest element in an array is "+small);
		System.out.println("Largest element in an array is "+big);
		
	}
}

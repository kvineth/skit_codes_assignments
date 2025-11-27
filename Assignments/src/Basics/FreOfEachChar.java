package Basics;
import java.util.Scanner;

public class FreOfEachChar 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to check frequency of each character:");
		String s=sc.nextLine();
		int c[]=new int[128];
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			c[ch]++;
		}
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>0)
				System.out.println((char)i+"--------->"+c[i]);
		}
	}
}

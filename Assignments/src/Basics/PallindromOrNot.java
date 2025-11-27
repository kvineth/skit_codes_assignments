package Basics;

import java.util.Scanner;

public class PallindromOrNot 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to check pallindrome or not:");
		String s=sc.nextLine();
		String rev="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			rev=ch+rev;
		}
		if(s.equals(rev))
			System.out.println("Pallindrome");
		else
			System.out.println("Not a Pallindrome");
	}
}

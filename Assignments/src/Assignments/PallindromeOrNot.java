package Assignments;

import java.util.Scanner;

public class PallindromeOrNot
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to check pallindromw or not:");
		String s=sc.nextLine();
		
		boolean rs=isPallindrome(s);
		if(rs==true)
			System.out.println("Pallindrome.");
		else
			System.out.println("Not a Pallindeome.");
	}
	public static boolean isPallindrome(String s)
	{
		int i=0,j=s.length()-1;
		
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
}

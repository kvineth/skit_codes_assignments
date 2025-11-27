package Basics;
import java.util.Scanner;

public class CountVowelsConsaonants 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word to count vowels and consonants in it:");
		String s=sc.nextLine();
		int vc=0,cc=0;
		for(int i=0;i<s.length();i++)
		{
			
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
			{
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
					vc++;
				else
					cc++;
			}
		}
		System.out.println("Vowels count is "+vc);
		System.out.println("Consonants count is "+cc);
	}
}

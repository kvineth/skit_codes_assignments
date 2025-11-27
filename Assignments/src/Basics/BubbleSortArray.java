package Basics;
import java.util.Scanner;

public class BubbleSortArray 
{

    public static void main(String[] args) 
    {
    	Scanner s=new Scanner(System.in);
    	System.out.println("Enter the length of an array:");
		int size=s.nextInt();
		int x[]=new int[size];
		System.out.println("Enter the elements of an araay:");
		for(int i=0;i<size;i++)
		{
			x[i]=s.nextInt();
		}
        int n = x.length;

        for (int i = 0; i < n - 1; i++) 
        {
            for (int j = 0; j < n - i - 1; j++) 
            {
                if (x[j] > x[j + 1]) 
                {
                    int temp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(x[i] + " ");
        }
    }
}
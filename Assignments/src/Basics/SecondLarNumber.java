package Basics;
import java.util.Scanner;

public class SecondLarNumber {

    public static int findSecondLargest(int[] arr) 
    {
        if (arr == null || arr.length < 2) 
        {
            System.out.println("Array is too small or null to find a second largest element.");
            return -1; 
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] > largest) 
            {
                secondLargest = largest; 
                largest = arr[i];        
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];  
            }
        }

        if (secondLargest == Integer.MIN_VALUE) 
        {
            
            System.out.println("No distinct second largest element found.");
            return -1;
        }

        return secondLargest;
    }

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
		int sle=findSecondLargest(x);
		System.out.println("Second largest element of given array is: "+sle);
		
    }
}
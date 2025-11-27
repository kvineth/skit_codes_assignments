package Oops;
import java.util.Scanner;

public class highAvgMarksOfStu
{
	public static void main(String[] args) 
    {
		highAvgMarksOfStu student1 = new highAvgMarksOfStu("Alice", 85, 90, 78);
		highAvgMarksOfStu student2 = new highAvgMarksOfStu("Bob", 75, 88, 92);
		highAvgMarksOfStu student3 = new highAvgMarksOfStu("Charlie", 90, 82, 85);

        double avg1 = student1.calculateAverage();
        double avg2 = student2.calculateAverage();
        double avg3 = student3.calculateAverage();

        double highestAverage = avg1;
        String studentWithHighestAverage = student1.name;

        if (avg2 > highestAverage) 
        {
            highestAverage = avg2;
            studentWithHighestAverage = student2.name;
        }

        if (avg3 > highestAverage) 
        {
            highestAverage = avg3;
            studentWithHighestAverage = student3.name;
        }


        System.out.println("The student with the highest average is: " + studentWithHighestAverage);
        System.out.println("Highest average marks: " + highestAverage);
    }
    String name;
    int marks1;
    int marks2;
    int marks3;

    public highAvgMarksOfStu(String name, int marks1, int marks2, int marks3) 
    {
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public int calculateTotal() 
    {
        return marks1 + marks2 + marks3;
    }

    public double calculateAverage() 
    {
        return (double) calculateTotal() / 3;
    }

    
}
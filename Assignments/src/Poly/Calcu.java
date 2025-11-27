package Poly;


public class Calcu {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calcu myCalculator = new Calcu();

        // Calling the add method with two arguments
        int sumTwoNumbers = myCalculator.add(5, 10);
        System.out.println("Sum of two numbers: " + sumTwoNumbers);

        // Calling the add method with three arguments
        int sumThreeNumbers = myCalculator.add(5, 10, 15);
        System.out.println("Sum of three numbers: " + sumThreeNumbers);
    }
}
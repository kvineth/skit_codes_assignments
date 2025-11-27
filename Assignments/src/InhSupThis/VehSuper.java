package InhSupThis;

class Vehicle 
{	
    String brand;

    // Constructor for Vehicle
    public Vehicle(String brand) 
    {
        this.brand = brand;
    }
}



// Child class
class Car extends Vehicle 
{
    String model;

    // Constructor for Car
    public Car(String brand, String model) 
    {
        // Call the parent constructor using super()
        super(brand);
        // Initialize the child variable using this
        this.model = model;
    }

    // Method to display car details
    public void printDetails() 
    {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}



public class VehSuper
{
    public static void main(String[] args) 
    {
        // Create an instance of Car
        Car myCar = new Car("Toyota", "Camry");

        // Print the brand and model
        myCar.printDetails();
    }
}
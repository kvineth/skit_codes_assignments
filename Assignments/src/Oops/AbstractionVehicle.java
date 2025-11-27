package Oops;
import java.util.Scanner;

public class AbstractionVehicle 
{
    public static void main(String[] args) 
    {
        Vehicle myVehicle;

        myVehicle = new Car();
        System.out.println("--- Operating a Car ---");
        myVehicle.vehicleInfo();
        myVehicle.start();
        myVehicle.stop();

        System.out.println(); 

        myVehicle = new Bike();
        System.out.println("--- Operating a Bike ---");
        myVehicle.vehicleInfo();
        myVehicle.start();
        myVehicle.stop();
    }
}

abstract class Vehicle 
{
    public abstract void start();
    public abstract void stop();

    public void vehicleInfo() 
    {
        System.out.println("This is a vehicle.");
    }
}


class Car extends Vehicle 
{
    @Override
    public void start() 
    {
        System.out.println("Car started with a key.");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped by turning off the ignition.");
    }

    @Override
    public void vehicleInfo() {
        System.out.println("This is a Car.");
    }
}


class Bike extends Vehicle 
{
    @Override
    public void start() 
    {
        System.out.println("Bike started with a kick start.");
    }

    @Override
    public void stop() 
    {
        System.out.println("Bike stopped by applying brakes.");
    }

    @Override
    public void vehicleInfo() 
    {
        System.out.println("This is a Bike.");
    }
}

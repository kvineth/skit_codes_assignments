package Polymor;

import java.lang.Math; // Required for Math.PI

//Define the Shape interface
interface Shape 
{
 double area(); // Method to calculate the area of a shape
}

//Implement the Circle class
class Circle implements Shape 
{
 private double radius;

 public Circle(double radius) 
 {
     this.radius = radius;
 }

 @Override
 public double area() 
 {
     return Math.PI * radius * radius;
 }
}

//Implement the Rectangle class
class Rectangle implements Shape 
{
 private double length;
 private double width;

 public Rectangle(double length, double width) 
 {
     this.length = length;
     this.width = width;
 }

 @Override
 public double area() 
 {
     return length * width;
 }
}

//Implement the Triangle class
class Triangle implements Shape 
{
 private double base;
 private double height;

 public Triangle(double base, double height) 
 {
     this.base = base;
     this.height = height;
 }

 @Override
 public double area() 
 {
     return 0.5 * base * height;
 }
}

//Main class to demonstrate polymorphism
public class ShapeDemo 
{
 public static void main(String[] args) 
 {
     // Create an array of Shape references
     Shape[] shapes = new Shape[4];

     // Store different shape objects in the array
     shapes[0] = new Circle(5.0);
     shapes[1] = new Rectangle(4.0, 6.0);
     shapes[2] = new Triangle(7.0, 3.0);
     shapes[3] = new Circle(2.5); // Another circle

     // Calculate and print the area of each shape using polymorphism
     for (Shape shape : shapes) {
         System.out.println("Area: " + shape.area());
     }
 }
}
package Polymor;

//Base class
class Animal {
 public void sound() {
     System.out.println("The animal makes a sound.");
 }
}

//Subclass Dog
class Dog extends Animal {
 @Override
 public void sound() {
     System.out.println("The dog barks: Woof! Woof!");
 }
}

//Subclass Cat
class Cat extends Animal {
 @Override
 public void sound() {
     System.out.println("The cat meows: Meow! Meow!");
 }
}

//Main class to demonstrate polymorphism
public class PolymorphismAniDog {
 public static void main(String[] args) {
     // Create an Animal reference and assign a Dog object
     Animal myDog = new Dog();
     myDog.sound(); // Calls the overridden sound() method in Dog

     // Create an Animal reference and assign a Cat object
     Animal myCat = new Cat();
     myCat.sound(); // Calls the overridden sound() method in Cat

     // Create an Animal reference and assign an Animal object
     Animal generalAnimal = new Animal();
     generalAnimal.sound(); // Calls the sound() method in Animal
 }
}

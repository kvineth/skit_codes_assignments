package InhSupThis;



public class AnimalDog
{
	 public static void main(String[] args) 
	 {
	     Animal genericAnimal = new Animal();
	     System.out.print("Calling sound() on an Animal object: ");
	     genericAnimal.sound(); 

	     System.out.println(); 

	     
	     Dog myDog = new Dog();
	     System.out.print("Calling sound() on a Dog object: ");
	     myDog.sound();

	     System.out.println(); 

	     
	     Animal polymorphicAnimal = new Dog();
	     System.out.print("Calling sound() on an Animal reference pointing to a Dog object: ");
	     polymorphicAnimal.sound(); // Calls the overridden sound() method from Dog class
	 }
}

class Animal
{
 public void sound() 
 {
     System.out.println("The animal makes a sound.");
 }
}


class Dog extends Animal 
{
	public void sound() 
	{
		System.out.println("The dog barks: Woof! Woof!");
	}
}



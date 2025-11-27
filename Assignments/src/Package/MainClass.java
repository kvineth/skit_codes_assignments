package Package;

//MyClass.java
class MyClass 
{
 private String privateVariable = "This is a private variable.";

 public void accessPrivateVariableInsideClass() 
 {
     System.out.println("Inside MyClass, accessing privateVariable: " + privateVariable);
 }
}

//MainClass.java
public class MainClass 
{
 public static void main(String[] args) 
 {
     MyClass obj = new MyClass();

     // This line will compile successfully because privateVariable is accessed within MyClass
     obj.accessPrivateVariableInsideClass();

     // This line will cause a compile-time error because privateVariable is private
     // System.out.println("Outside MyClass, attempting to access privateVariable: " + obj.privateVariable);
 }
}
// Java Program to Illustrate Method Calling
// Via Different Ways of Calling a Method

// Importing required classes
import java.io.*;

// Class 1
// Helper class
class Test {

    public static int i = 0;

    // Constructor of class
    Test()
    {

        // Counts the number of the objects of the class
        i++;
    }

    // Method 1
    // To access static members of the class and
    // and for getting total no of objects
    // of the same class created so far
    public static int get()
    {

        // statements to be executed....
        return i;
    }

    // Method 2
    // Instance method calling object directly
    // that is created inside another class 'GFG'.

    // Can also be called by object directly created in the
    // same class and from another method defined in the
    // same class and return integer value as return type is
    // int.
    public int m1()
    {

        // Display message only
        System.out.println(
            "Inside the method m1 by object of GFG class");

        // Calling m2() method within the same class.
        this.m2();

        // Statements to be executed if any
        return 1;
    }

    // Method 3
    // Returns nothing
    public void m2()
    {

        // Print statement
        System.out.println(
            "In method m2 came from method m1");
    }

	#feature203 changes by Developer Ana Oct2023 for CitiBank ApplicationException
	// create a method
  public int addNumbers(int a, int b) {
    int sum = a + b;
    // return value
    return sum;
  }

  public static void main(String[] args) {
    
    int num1 = 25;
    int num2 = 15;

    // create an object of Main
    Main obj = new Main();
    // calling method
    int result = obj.addNumbers(num1, num2);
    System.out.println("Sum is: " + result);
  }
}

	#feature202 branch new method added by Developer Vivek on  Oct2023
	public void method(int n) 
    { 
        if (n % 2 == 0) 
            System.out.println("geeksforgeeks"); 
        else
            System.out.println("GEEKSFORGEEKS"); 
    } 
  
    public static void main(String[] args) 
    { 
        TempI in1 = new Temp(); 
        TempI in2 = new Temp(); 
        in1.method(4); 
        in2.method(3); 
    } 

}

/* 
   Program to ask for a user's name and three variables and run calculations with these variables.      
   Programmer: Jacob Roberson, File Name: Exercise_1b.java, Date created: 8/24/2019 
*/

//packages for Scanner and Math class objects
import java.util.Scanner;
import java.lang.Math;
class ScannerClassExample
{
  //example of using the scanner class
  //which simplifies user input and output
  //this is part of the JDK 1.8.0_45 compiler

public static void main(String args[])	
{
  //declare a Scanner class object
  Scanner sc = new Scanner(System.in);
	
  //prompt user for their name
  System.out.println("please enter your name");
	
  //declare a local variable and read the integer
  String name = sc.nextLine();
	
  //display the name back to the user
  System.out.println("hello " + name);
	
  //prompt user for a number
  System.out.println("please enter 3 integers");
	
  //declare a local variables and read the integers
  float w = sc.nextInt();
  float x = sc.nextInt();
  float y = sc.nextInt();
  //define all variables
  float sum = 0, sub = 0, quo = 0, z = 0;
  //display the numbers back to the user
  System.out.println("you entered " + w + ", " + x + ", and " + y);
  //add x and y, sum
  sum = x + y;
  //display the sum of x and y
  System.out.println("the sum of " + x + " and " + y + " is " + sum);
  //subtract y from x, sub
  sub = y - x;
  //display the result of x - y
  System.out.println(y + " - " + x + " is " + sub);
  //multiply x and y and assign to variable w
  w = x * y;
  //display w
  System.out.println("the product of " + x + " and " + y+ " is " + w);
  //divide x by y, quo
  quo = x / y;
  //display quo
  System.out.println("the quotient of " + x + " by " + y + " is " + quo);
  //calculate the modulus of x and y and assign to w
  w = x % y;
  //display w
  System.out.println("The modulus of " + x + " and " + y + " is " + w);
  //divide y by x and assign to z
  quo = y / x;
  //display z
  System.out.println("the quotient of " + y + " by " + x + " is " + z);
  //raise x by y, result
  double result = Math.pow(x, y);
  //display result
  System.out.println(x + " to the power of " + y + " is "+ result);
  sc.close();
}
}

/* 
   Program to calculate the circumference and surface area of a sphere.      
   Programmer: Jacob Roberson, File Name: Exercise_1a.java, Date created: 8/24/2019 
*/

//packages for DecimalFormat and JOptionPane class objects
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Exercise_1a
{
	//Here is that math problem written in the Java language.
	
	public static void main(String args[]) 
	{
	//Format the code to read and display numbers including two digits after the decimal
	  DecimalFormat twoPlace = new DecimalFormat("0.00");
	  //First, knowing that the area of a circle is 
	  double A = 62.80, r = 0, C = 0, S = 0;
	  //compute the radius r
	  r = Math.sqrt(A / 3.1416); 
	  //compute the circumference C 
	  C  =  2 * 3.1416 * r;
	  //display the circumference
	  JOptionPane.showMessageDialog(null, "the circumference: " + twoPlace.format(C), "Result", JOptionPane.PLAIN_MESSAGE);
	  //compute surface area S
	  S = 4 * 3.1416 * r * r;
	  //display the surface area
	  JOptionPane.showMessageDialog(null, "the surface area: " + twoPlace.format(S), "Result", JOptionPane.PLAIN_MESSAGE);
	}
}

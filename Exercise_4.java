//Program to calculate a patients BMI
//Programer: Jacob Roberson File name: Exercise_4.java Date created: 9/11/2019
import java.util.*;
public class Exercise_4 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the following information:");
System.out.print("height (in feet)? ");
int feet = sc.nextInt();
System.out.print("and ___ inches? ");
int inches = sc.nextInt();
double height = (feet *12) + inches;
System.out.print("weight (in pounds)? ");
int pounds = sc.nextInt();
System.out.print("and ___ ounces? ");
int ounces = sc.nextInt();
double weight = ((1/16)*ounces) + pounds;
double bmi = weight * 703 / height / height;
System.out.printf("BMI = %.2f\n", bmi);
if (bmi < 18.5) {
System.out.println("you are underweight");
} else if (bmi < 25) {
System.out.println("you are normal");
} else if (bmi < 30) {
System.out.println("you are overweight");
} else {
System.out.println("you are obese");
		}
	}
}

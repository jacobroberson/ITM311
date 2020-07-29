/* 
   Program to ask for a user's demographic data.      
   Programmer: Jacob Roberson, File Name: Demograph.java, Date created: 8/26/2019 
*/

//import java scanner class
import java.util.Scanner;

public class Demograph {

  public static void main(String args[]) { 
    // introduce a Scanner class object
    Scanner sc = new Scanner(System.in); 
    //Initialize variables
    String strName = "", strCity = "", strState = "", strCountry = "", JAVA = "";
    int courses = 0, hours = 0;
    char myChar = 'Y';
    //ask user for their name and city, state, and country that they live in
    System.out.println("please enter your name");
    strName = sc.nextLine();
    System.out.println("please enter the city you are from");
    strCity = sc.nextLine();
    System.out.println("please enter the state you are from");
    strState = sc.nextLine();
    System.out.println("please enter the country you are from");
    strCountry = sc.nextLine();
    //ask how many courses the user is taking
    System.out.println("please enter the number of courses you are taking");
    courses = sc.nextInt();
    //ask the user how many credit hours they are taking
    System.out.println("please enter the number of credit hours you are taking");
    hours = sc.nextInt();
    //ask the student if they like JAVA "Y"=yes "N"=no
    System.out.println("Do you like JAVA? Enter 'Y' for yes or 'N' for no");
    JAVA = sc.next();
    myChar = JAVA.charAt(0);
    //Display the data the user entered
    System.out.println(strName + " is from " + strCountry + ".");
    System.out.println(strName + "'s hometown is " + strCity + ", " + strState + ".");
    System.out.println(strName + " is enrolled in " + courses + " courses.");
    System.out.println(strName + " is enrolled in " + hours + " credit hours.");
    System.out.println("Does " + strName + " like Java?");
    System.out.println(myChar);
  }
}

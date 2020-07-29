/* 
   Program to convert seconds into hours, minutes, and seconds.      
   Programmer: Jacob Roberson, File Name: TimeConverter.java, Date created: 9/5/2019 
*/

import java.util.*;
public class TimeConverter {
	 public static void main(String[] args)
	    {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Input seconds: ");
			int totSeconds = in.nextInt(); 
	        int seconds = totSeconds % 60;
	        int hours = totSeconds / 60;
	        int minutes = hours % 60;
	        hours /=  60;
	        System.out.println(hours + " hour, " + minutes + " minutes, " + seconds + " seconds.");
	    }    
	 }

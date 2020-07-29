import java.util.Random;
public class Homework7 {
	    public static void main(String[] args){
	        Random randnum = new Random();
	        int i = 0, t = 0;
	        double sum = 0, mean = 0;
	        int[] arr = new int[100];
	        for(i = 0; i < 5; i++) {
	            arr[i] = randnum.nextInt(100);
	               System.out.print(arr[i] + "  ");
	        }
	               for(i = 0; i < 5; i++) {
	            	   if(arr[i] > 70) {
	            		  sum =+ arr[i];  
	            		  t++;
	            	   }
	               }
	               mean = sum/t;
	               if(mean > 0)
	            	   System.out.print("The average of the integers greater than 70 is " + mean);
	               else
	            	   System.out.println("There are no numbers greater than 70 in the array");
	    }
}

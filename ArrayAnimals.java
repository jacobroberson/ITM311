import java.util.*;
//program to demo StringBuilder
public class ArrayAnimals
{
  public static void main(String[] args)
  {
	  StringBuilder sb = new StringBuilder();
    String Animals[] = {"Lion","Tiger","Bear","Zebra" ,"Elephant","Gorilla","Rhinoceros"};
  
for(int i =0; i<Animals.length;i++) 
     sb.append(Animals[i]);
     sb.append("Hyena");
     System.out.println(sb);
     //delete Zebra..Find start and end position of Zebra 
     sb.delete(13,18);
   //display the String;
    System.out.println(sb);
  //replace an element
    sb.replace(21, 28, "Chimpanzee");
    //display the String;
    System.out.println(sb);
    //sort the array
   // But cannot use StringBuilder 
  //as there is no associated  //method
Arrays.sort(Animals);
     for (String Animal:Animals)
    System.out.println(Animal);
//reverse sort
Arrays.sort(Animals);
	 for (int a = 6; a > -1; a--)
	System.out.println(Animals[a]);
     
  }
}

import java.io.*;
//Create a class WriteFile
class WriteFile
 {
    public static void main (String[] args)

    {
//try catch block
      try 
       {
        //create a FileWriter object  to create a file
        FileWriter file = new FileWriter("Ibsen.txt");
//can also use "Ibsen.txt"
	 
  //create a BufferedWriter object to write 
  //to the file

   BufferedWriter buffer = new BufferedWriter(file);

  //add statements to write lines of text 
  buffer.write("Hedda Gabler");
	buffer.newLine();
  buffer.write("by Henrik Ibsen");
	buffer.newLine();

  buffer.write("Good god, people don't do such things!");
	buffer.newLine();



  //close the BufferedWriter Object
        buffer.close();
       }
      catch (IOException e)
      {
        System.out.println("A write error has occurred");
	  }
   }
}

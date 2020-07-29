import java.util.*;
public class Homework_5 
{
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			char status = ' ';
			double GPA = 0;
			System.out.println("Please enter the student's GPA: ");
			GPA = sc.nextDouble();
			System.out.println("Is this student enrolled full-time? (Enter 'Y' for yes and 'N' for no): ");
			status = sc.next().charAt(0);
			if(status == 'Y' || status == 'y'){
				if(GPA >= 3.50){
					System.out.println("This student is on the Dean's List"); 
					}
				else {
					System.out.println("This student is not on the Dean's List");
				}
			}
			else {
				System.out.println("This student is not on the Dean's List");
			}
			
		}
	}

public class StringSearch {
public static void main (String[] args)
{
	String[]books = 
		{"The Great Gatsby", "Lord of the Flies",
			"Their Eyes Were Watching God", "A Long Way Gone","The Giver",
			"Hatchet"};
	int counter1 = 0, counter2 =0, counter3 = 0;
	for(int i=0; i<books.length;i++)
	{
		System.out.print(books[i].substring(0,4) + "|");
	
	//insert statement to count titles with certain ending
	if(books[i].endsWith("Flies")) counter1++;
	//insert statement to count titles with specific beginning
	if(books[i].startsWith("The")) counter2++;
	//insert statement to count titles found not containing specified substring
	if(books[i].indexOf("Giver")==-1) counter3++;
	}
	//display search results
	
	System.out.println("\nFound " + counter1 + " titles from this series");
	System.out.println("\nFound " + counter2 + " title with The");
	System.out.println("\nFound " + counter3 + " other titles");
		
}
}

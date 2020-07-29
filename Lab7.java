import java.util.Scanner;
 //Jacob Roberson, Programmer
 public class Maze 
 {
  static Scanner sc = new Scanner(System.in);
  // maze movements
  static char myMove = '\0';
  // cell position
  static int currentCell = 0;
  static int score = 0, moves = 0;
  static boolean advance = true;
  static boolean checkThis = false;
  public static void main(String args[])
  {
   // the local variables declared and initialized
   char answer = 'Y';
  
   displayMenu();  
      
   while(answer == 'Y' || answer == 'y') 
   {
	displayMovement();
	makeYourMove();
	checkThis = checkYourMove();
	mazeStatus();
      
	System.out.println("move again(Y or N)?");
      answer = sc.next().charAt(0);
      
  }
   System.out.println("***************************");
   Moves();
   Score();
}// end main() method

static void displayMenu()
{
   System.out.println("");
   System.out.println("***************************");
   System.out.println("----The Maze Strategy---");
   System.out.println("");
}// end method
static void displayMovement()
{
	if(currentCell == 0)
	{
		System.out.println("You have entered the maze!!");
		System.out.println("There is no turning back!!");
		moves++;
		score += 5;
		currentCell = 1;
		mazeStatus();
		advance = true;
	}
      System.out.println("make your move (W, A, S, D)");
      System.out.println("W = up, A = left, S = down, D = right)");
}// end method

static void makeYourMove()
{
	myMove = sc.next().charAt(0);
	
	switch(myMove)
	{
	  case 'W': { MoveUp(); break; }
	  case 'A': { MoveLeft(); break; }
	  case 'S': { MoveDown(); break; }
	  case 'D': { MoveRight(); break; }
	}
   // end program menu
 }// end method
static boolean checkYourMove()
{
	if(currentCell == 1 && advance == true)
	{
		if (myMove == 'W')
		{
			score --;
			advance = false;
			System.out.println("try again");
			return advance;
		}
		if (myMove == 'A')
		{
			score --;
			advance = false;
			System.out.println("SORRY, there is no return");
			return advance;
		}
		if (myMove == 'D')
		{
			score += 5;
			moves++;
			currentCell = 2;
			advance = true;
			System.out.println("continue through the maze");
			return advance;
		}
		if (myMove == 'S')
		{
			score --;
			advance = false;
			System.out.println("try again");
			return advance;
		}
	}
	if(currentCell == 2 && advance == true)
	{
		if (myMove == 'W')
		{
			score --;
			advance = false;
			System.out.println("try again");
			return advance;
		}
		if (myMove == 'A')
		{
			score --;
			advance = false;
			System.out.println("SORRY, there is no return");
			return advance;
		}
		if (myMove == 'D')
		{
			score --;
			advance = false;
			System.out.println("try again");
			return advance;
		}
		if (myMove == 'S')
		{
			score += 5;
			moves++;
			currentCell = 5;
			advance = true;
			System.out.println("continue through the maze");
			return advance;
		}
	}
	if(currentCell == 5 && advance == true)
	{
		if (myMove == 'W')
		{
			score --;
			advance = false;
			System.out.println("SORRY, there is no return");
			return advance;
		}
		if (myMove == 'A')
		{
			score --;
			advance = false;
			System.out.println("try again");
			return advance;
		}
		if (myMove == 'D')
		{
			score += 5;
			moves++;
			currentCell = 6;
			advance = true;
			System.out.println("continue through the maze");
			return advance;
		}
		if (myMove == 'S')
		{
			score --;
			advance = false;
			System.out.println("try again");
			return advance;
		}
	}
	if(currentCell == 6 && advance == true)
	{
		if (myMove == 'W')
		{
			score += 5;
			moves++;
			currentCell = 3;
			advance = true;
			System.out.println("continue through the maze");
			return advance;
		}
		if (myMove == 'A')
		{
			score --;
			advance = false;
			System.out.println("SORRY, there is no return");
			return advance;
		}
		if (myMove == 'D')
		{
			score --;
			advance = false;
			System.out.println("try again");
			return advance;
		}
		if (myMove == 'S')
		{
			score += 5;
			moves++;
			currentCell = 9;
			advance = true;
			System.out.println("continue through the maze");
			return advance;
		}
	}
	if(currentCell == 3 && advance == true)
	{
		if (myMove == 'W')
		{
			score --;
			advance = false;
			System.out.println("try again");
			return advance;
		}
		if (myMove == 'A')
		{
			score --;
			advance = false;
			System.out.println("try again");
			return advance;
		}
		if (myMove == 'D')
		{
			score --;
			advance = false;
			System.out.println("try again");
			return advance;
		}
		if (myMove == 'S')
		{
			score += 5;
			moves++;
			currentCell = 6;
			advance = true;
			System.out.println("continue through the maze");
			return advance;
		}
	}
	if(currentCell == 9 && advance == true)
	{
		if (myMove == 'W')
		{
			score --;
			advance = false;
			System.out.println("SORRY, there is no return");
			return advance;
		}
		if (myMove == 'A')
		{
			score += 5;
			moves++;
			currentCell = 8;
			advance = true;
			System.out.println("continue through the maze");
			return advance;
		}
		if (myMove == 'D')
		{
			score --;
			advance = false;
			System.out.println("try again");
			return advance;
		}
		if (myMove == 'S')
		{
			score += 5;
			moves++;
			currentCell = 10;
			advance = true;
			System.out.println("Congradulations, you have reached the finish \npress N to end the game");
			return advance;
		}
	}
	if(currentCell == 8 && advance == true)
	{
		if (myMove == 'W')
		{
			score --;
			advance = false;
			System.out.println("try again");
			return advance;
		}
		if (myMove == 'A')
		{
			score += 5;
			moves++;
			currentCell = 7;
			advance = true;
			System.out.println("continue through the maze");
			return advance;
		}
		if (myMove == 'D')
		{
			score += 5;
			moves++;
			currentCell = 9;
			advance = true;
			System.out.println("continue through the maze");
			return advance;
		}
		if (myMove == 'S')
		{
			score --;
			advance = false;
			System.out.println("try again");
			return advance;
		}
	}
	if(currentCell == 7 && advance == true)
	{
		if (myMove == 'W')
		{
			score += 5;
			moves++;
			currentCell = 4;
			advance = true;
			System.out.println("continue through the maze");
			return advance;
		}
		if (myMove == 'A')
		{
			score --;
			advance = false;
			System.out.println("try again");
			return advance;
		}
		if (myMove == 'D')
		{
			score += 5;
			moves++;
			currentCell = 8;
			advance = true;
			System.out.println("continue through the maze");
			return advance;
		}
		if (myMove == 'S')
		{
			score --;
			advance = false;
			System.out.println("try again");
			return advance;
		}
	}
	if(currentCell == 4 && advance == true)
	{
		if (myMove == 'W')
		{
			score --;
			advance = false;
			System.out.println("try again");
			return advance;
		}
		if (myMove == 'A')
		{
			score --;
			advance = false;
			System.out.println("try again");
			return advance;
		}
		if (myMove == 'D')
		{
			score --;
			advance = false;
			System.out.println("try again");
			return advance;
		}
		if (myMove == 'S')
		{
			score += 5;
			moves++;
			currentCell = 7;
			advance = true;
			System.out.println("continue through the maze");
			return advance;
		}
	}
	return advance;
	// end program menu
 }// end method
static void Moves()
{
	System.out.println("Total moves: " + moves);
}// end method
static void Score()
{
	if(moves == 6) {
		System.out.println("Congradulations, you completed the maze in the minimum amount of moves!");
		System.out.println("As a reward you will recieve an extra 100 points to your score");
		score += 100;
	}
	System.out.print("Total score: " + score);
}
static void MoveLeft()
{
   System.out.println("you moved to the left");
   
}//end method
static void MoveRight()
{
	 System.out.println("you moved to the right");
	
}//end method
static void MoveUp()
{
	System.out.println("you moved up (forward)");
	
}//end method
static void MoveDown()
{
	System.out.println("you moved down (downward)");
	
}//end method
static void mazeStatus()
{
	if(currentCell == 10) {
		System.out.println("current position: finish");
	}
	else System.out.println("current position: cell " + currentCell);
}//end method
}// end class

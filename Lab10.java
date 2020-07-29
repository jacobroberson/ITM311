import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
//Jacob Roberson
public class GiftCards
{
  static NumberFormat nf = NumberFormat.getCurrencyInstance();
  Date myDate = new Date();
  String myDateFormat = "MM/dd/yyyy";
  SimpleDateFormat dtToday = new SimpleDateFormat(myDateFormat);
      
  // define the class data members 
  public int expires;
  public double balance;
  private double deducted;
  public int cardNum;
  private char cardType;
  public String issueDate;
  private String holder; 
  
  // define the member methods
  // default constructor
  public GiftCards() {}
  // overloaded constructor
  public GiftCards(String n, double amt, double useCard) 
  {
    holder = n;
    balance = amt;
    deducted = useCard;
    expires = 2023;
    cardType = 'R';
  }
  public void IssueGiftCard() 
  {
	  System.out.println("");
	  System.out.println(" Card Issued");
	  System.out.println(" Today's Date is: " + dtToday.format(myDate));
	  System.out.println(" Card Type . . . . " + cardType);
	  System.out.println(" Card Holder . . . " + holder);
	  System.out.println(" Card Number . . . " + cardNum);
	  System.out.printf(" Card Amount . . . $%.2f\n", balance);
	  System.out.println(" Expires . . . . . " + expires);
  }
public double getBalance()
  {
    return balance;
  }
  public void setBalance(double b) 
  {
    balance = b;
  }
  public double getDeducted()
  {
	  return deducted;
  }
  public void setDeducted(double d)
  {
	  deducted = d;
  }
  public String getHolder()
  {
    return holder;
  }
  public void setHolder(String h) 
  {
    holder = h;
  }
  public void printCurrentGiftCardInfo(double spend) 
  {
	  System.out.println("");
	  System.out.println(" Card Balance");
	  System.out.println(" Today's Date is: " + dtToday.format(myDate));
	  System.out.printf(" Deducted . . . .  $%.2f\n", deducted);
	  System.out.printf(" Card Amount . . . $%.2f\n", (balance-deducted));
  }
}

import javax.swing.JOptionPane;
public class TestGiftCards 
//Jacob Roberson
{
	public static void main(String[] args) 
	{
		GiftCards gc = new GiftCards("", 0.0, 0.0);
		
		// display opening message
		String message = "welcome";
		JOptionPane.showMessageDialog(null, "Message: " + message,
		"Message", JOptionPane.PLAIN_MESSAGE);
		
		// set the gift card holder's name
		String str = 
		JOptionPane.showInputDialog(null, "gift card holder's name : ");
		gc.setHolder(str);
		
		// obtain the gift card number
		str = JOptionPane.showInputDialog(null, "gift card number : ");
		gc.cardNum = Integer.parseInt(str);
		
		// set the gift card amount
		str = JOptionPane.showInputDialog(null, "gift card amount : ");
		gc.setBalance(Double.parseDouble(str));
		
		// issue the gift card
		gc.IssueGiftCard();
		
		// use the gift card
		double useCard = 0;
		str = 
		JOptionPane.showInputDialog(null, "deduct amount from card : ");
		useCard = Double.parseDouble(str);
		
		// verify amount to deduct will not yield negative balance
		if(useCard > gc.balance) {
			System.out.println("You do not have enough funds for this");
		}
		else {
		gc.setDeducted(useCard);
		}
		// print current card balance
		gc.printCurrentGiftCardInfo(useCard);
	}
}

// package lab4; 
import java.util.Scanner;
// Jacob Roberson, Programmer
public class PrattParkingGarage
{
  static Scanner sc = new Scanner(System.in);
  public static void main(String args[])
  {
    // the local variables declared and initialized
    char answer = 'Y', specEvent = 'N', rateCode = '\0';
    int ticketNum = 0;
    int timeIn = 0, timeOut = 0, timeDiff = 0;
    double amountTendered = 0.0, changeDue = 0.0;
    double flatFee = 0.0, monthFee = 0.0;
    double EXTRA_CHARGE = 0.0;
    double coupon = 0.0, tip = 0.0;
    double flatTax = 3.00, totalDueFromCust = 0.0;
    double accRevenue = 0.0, accTax = 0.0, accTip = 0.0;
    int intCoupon = 0, accCoupon = 0;
    
    System.out.println("");
    System.out.println("");
    System.out.println("***************************");
    System.out.println("----Pratt Parking Garage---");
    System.out.println("***************************");
    System.out.println("");
    System.out.println("");
    while(answer == 'Y' || answer == 'y')
    {
      System.out.println("--------- M E N U ---------");
      System.out.println("data entry process: enter each of these");
      System.out.println("customer ticket number ->");
      ticketNum = sc.nextInt();
      System.out.println("ticket number " + (ticketNum));
      System.out.println("time in (military)");
      timeIn = sc.nextInt();
      System.out.println("time out (military)");
      timeOut = sc.nextInt();
      timeDiff = timeOut - timeIn;
      System.out.println("time difference " + (timeDiff));
    
      System.out.println("rate code: (F or M)");
      rateCode = sc.next().charAt(0);
      System.out.println("rate code: " + rateCode);
      if (rateCode == 'F')
      {
        flatFee = 10.00;
        totalDueFromCust = flatFee;
      }
      if (rateCode == 'M')
      {
        monthFee = 90.00;
        totalDueFromCust = monthFee;
        // monthly fee is deferred 
        totalDueFromCust = 0;	
      }
      System.out.println("tip amount");
      tip = sc.nextDouble();
      System.out.printf("tip: $%.2f\n", tip);
      totalDueFromCust += tip;
    
      System.out.printf("flat tax: $%.2f\n", flatTax);
      totalDueFromCust += flatTax;
    
      System.out.println("special event(Y or N)?");
      specEvent = sc.next().charAt(0);
      if(specEvent == 'Y') EXTRA_CHARGE = 10;
        totalDueFromCust += EXTRA_CHARGE;
      System.out.println("coupon amount");
      coupon = sc.nextDouble();
      totalDueFromCust -= coupon;
      if(coupon > 0)
    	  intCoupon ++;
    
      accRevenue += totalDueFromCust;
      accTax += flatTax;
      accTip += tip;
      accCoupon += intCoupon;
    		  
      System.out.printf("total charge: $%.2f\n", totalDueFromCust);
      System.out.println("amount tendered from customer");
      amountTendered = sc.nextDouble();
      changeDue = amountTendered - totalDueFromCust;
      System.out.printf("change: $%.2f\n", changeDue);
      System.out.println("***************************");
      System.out.println("run again(Y or N)?");
      answer = sc.next().charAt(0);
      // reset all pertinent variables before the next loop 
      // i.e. prior to servicing the next customer
      // by assigning a zero to the appropriate variables
      specEvent = 'N'; rateCode = '\0';
      ticketNum = 0;
      timeIn = 0; timeOut = 0; timeDiff = 0;
      amountTendered = 0.0; changeDue = 0.0;
      flatFee = 0.0; monthFee = 0.0;
      EXTRA_CHARGE = 0.0;
      coupon = 0.0; tip = 0.0;
      totalDueFromCust = 0;
    }
    System.out.println("***************************");
    System.out.printf("total revenue: $%.2f\n", accRevenue);
    System.out.printf("total tax: $%.2f\n", accTax);
    System.out.printf("total tip: $%.2f\n", accTip);
    System.out.println("total number of cupons used:" + accCoupon);
  }// end main()
}// end class

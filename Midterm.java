//Programmer Jacob Roberson
import java.util.*;
public class MidtermITM311 {
	static Scanner sc = new Scanner(System.in);
	static char ans = 'Y', discountAns = 'N';
	static String name = "", hotelName = "", hotelLocation = "", accommodation = "";
	static int year = 0, month = 0, day = 0, numDays = 0, discountNum = 0, customerNum = 1;
	static double discount = 0, studentDiscount = .1, seniorDiscount = .2, birthdayDiscount = .15,
			corporateDiscount = .25, salesTax = 0, subtotal = 0, TotalAfterDiscount = 0, GrandTotal = 0, CostPerDay = 0;
	static String[] summary = new String [14];
	static int[] custNumber = new int [8];
	static String[] custName = new String [8];
	static String[] hotel = new String [8];
	static String[] hotelLoc = new String [8];
	static String[] date = new String [8];
	static String[] room = new String [8];
	static int[] days = new int [8];
	static String[] cost = new String [8];
	static String[] tax = new String [8];
	static String[] discountType = new String [8];
	static String[] discountAmmount = new String [8];
	static String[] subtot = new String [8];
	static String[] tad = new String [8];
	static String[] grandtot = new String [8];
	public static void main(String[] args) {
		summary[0] = "Customer Number"; summary[1] = "Customer Name"; summary[2] = "Hotel"; summary[3] = "Hotel Location"; summary[4] = "Date of Reservation";
		summary[5] = "Room Accomodations"; summary[6] = "Number of days to reserve"; summary[7] = "Cost in USD per night"; summary[8] = "Sales Tax";
		summary[9] = "Type Discount"; summary[10] = "Discount Amount"; summary[11] = "Subtotal"; summary[12] = "Total After Discount";
		summary[13] = "Grand Total after Tax";
		Creator();
		displayMenu();
		while(ans == 'Y' || ans == 'y'){
			custNumber[customerNum - 1] = customerNum;
			ReservationNumber();
			Name();
			Hotel();
			Room();
			Date();
			calcCost();
			Discount();
			calcTax();
			calcTotal();
			System.out.println("Would you like to enter another reservation?");
			System.out.println("Enter 'Y' for yes or 'N' for no");
			ans = sc.next().charAt(0);
			sc.nextLine();
			customerNum++;
		}
		System.out.println("***************************");
		System.out.println("Thank you for using the Northwoods Hotel Reservation System");
		System.out.println("You made the following reservations: ");
		Summary();
		System.out.println("***************************");
	}
	static void Creator() {
		System.out.println("This program was created by Jacob Roberson on 10/19/2019");
		System.out.println("***************************");
	}
	static void displayMenu() {
		System.out.println("Welcome to Northwoods Hotel Reservation System");
		System.out.println("Enter the information when prompted to complete your reservation");
	}
	static void ReservationNumber() {
		System.out.println("Reservation " + customerNum + ":");
	}
	static void Name() {
		System.out.println("Please enter your name: ");
		//name = sc.next();
		name = sc.nextLine();
		System.out.println("Hello " + name);
		custName[customerNum - 1] = name;
	}
	static void Hotel() {
		System.out.println("Please enter the name of the hotel that you would like to stay at");
		hotelName = sc.nextLine();
		System.out.println("Please enter the location of the hotel at which you would like to stay");
		hotelLocation = sc.nextLine();
		System.out.println("You have have entered the " + hotelName + " in " + hotelLocation);
		hotel[customerNum - 1] = hotelName;
		hotelLoc[customerNum - 1] = hotelLocation;
	}
	static void Room() {
		System.out.println("Please enter the room accommodations you would like");
		accommodation = sc.nextLine();
		System.out.println("You entered: " + accommodation);
		room[customerNum - 1] = accommodation;
	}
	static void Date() {
		System.out.println("Please enter the date you would like to reserve as follows");
		System.out.println("Please enter the last two digits of the year (i.e. '2019' = 19)");
		year = sc.nextInt();
		System.out.println("Please enter the month numerically (i.e. 'July' = 7) ");
		month = sc.nextInt();
		System.out.println("Please enter the day numerically ");
		day = sc.nextInt();
		System.out.println("Now, please enter the number of days you would like to reserve");
		numDays = sc.nextInt();
		System.out.println("You have reserved " + numDays + " days, starting on " + month + "/" + day + "/" + year);
		days[customerNum - 1] = numDays;
		date[customerNum - 1] = (month + "/" + day + "/" + year);
	}
	static void calcCost() {
		switch(customerNum) {
		case 1: CostPerDay = 350; cost[customerNum - 1] = String.format("$%,.2f", CostPerDay);  break;
		case 2: CostPerDay = 141; cost[customerNum - 1] = String.format("$%,.2f", CostPerDay); break;
		case 3: CostPerDay = 150; cost[customerNum - 1] = String.format("$%,.2f", CostPerDay); break;
		case 4: CostPerDay = 61; cost[customerNum - 1] = String.format("$%,.2f", CostPerDay); break;
		case 5: CostPerDay = 380; cost[customerNum - 1] = String.format("$%,.2f", CostPerDay); break;
		case 6: CostPerDay = 800; cost[customerNum - 1] = String.format("$%,.2f", CostPerDay); break;
		case 7: CostPerDay = 1000; cost[customerNum - 1] = String.format("$%,.2f", CostPerDay); break;
		case 8: CostPerDay = 314; cost[customerNum - 1] = String.format("$%,.2f", CostPerDay); break;
		}
	}
	static void calcTax() {
		switch(customerNum) {
		case 1: salesTax = .09; tax[customerNum -1] = String.format("%.0f%%", (salesTax * 100)); break;
		case 2: salesTax = .07; tax[customerNum -1] = String.format("%.0f%%", (salesTax * 100)); break;
		case 3: salesTax = .1; tax[customerNum -1] = String.format("%.0f%%", (salesTax * 100)); break;
		case 4: salesTax = .01; tax[customerNum -1] = String.format("%.0f%%", (salesTax * 100)); break;
		case 5: salesTax = .06; tax[customerNum -1] = String.format("%.0f%%", (salesTax * 100)); break;
		case 6: salesTax = .08; tax[customerNum -1] = String.format("%.0f%%", (salesTax * 100)); break;
		case 7: salesTax = .05; tax[customerNum -1] = String.format("%.0f%%", (salesTax * 100)); break;
		case 8: salesTax = .07; tax[customerNum -1] = String.format("%.0f%%", (salesTax * 100)); break;
		}
	}
	static void Discount() {
		System.out.println("Do you have an applicaple discount?");
		System.out.println("Enter 'Y' for yes or 'N' for no");
		discountAns = sc.next().charAt(0);
		//discountAns = sc.nextLine();
		if(discountAns == 'Y' || discountAns == 'y') {
			System.out.println("Please enter the number corresponding to your discount as follows");
			System.out.println("Enter '1' for the Student Discount");
			System.out.println("Enter '2' for the Senior Discount");
			System.out.println("Enter '3' for the Birthday Discount");
			System.out.println("Enter '4' for the Corporate Discount");
			discountNum = sc.nextInt();
			switch(discountNum) {
			case 1: discount = studentDiscount; System.out.println("The 10% Student Discount will be applied"); 
			discountType[customerNum - 1] = "Student"; discountAmmount[customerNum - 1] = String.format("%.0f%%", (discount * 100)); break;
			case 2: discount = seniorDiscount; System.out.println("The 20% Senior Discount will be applied");
			discountType[customerNum - 1] = "Senior"; discountAmmount[customerNum - 1] = String.format("%.0f%%", (discount * 100)); break;
			case 3: discount = birthdayDiscount; System.out.println("The 15% Birthday Discount will be applied");
			discountType[customerNum - 1] = "Birthday"; discountAmmount[customerNum - 1] = String.format("%.0f%%", (discount * 100)); break;
			case 4: if(numDays >= 5) {
				discount = corporateDiscount;
				System.out.println("The 25% Corporate Discount will be applied");
				discountType[customerNum - 1] = "Corporate"; discountAmmount[customerNum - 1] = String.format("%.0f%%", (discount * 100));
			}
			else {
				discount = 0;
				System.out.println("Your stay must be longer than 5 days to apply the Corporate Discount");
				System.out.println("No discount will be applied");
				discountType[customerNum - 1] = "None"; discountAmmount[customerNum - 1] = String.format("%.0f%%", (discount * 100));
			}; break;
			default: discount = 0; discountType[customerNum - 1] = "None"; discountAmmount[customerNum - 1] = String.format("%.0f%%", (discount * 100));
			}
		}
		else {
			discount = 0;
			System.out.println("No discount will be applied");
			discountType[customerNum - 1] = "None"; discountAmmount[customerNum - 1] = String.format("%.0f%%", (discount * 100));
		}
	}
	static void calcTotal() {
		subtotal = (CostPerDay * numDays);
		System.out.printf("Your subtotal will be $%.2f\n", subtotal);
		TotalAfterDiscount = subtotal - (subtotal * discount);
		System.out.printf("Your subtotal after the discount will be $%.2f\n", TotalAfterDiscount);
		GrandTotal = TotalAfterDiscount + (TotalAfterDiscount * salesTax);
		System.out.printf("Your grand total including tax will be $%.2f\n", GrandTotal);
		subtot[customerNum - 1] = String.format("$%,.2f", subtotal);
		tad[customerNum - 1] = String.format("$%,.2f", TotalAfterDiscount);
		grandtot[customerNum - 1] = String.format("$%,.2f", GrandTotal);
	}
	static void Summary() {
		for(int z = 0; z <= 13; z++) {
		System.out.print((summary[z]) + ", ");
		}
		System.out.print("\n");
		for(int i = 0; i <= 7; i++) {
		System.out.println((custNumber[i]) + ", " + (custName[i]) + ", " + (hotel[i]) + ", " + 
		(hotelLoc[i]) + ", " + (date[i]) + ", " + (room[i]) + ", " + (days[i]) + ", " + 
				(cost[i]) + ", " + (tax[i]) + ", " + (discountType[i]) + ", " + (discountAmmount[i]) + 
				", " + (subtot[i]) + ", " + (tad[i]) + ", " + (grandtot[i]));
		}
	}
}

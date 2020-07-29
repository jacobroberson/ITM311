import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class newframe extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	  JLabel l1, l2;
	  JButton b1, b2;
	  JTextField t1, t2;
	  String[] hotelnames = { "--HOTEL NAME--", "Ritz-Carlton", "Comfort Inn", "Hyatt", "The View Hotel", "Grand Hotel", "Plaza Hotel", "Burj Al Arab Jumeirah", "Royal York Hotel" };
	  String[] hotellocations = { "--HOTEL LOCATION--", "Chicago, IL", "Madison, WI", "Los Angeles, CA", "Sussex, UK", "Mackinac, MI", "New York, NY", "Dubai, UAE", "Toronto, Ontario" };
	  String[] roomtypes = { "--ACCOMODATIONS--", "Single Bed", "Double Bed", "Suite", "Brindle Suite", "10 Suites" };
	  String[] numbers = { "--NUMBER OF DAYS BOOKED--", "1", "2", "3", "4", "5", "6", "7" };
	  String[] discounttypes = { "NO DISCOUNT", "Senior", "Student", "Birthday", "Corporate" };
	  String[] paymentmethod = { "--PAYMENT METHOD--", "Credit/Debit Card", "Paypal", "Google Pay", "Amazon Pay", "Apple Pay" };
	  JComboBox hotel, location, accomodation, numDays, discount, payment; 
			  
	  newframe() 
	  {
		JMenuBar menuBar = new JMenuBar();
		JMenu mnFile = new JMenu("File");
		JMenuItem mntmExit = new JMenuItem("Exit");
		JMenu mnHelp = new JMenu("Help");
		JMenuItem mntmAbout = new JMenuItem("About");
		

		
	    l1 = new JLabel(" Name (First and Last)");
	    l2 = new JLabel(" Date (mm-dd-yy)");
	    

	    b1 = new JButton("SUBMIT");
	    b2 = new JButton("EXIT");
	  
	    t1 = new JTextField(10);
	    t2 = new JTextField(10);
	    
	    hotel = new JComboBox(hotelnames);
	    location = new JComboBox(hotellocations);
	    accomodation = new JComboBox(roomtypes);
	    numDays = new JComboBox(numbers);
	    discount = new JComboBox(discounttypes);
	    payment = new JComboBox(paymentmethod);

	    
	    add(menuBar);
	    menuBar.add(mnFile);
	    mnFile.add(mntmExit);
	    menuBar.add(mnHelp);
	    mnHelp.add(mntmAbout);
	    setJMenuBar(menuBar);
	    mntmExit.addActionListener(e -> System.exit(0));

	    
	    add(l1);
	    add(t1);
	    add(hotel);
	    hotel.addActionListener(this);
	    add(location);
	    location.addActionListener(this);
	    add(l2);
	    add(t2);
	    add(accomodation);
	    accomodation.addActionListener(this);
	    add(numDays);
	    numDays.addActionListener(this);
	    add(discount);
	    discount.addActionListener(this);
	    add(payment);
	    payment.addActionListener(this);
	    add(b1);
	    add(b2);
		b1.addActionListener(this);
	    b2.addActionListener(e -> System.exit(0));
	    mntmAbout.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent arg0)
			 {
			   JOptionPane.showMessageDialog(null, "Programmer: Jacob Roberson\n" +
			 "This program is designed to place hotel reservations\n" +
					   "Enter the requested information, then enter your payment method to make your reservation", 
			   "About", JOptionPane.PLAIN_MESSAGE);
			 }
	});

	    setSize(500,500);
	    setLayout(new GridLayout(6,2));
	    setTitle("Hotel Reservation");
	  }
	  public void actionPerformed(ActionEvent ae)
	  {
	    double subtotal = 0, TotalAfterDis = 0, price = 0;
	    String custName = "", hotelName = "", hotelLoc = "", date = "", accom = "", days = "", dis = "", payMethod = "";
	    String message = ""; 
	    Object n, l, a, i, d, p;
	    
	    
	    
	    if(ae.getSource() == b1)
	    {
	      custName = t1.getText();
	      date = t2.getText();
	      n = hotel.getSelectedItem();
		  l = location.getSelectedItem();
		  a = accomodation.getSelectedItem();
		  i = numDays.getSelectedItem();
		  d = discount.getSelectedItem();
		  p = payment.getSelectedItem();
		  hotelName = n.toString();
		  hotelLoc = l.toString();
		  accom = a.toString();
		  days = i.toString();
		  dis = d.toString();
		  payMethod = p.toString();
		  
		  switch(hotelName) {
		   case "Ritz-Carlton": subtotal += 350; break;
		   case "Comfort Inn": subtotal += 141; break;
		   case "Hyatt": subtotal += 150; break;
		   case "The View Hotel": subtotal += 61; break;
		   case "Grand Hotel": subtotal += 380; break;
		   case "Plaza Hotel": subtotal += 800; break;
		   case "Burj Al Arab Jumeirah": subtotal += 1000; break;
		   case "Royal York Hotel": subtotal += 314; break;
		  }
		  switch(days) {
		   case "1": subtotal *= 1; break;
		   case "2": subtotal *= 2; break;
		   case "3": subtotal *= 3; break;
		   case "4": subtotal *= 4; break;
		   case "5": subtotal *= 5; break;
		   case "6": subtotal *= 6; break;
		   case "7": subtotal *= 7; break;
		  }
		  switch(dis) {
		   case "Senior": TotalAfterDis = subtotal - (subtotal * .2); break;
		   case "Student": TotalAfterDis = subtotal - (subtotal * .1); break;
		   case "Birthday": TotalAfterDis = subtotal - (subtotal * .15); break;
		   case "Corporate": TotalAfterDis = subtotal - (subtotal * .25); break;
		   default: TotalAfterDis = subtotal; break;
		  }
		  switch(hotelLoc) {
		   case "Chicago, IL": price = TotalAfterDis + (TotalAfterDis * .09); break;
		   case "Madison, WI": price = TotalAfterDis + (TotalAfterDis * .07); break;
		   case "Los Angeles, CA": price = TotalAfterDis + (TotalAfterDis * .1); break;
		   case "Sussex, UK": price = TotalAfterDis + (TotalAfterDis * .01); break;
		   case "Mackinac, MI": price = TotalAfterDis + (TotalAfterDis * .06); break;
		   case "New York, NY": price = TotalAfterDis + (TotalAfterDis * .08); break;
		   case "Dubai, UAE": price = TotalAfterDis + (TotalAfterDis * .05); break;
		   case "Toronto, Ontario": price = TotalAfterDis + (TotalAfterDis * .07); break;
		  }
	      if(payMethod == paymentmethod[1]) {
	    	  message = "";
	    	  Payment payframe = new Payment();
	    	  payframe.setVisible(true);
	    	  dispose();
	      }
	      if(payMethod == paymentmethod[2] || payMethod == paymentmethod[3] || payMethod == paymentmethod[4] || payMethod == paymentmethod[5]) {
	    	  message = "";
	    	  Payment2 payframe = new Payment2();
		      payframe.setVisible(true);
		      dispose();
	      }
	      message = ("Thank you " + custName + ". You have submitted a Reservation at " + hotelName + " in " +hotelLoc + " for " + days + 
		    		" days starting on " + date + ".\nAccomodations: " + accom + "\nDiscount: " + dis + "\nPayment Method: " + payMethod + "\nSubtotal: $" + subtotal +
		    		"\nPrice after discount: $" + TotalAfterDis + "\nTotal Cost: $" + price);
	      JOptionPane.showMessageDialog(null, message, "Reservation Summary", JOptionPane.PLAIN_MESSAGE);
	    }
	  }

	  public static void main(String args[])
	  {
	    newframe a = new newframe();
	    a.setVisible(true);
	    a.setLocation(200,200);
	  }
	}
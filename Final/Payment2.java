import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Payment2 extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	  JLabel l1, l2;
	  JButton b1, b2;
	  JTextField t1;
	  JPasswordField t2;
	   
			  
	  Payment2() 
	  {
		JMenuBar menuBar = new JMenuBar();
		JMenu mnFile = new JMenu("File");
		JMenuItem mntmExit = new JMenuItem("Exit");
		JMenu mnHelp = new JMenu("Help");
		JMenuItem mntmAbout = new JMenuItem("About");
		

		
	    l1 = new JLabel(" Username");
	    l2 = new JLabel(" Password");
	    

	    b1 = new JButton("SUBMIT");
	    b2 = new JButton("BACK");
	  
	    t1 = new JTextField(10);
	    t2 = new JPasswordField(10);

	    
	    add(menuBar);
	    menuBar.add(mnFile);
	    mnFile.add(mntmExit);
	    menuBar.add(mnHelp);
	    mnHelp.add(mntmAbout);
	    setJMenuBar(menuBar);
	    mntmExit.addActionListener(e -> System.exit(0));

	    
	    add(l1);
	    add(t1);
	    add(l2);
	    add(t2);
	    add(b1);
	    add(b2);
		b1.addActionListener(this);
	    b2.addActionListener(this);
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
	    setLayout(new GridLayout(3,2));
	    setTitle("Payment");
	  }
	  public void actionPerformed(ActionEvent ae) { 
		if(ae.getSource() == b1) {  
		  Receipt receiptframe = new Receipt();
    	  receiptframe.setVisible(true);
    	  dispose();
		}
		if(ae.getSource() == b2) {
			newframe newframe = new newframe();
			newframe.setVisible(true);
			dispose();
		}
	  }

	  public static void main(String args[])
	  {
	    Payment payframe = new Payment();
	    payframe.setVisible(true);
	    payframe.setLocation(200,200);
	  }
}

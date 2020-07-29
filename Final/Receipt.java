import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Receipt extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	  JButton b1, b2;
	  JTextField t1;
	  
	   
			  
	  Receipt() 
	  {
		JMenuBar menuBar = new JMenuBar();
		JMenu mnFile = new JMenu("File");
		JMenuItem mntmExit = new JMenuItem("Exit");
		JMenu mnHelp = new JMenu("Help");
		JMenuItem mntmAbout = new JMenuItem("About");
	    
	    b1 = new JButton("Make another reservation");
	    b2 = new JButton("Exit");

	    
	    add(menuBar);
	    menuBar.add(mnFile);
	    mnFile.add(mntmExit);
	    menuBar.add(mnHelp);
	    mnHelp.add(mntmAbout);
	    setJMenuBar(menuBar);
	    mntmExit.addActionListener(e -> System.exit(0));

	    
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
	    setLayout(new GridLayout(1,2));
	    setTitle("Receipt");
	  }
	  public void actionPerformed(ActionEvent ae) { 
		if(ae.getSource() == b1) {  
		  newframe newframe = new newframe();
    	  newframe.setVisible(true);
    	  dispose();
		}
	  }

	  public static void main(String args[])
	  {
	    Receipt receipt = new Receipt();
	    receipt.setVisible(true);
	    receipt.setLocation(200,200);
	  }
}
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

//Jacob Roberson

public class CoffeeMachine extends JFrame implements ActionListener
{
  private static final long serialVersionUID = 1L;
  JLabel l1, l2, l3, l4, l5, l6, l7;
  JButton b1, b2;
  JTextField t1, t2, t3;
  JCheckBox cream, raw, espresso; 
  private JRadioButton small;
  private JRadioButton medium;
  private JRadioButton large;
  private ButtonGroup group;

  CoffeeMachine() 
  {
	JMenuBar menuBar = new JMenuBar();
	JMenu mnFile = new JMenu("File");
	JMenuItem mntmExit = new JMenuItem("Exit");
	JMenu mnHelp = new JMenu("Help");
	JMenuItem mntmAbout = new JMenuItem("About");
	
	ClassLoader ldr = this.getClass().getClassLoader();
	ImageIcon imgCoffee = new ImageIcon(ldr.getResource("Lab 12 GIF.gif"));
	
    l1 = new JLabel(" Customer Name");
    l2 = new JLabel(" amount to pay");
    l3 = new JLabel("  ");
    l4 = new JLabel("  ");
    l5 = new JLabel("  ");
    l6 = new JLabel(imgCoffee);
    l7 = new JLabel(imgCoffee);
    

    b1 = new JButton("COMPUTE");
    b2 = new JButton("EXIT");
  
    t1 = new JTextField(10);
    t2 = new JTextField(10);

    small = new JRadioButton("small", true);
    medium = new JRadioButton("medium", false);
    large = new JRadioButton("large", false);
    group = new ButtonGroup();
    group.add(small);
    group.add(medium);
    group.add(large);

    cream = new JCheckBox("cream", false);
    raw = new JCheckBox("raw sugar", false);
    espresso = new JCheckBox("espresso shot", false);
    
    add(menuBar);
    menuBar.add(mnFile);
    mnFile.add(mntmExit);
    menuBar.add(mnHelp);
    mnHelp.add(mntmAbout);
    setJMenuBar(menuBar);
    mntmExit.addActionListener(e -> System.exit(0));

    
    add(l1);
    add(t1);
    add(small);
    add(cream);
    add(medium);
    add(raw);
    add(large);
    add(espresso);
    add(l2);
    add(t2);
    add(l3);
    add(l4);
    add(b1);
    add(b2);
    add(l6);
    add(l7);
    b1.addActionListener(this);
    b2.addActionListener(e -> System.exit(0));
    mntmAbout.addActionListener(new ActionListener() {
		 public void actionPerformed(ActionEvent arg0)
		 {
		   JOptionPane.showMessageDialog(null, "Programmer: Jacob Roberson\n" +
		 "This program is designed to place coffee orders\n" +
				   "Enter your name in the first text box and select your order options to see your total cost", 
		   "About", JOptionPane.PLAIN_MESSAGE);
		 }
});

    setSize(500,500);
    setLayout(new GridLayout(8,2));
    setTitle("Coffee Machine");
  }
  public void actionPerformed(ActionEvent ae)
  {
    float price = 0;
    String a = "", coffeeSize = "", message = "", Acream = "", Araw = "", Aespresso = ""; 
    if (cream.isSelected() == true) 
    {
      Acream = "cream, ";
    } 
    if (cream.isSelected() == false)
    {
      Acream = "no cream, ";
    }
    if (raw.isSelected() == true) 
    {
      Araw = "raw sugar, and ";
    }
    if (raw.isSelected() == false)
    {
      Araw = "no raw sugar, and ";
    }
    if (espresso.isSelected() == true) 
    {
      price += .75;
      Aespresso = "an espresso shot";
    } 
    if (espresso.isSelected() == false)
    {
      price += .75;
      Aespresso = "no espresso shot";
    }
    if (small.isSelected() == true) 
    {
	System.out.println("small");
      price += 1.25;
      coffeeSize = "Small Coffee";
    }
    if (medium.isSelected() == true)
    {
    System.out.println("medium");
      price += 1.75;
      coffeeSize = "Medium Coffee";
    }
    if (large.isSelected() == true) 
    {
	System.out.println("large");
      price += 2.30;
      coffeeSize = "Large Coffee";
    }
    if(ae.getSource() == b1)
    {
      a = t1.getText();
      message = "Hello " + a + "! Enjoy your beverage!\n"
      		+ "your order: " + coffeeSize + "\n" +
    		  "with " + Acream + Araw + Aespresso +
    		  "\nTotal cost: $" + price;
      t2.setText("$" + price);
    }
    JOptionPane.showMessageDialog(null, "Summary: \n" + message, 
		  "Order Summary", JOptionPane.PLAIN_MESSAGE);
  }

  public static void main(String args[])
  {
    CoffeeMachine a = new CoffeeMachine();
    a.setVisible(true);
    a.setLocation(200,200);
  }
}

import javax.swing.*;
import java.awt.*;

class Layout extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Container contentPane = getContentPane();
	ButtonGroup chkboxes = new ButtonGroup();	

	JPanel pnl = new JPanel();
	JPanel grid = new JPanel(new GridLayout(2,2));
	JPanel pnl2 = new JPanel(new GridLayout(4,1));
	JPanel pnl3 = new JPanel();
	JPanel pnl4 = new JPanel(new GridLayout(2,1));
	
	JRadioButton rad1 = new JRadioButton ();
	JRadioButton rad2 = new JRadioButton ();
	JRadioButton rad3 = new JRadioButton ();
	JRadioButton rad4 = new JRadioButton ();

JTextField txt2 = new JTextField("Default Text", 38);
	
	JTextArea txtArea = new JTextArea(5, 38);
	
	JScrollPane pane = new JScrollPane(txtArea);

	Color customColor = new Color( 0, 0, 255 );
	Font customFont = new Font("Arial", Font.ITALIC, 32 );
	public Layout()
	{
		super( "Swing Window" );
		setSize( 500,200 );
		setDefaultCloseOperation( EXIT_ON_CLOSE );		
 
    		pnl.add(new JButton("Yes") ); 
    		pnl.add(new JButton("No") );
		pnl.add(new JButton("Cancel") );
		
		chkboxes.add(rad1);
		chkboxes.add(rad2);
		chkboxes.add(rad3);
		chkboxes.add(rad4);
		pnl2.add(rad1);
		pnl2.add(rad2);
		pnl2.add(rad3);
		pnl2.add(rad4);
		
		pnl3.add(new JCheckBox());
		pnl3.add(new JCheckBox());
		pnl3.add(new JCheckBox());
		pnl3.add(new JCheckBox());
		pnl3.add(new JCheckBox());
		 
 
    		grid.add(new JButton("1")); 
    		grid.add(new JButton("2")); 
    		grid.add(new JButton("3")); 
    		grid.add(new JButton("4"));
    		
    		pnl4.add(new JButton("West"));

		contentPane.add("North", pnl ); 
    		contentPane.add("Center", grid ); 
    		contentPane.add("West",pnl4); 
    		contentPane.add("East", pnl2);
    		contentPane.add("South", pnl3);
    		
    		txtArea.setLineWrap(true);
    		txtArea.setWrapStyleWord(true);
    		pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    		pane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    		pnl4.add( pane ) ;
    		txtArea.setFont(customFont);
    		txtArea.setForeground(customColor);
		setVisible( true );
	}
	

	public static void main( String[] args ) 
	{
		Layout gui = new Layout() ;
	}	
}

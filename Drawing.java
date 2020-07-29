import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

class Drawing extends JComponent {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void paint(Graphics t) {
	Color brown = new Color(165,42,42);
	
    int[] x = new int[]{25,100,175};
    int[] y = new int[]{100,50,100};
   //house
    t.setColor (Color.black);
    t.fillPolygon(x, y, x.length);
    t.setColor (Color.white);
    t.fillRect(50,100,100,100);
    //tree
    t.setColor (Color.green);
    t.fillOval(250, 50, 50, 100);
    t.setColor (brown);
    t.fillRect(268, 145, 15, 100);
    //person
    t.setColor (Color.black);
    t.drawOval (40, 250, 20, 20);  // head
    t.drawLine (50, 270, 50, 305);  // trunk
    t.drawLine (50, 270, 35, 300);  // arms
    t.drawLine (50, 270, 65, 300);  // arms
    t.drawLine (50, 305, 35, 350);  // legs
    t.drawLine (50, 305, 65, 350);  // legs
  }

  public static void main(String[] a) {
    JFrame window = new JFrame();
    window.setBounds(30, 30, 500, 500);
    window.getContentPane().add(new Drawing());
    window.setVisible(true);
  }
}

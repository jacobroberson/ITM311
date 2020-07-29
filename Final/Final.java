import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Final extends JFrame {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public static void main(String[] args) {
Final frameTabel = new Final();
}

JButton blogin = new JButton("Login");
JPanel panel = new JPanel();
JTextField txuser = new JTextField(15);
JPasswordField pass = new JPasswordField(15);
JLabel username = new JLabel("Username:");
JLabel password = new JLabel("Password:");

Final(){
super("Login Autentification");
setSize(300,200);
setLocation(500,280);
panel.setLayout (null);

username.setBounds(70,10,150,20);
txuser.setBounds(70,30,150,20);
password.setBounds(70,45,150,20);
pass.setBounds(70,65,150,20);
blogin.setBounds(110,100,80,20);

panel.add(blogin);
panel.add(username);
panel.add(txuser);
panel.add(password);
panel.add(pass);

getContentPane().add(panel);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
actionlogin();
}

public void actionlogin(){
blogin.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae) {
String puname = txuser.getText();
String ppaswd = pass.getText();
if(puname.equals("Hotel") && ppaswd.equals("R353rvati0n!")) {
newframe regFace =new newframe();
regFace.setVisible(true);
dispose();
} else {

JOptionPane.showMessageDialog(null,"Wrong Password / Username");
txuser.setText("");
pass.setText("");
txuser.requestFocus();
}

}
});
}
}
package Day_3;

import javax.swing.JOptionPane;

public class Creeper {
public static void main(String[] args) {
	String city= JOptionPane.showInputDialog("What city do you live in?");
	JOptionPane.showMessageDialog(null, city + " is cool");
	String singer= JOptionPane.showInputDialog("What is your favorite band or singer?");
	JOptionPane.showMessageDialog(null, "You know I can get " + singer + " to meet you!");
	JOptionPane.showInputDialog("What is your address?");
	JOptionPane.showMessageDialog(null, " You shouldn't be giving out information to strangers. One of those creepers behind a computer screen all day could hunt you down someday...");
	
}
}

package Day_3;

import javax.swing.JOptionPane;

public class world_domination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String question= JOptionPane.showInputDialog("Hello. Do you know how to write code?");
		// 2. If they say "yes", tell them they will rule the world.
		if (question.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Then, you will rule the world!");
		}else{
			JOptionPane.showMessageDialog(null, "Well, good luck washing dishes!");
			}
		}
		// 3. Otherwise, wish them good luck washing dishes.

	}



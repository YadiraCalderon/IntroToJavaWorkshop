package Day_3;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Stephen_Hawking {

    // 1. make a main method and put steps 2, 3 & 4 inside it
	public static void main(String[] args) {
	// 2. ask the user for a sentence

			
		
		
    // 3. repeat the sentence using the speak method below
		
    // 4. make this repeat a lot of times
		for (int i = 0; i < 20; i++) {
			String sentence= JOptionPane.showInputDialog("Can you give me a random sentence?");
			speak(sentence);
		

		
		}
	}
static void speak(String words) {
   	 try {
   		 Runtime.getRuntime().exec("say " + words).waitFor();
   	 } catch (Exception e) {
   		 e.printStackTrace();
   	 }
    }

}


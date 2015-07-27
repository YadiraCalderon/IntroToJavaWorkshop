package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	private static Color red;

	public static void main(String[] args) {
		
		// START HERE
Robot yadira= new Robot ();
	for (int i = 0; i < 4; i++) {
		
		yadira.setPenColor(Color.MAGENTA);
		yadira.setPenWidth(10);
		yadira.setSpeed(10);
		yadira.penDown();
		yadira.move(50);
		yadira.turn(180);
		
	}
		
	}

}	



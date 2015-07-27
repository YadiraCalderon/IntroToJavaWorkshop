package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
	
		Robot yadira= new Robot();
		
		yadira.setSpeed(10);
		yadira.penDown();
		for (int i = 0; i < 75; i++) {
		yadira.setRandomPenColor();
		yadira.move(5*i);
		yadira.turn(360/9);
		yadira.setPenWidth(i);
		}
	}
}

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package extra;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class DizzyRobot {
	static Robot robot = new Robot();
	public static void main(String[] args) {
		
		 // 2. Ask the user how dizzy you want the robot from 1-10, then spin that number of times.
		String input=JOptionPane.showInputDialog("On a scale from 1 to 10 how dizy do you want the robot to be? How many times do you want it to spin?");
 // 1. Use the dance method to make the robot spin.
	int spin= Integer.parseInt(input);
	robot.turn(30);
	dance(spin);

	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			robot.turn(360);
		}
	}
}


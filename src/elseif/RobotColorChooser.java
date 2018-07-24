//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot susan = new Robot();
		//3. Ask the user what color they would like the robot to draw
		
		String color = JOptionPane.showInputDialog("Choose a color");

		//5. Use an if/else statement to smessageet the pen color that the user requested
		if (color.equals("red")) {
		susan.setPenColor(200,0,0);	//CODE
		}else if (color.equals("blue")){
		susan.setPenColor(0,0,200);	//CODE
	}else {
	susan.setRandomPenColor();//CODE
	}
	
		

        //6. If the user doesn’t enter anything, choose a random color
		
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		susan.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		

	}
}

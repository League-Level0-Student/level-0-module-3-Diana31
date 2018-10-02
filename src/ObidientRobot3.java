import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
 public class ObidientRobot3 {
public static void main(String[] args) {
	Robot meg = new Robot();
	String input= JOptionPane.showInputDialog("what shape do you want the robot to draw?");
	String color=JOptionPane.showInputDialog("what color would you like your shape to be? blue green red");
	if(input.equals("square")) {
		drawSquare(meg,80);
	}else if (input.equals("triangle")) {
		drawTriangle(meg,80);
	}else if (input.equals("circle")) {
		drawCircle(meg,3);
	}
	if (color.equals("red")) {
		meg.setPenColor(red);
	}
}
 static void drawSquare(Robot bob, int size) {
	for (int i = 0; i < 4; i++) {
	bob.setSpeed(10);
	bob.penDown();
	bob.move(size);
	bob.turn(90);
	}
}
static void drawTriangle(Robot bob, int size) {
	bob.setSpeed(15);
	for (int i = 0; i<=2 ; i++) {
		bob.penDown();
		bob.move(size);
		bob.turn(120);
	}
}
 static void drawCircle(Robot bob, int size) {
	 bob.setSpeed(150);
	 bob.penDown();
	 for (int i = 0; i <360; i++) {
		 bob.move(size);
		 bob.turn(360/360);
		
	}
	 
 }
 
 
 
 
 }
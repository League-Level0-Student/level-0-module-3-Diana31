import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
 public class obidientRobot2 {
public static void main(String[] args) {
	Robot meg = new Robot();
	String input= JOptionPane.showInputDialog("what shape do you want the robot to draw");
	drawCircle(meg,80);
	
}
 static void drawSquare(Robot bob, int size) {
	for (int i = 0; i < 4; i++) {
	bob.setSpeed(10);
	bob.penDown();
	bob.move(150);
	bob.turn(90);
	}
}
static void drawTriangle(Robot bob, int size) {
	bob.setSpeed(15);
		bob.penDown();
		for (int i = 0; i<=2 ; i++) {
		bob.move(size);
		bob.turn(80);
		bob.turn(80);
		bob.turn(80);	
	}
}
static void drawCircle(Robot bob, int size) {
	bob.setSpeed(100);
	bob.penDown();
	for (int i = 0; i <360; i++) {
		bob.move(3);
		bob.turn(360/360);
	}
}
 }


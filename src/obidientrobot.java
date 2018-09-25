import org.jointheleague.graphical.robot.Robot;

public class obidientrobot {
public static void main(String[] args) {
	Robot meg = new Robot();
	drawTriangle(meg,50);
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
	for (int i = 0; i<3 ; i++) 
		bob.penDown();
		bob.move(100);
		bob.turn(60);
	}
	
}




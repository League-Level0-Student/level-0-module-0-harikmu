import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	Robot r2d2 = new Robot();
	r2d2.setSpeed(10);
	r2d2.penDown();
	r2d2.move(200);
	r2d2.move(-100);
	r2d2.turn(90);
	r2d2.move(100);
	r2d2.turn(90);
	r2d2.move(100);
	r2d2.move(-200);
}
}

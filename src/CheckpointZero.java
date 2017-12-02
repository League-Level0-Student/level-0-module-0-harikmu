import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class CheckpointZero {
public static void main(String[] args) {
	String color = JOptionPane.showInputDialog("What is your favorite color?");
	JOptionPane.showMessageDialog(null, "My favorite color is " + color + " too!");
	Robot r2d2 = new Robot();
	r2d2.setSpeed(10);
	r2d2.setAngle(30);
	r2d2.penDown();
	r2d2.move(200);
	r2d2.setAngle(-30);
	r2d2.move(-200);
	r2d2.setAngle(-90);
	r2d2.move(200);
}
}

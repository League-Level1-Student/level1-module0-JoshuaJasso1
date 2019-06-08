package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot josh = new Robot();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		josh.moveTo(100, 800);
		josh.setSpeed(100);	
	}
	static void smallhouse() {
		josh.penDown();
		josh.setPenColor(0, 0, 255);
		josh.move(60);
		josh.turn(90);
		josh.move(50);
		josh.turn(90);
		josh.move(60);
		josh.turn(-90);
		josh.setPenColor(0, 255, 0);
		josh.move(20);
		josh.turn(-90);
	}

	static void mediumhouse() {
		josh.penDown();
		josh.setPenColor(0, 0, 255);
		josh.move(120);
		josh.turn(90);
		josh.move(50);
		josh.turn(90);
		josh.move(120);
		josh.turn(-90);
		josh.setPenColor(0, 255, 0);
		josh.move(20);
		josh.turn(-90);
	}

	static void largehouse() {
		josh.penDown();
		josh.setPenColor(0, 0, 255);
		josh.move(250);
		josh.turn(90);
		josh.move(50);
		josh.turn(90);
		josh.move(250);
		josh.turn(-90);
		josh.setPenColor(0, 255, 0);
		josh.move(20);
		josh.turn(-90);
	}
}
package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedient_robot {

	public static void main(String[] args) {
	
		Robot rob = new Robot(); 
		rob.penDown();
		rob.setSpeed(100);
		
		String color = JOptionPane.showInputDialog("Would you like your color to be red, blue, or green?");
		if (color.equals("red")) {
			rob.setPenColor(255,0,0);
		}
		if (color.equals("green")) {
			rob.setPenColor(0,255,0);
		}
		if (color.equals("blue")) {
			rob.setPenColor(0,0,255);
		}
		
		
		
		String shape = JOptionPane.showInputDialog("Would you like to draw a circle, square, or a triangle?");
		if(shape.equals("circle")) {
			circle(rob);
		}
		if (shape.equals("square")) {
			square(rob);
		}
		if (shape.equals("triangle")) {
			triangle(rob);
		}
		
	}
	
	static void square(Robot rob) {
		for(int i = 0;i<5;i++) {
			rob.move(100);
			rob.turn(90);
		}
	}
	
	static void triangle(Robot rob) {
		for (int i = 0; i < 4; i ++) {
			rob.move(100);
			rob.turn(120);
		}
	}
	
	static void circle(Robot rob) {
		for (int i = 0;i < 370; i ++) {
			rob.move(1);
			rob.turn(1);
		}
	}
	
	
	
}

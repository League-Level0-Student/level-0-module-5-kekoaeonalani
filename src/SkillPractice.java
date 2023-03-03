import java.util.Random;

import javax.swing.JOptionPane;

import _02_nested_loops._3_for_loop_gauntlet.Gauntlet;

public class SkillPractice {
	public static void main(String[] args) {
		SkillPractice g = new SkillPractice();
		g.skillSix();
	}
	
 void skillOne() {
	//Ask the user how many dimes they have
	String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
	int intDimes = Integer.parseInt(dimes);
	//Tell them how many cents they have (hint multiply by 10)
JOptionPane.showMessageDialog(null, "You have " + (intDimes * 10) + " cents!");

// Ask the user how tall they are (inches)
String howTall = JOptionPane.showInputDialog("How tall(inches) are you?");
int howTallInt = Integer.parseInt(howTall);

//If they are shorter than 36 inches, tell them to eat their Wheaties
if (howTallInt < 36) {
JOptionPane.showMessageDialog(null, "You should eat your Wheaties!");	
}

else {
	JOptionPane.showMessageDialog(null, "You are growing like a weed!");
}
}

 
 void skillTwo() {
	 //Write a loop to print every third number between 1 and 30 to the console 
	 for (int i = 3; i < 33; i += 3) {
		 System.out.println(i);
	 }
 }
 
 void skillThree() {
	 //Get a random number that is less than 20 and print it to the console 
	 Random gen = new Random();
	 int n = gen.nextInt(21);
	 System.out.println(n);
	 
	 //Get another random number that is less than 10 and print it to the console 
	 Random number = new Random();
	 int j = number.nextInt(11);
	 System.out.println(j);
	 
	 // Use a pop-up to tell the users the difference between the two numbers(hint use subtraction)
	 JOptionPane.showMessageDialog(null, "The difference between your two random numbers are: " + (n - j));
 }
 
 void skillFour() {
	 // In a pop-up, ask the user for the city they live in 
	 String city = JOptionPane.showInputDialog("What city do you live in?");
	 
	 //If they answer "San Diego", then tell them they live in the best city ever.
	 if (city.equals("San Diego")) {
		 JOptionPane.showMessageDialog(null, "YOU LIVE IN THE BEST CITY EVER!");
	 }
	 
	 else {
		 JOptionPane.showMessageDialog(null, "oof, you should move to San Diego.");
	 }
 }
 
 void skillFive() {
	 //Create a variable - cars - and initialize it to the number of cars your family has. 
	 int cars = 0;
	 
	 //If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them. 
	 if (cars > 1) {
		 JOptionPane.showMessageDialog(null, "Your cars have " + (cars*4) + " wheels!");
	 }
	 
	 //If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 
	 if (cars == 0) {
		 JOptionPane.showMessageDialog(null, "I bet you use public transportation.");
	 }
	 
	 //If there is 1 car, use a pop-up to display the make/model of the car 
	 if (cars == 1) {
		 JOptionPane.showMessageDialog(null, "Your car is a Tesla, model x");
	 }
 }
 
 void skillSix() {
	 // Ask the user what school they go to.
	 String school =  JOptionPane.showInputDialog( "What is the name of your school?");
	 
	 // tell the user that their school is a fantastic school(include name of school)
	 JOptionPane.showMessageDialog(null, "Wow, " + school + " is a fantastic school!");
 }
 
 
 
 
}

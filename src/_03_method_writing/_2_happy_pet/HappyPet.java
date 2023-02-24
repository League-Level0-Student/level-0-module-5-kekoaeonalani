package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	 static String whatKindOfPet;
	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable

 whatKindOfPet = JOptionPane.showInputDialog("Would you like to buy a dog, a cat, or a snake?");
 if (!whatKindOfPet.equals("dog") && !whatKindOfPet.equals("cat") && !whatKindOfPet.equals("snake")) {
	 JOptionPane.showMessageDialog(null, "Good try. You HAVE to choose between either dog, can, or snake. Let's try this again.");
	 whatKindOfPet = JOptionPane.showInputDialog("Would you like to buy a dog, a cat, or a snake?");
 }
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
		
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
 while (happinessLevel < 11) {
			int task = JOptionPane.showOptionDialog(null, "Choose an action", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Scoop poop", "Feed", "Pet" }, null);

			// 6. Use user input to call the appropriate method created in step 5 below.
			
			if (task == 2) {
				petThePet();
			}
			
			if (task == 1) {
			feed();	
			}
			
			if (task == 0) {
				scoopPoop();
			}
			if (happinessLevel  >= 10) {
				JOptionPane.showMessageDialog(null, "Boy, You sure really love your " + whatKindOfPet+ ". Their happiness level is at least 10!");
				break;
			}
			}
			
			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}

	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	static void scoopPoop() {
		happinessLevel += 1;
		JOptionPane.showMessageDialog(null,"Your " + whatKindOfPet + "'s happiness level just went up by one! \n Your pet Just farted. Looks like it might poop again...");
	}
	
	static void feed() {
		happinessLevel += 3;
		JOptionPane.showMessageDialog(null,"Your " + whatKindOfPet + "'s happiness level just went up by three! \n Your pet just burped.");
	}
	
	static void petThePet() {
		happinessLevel += 4;
		JOptionPane.showMessageDialog(null,"Your " + whatKindOfPet + "'s happiness level just went up by four!");
	}
}
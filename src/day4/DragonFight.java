package day4;

import javax.swing.JOptionPane;

public class DragonFight {
	// 1. Create a main() method and put all of the code below inside of it
	public static void main(String[] args) {
	// 2. Pop up a message telling the user: "You found a dragon!  Defeat it to take its treasure"
	JOptionPane.showMessageDialog(null, "you found a dragon defeat it to take its gold");
	// 3. Create a variable to store the user's health (set it equal to 100)
	int uhealth = 100;
	// 4. Create a variable to store the dragon's health (set it to 100)
	int dhealth = 100;
	// 5. Ask the if they want to attack the dragon with a yell or a kick
	String attack = JOptionPane.showInputDialog("do you want to attack with a yell or a kick?");
	// 6. If they typed in "yell":
	if(attack.equals("yell")) {
		//-- Find a random number between 0 and 10 
	new Random().nextInt(11);
		//-- Subtract that number from the dragon's health variable 
		
	}
	// 7. If they typed in "kick":
		
		//-- Find a random number between 5 and 25
	
		//-- Subtract that number from the dragon's health variable
	
	// 8.  Find a random number between 5 and 35 
	
	// 9. Subtract this number for your health
	
	// 10. Pop up a message that tells the their current health and the health of the dragon
	
	// 11. If the user's health is less than or equal to 0
	
		//-- Tell the user that they lost
	
	// 12. If the dragon's health is less than or equal to 0
	
		//-- Tell the user that the dragon is dead and they took a ton of gold!
	}
}

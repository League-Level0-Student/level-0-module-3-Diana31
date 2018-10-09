package elseif;
import java.util.Random;

import javax.swing.JOptionPane;
public class NumberGuessingGame {
	public static void main(String[] args) {
		Random rand= new Random ();
		int random= new Random().nextInt(2); 
		String input=JOptionPane.showInputDialog("Guess a number between 0, 1, or 2");
		int userGuess= Integer.parseInt(input);
		if (userGuess==random) {
			System.out.println("You are corr3ct.");
		}else {
			System.out.println("That is not correct");
		input=JOptionPane.showInputDialog("Guess a number between 0, 1, or 2");
		int userGuess= Integer.parseInt(input);
		if (userGuess==random) {
			System.out.println("You are corr3ct.");
		}
		}
	
	}
}

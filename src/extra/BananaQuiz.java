//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extra;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String input = JOptionPane.showInputDialog("Do like bananas?");
		//2. if they say no, 
	if (input.equals("no")) {
		JOptionPane.showMessageDialog(null, "You're crazy!!");
	}else if (input.equals("yes")) {
		String Userhobby=JOptionPane.showInputDialog(null, "What is your favorite hobby?");
	JOptionPane.showMessageDialog(null,Userhobby+ " is much better with bananas!");
	} 
			//tell them they are crazy 
			//and end quiz
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"

		//4. OPTIONAL: if they say something other than â€œyesâ€? or â€œnoâ€?
		//	show a pop up that says â€œYou are bananas!â€?
	
	}

}

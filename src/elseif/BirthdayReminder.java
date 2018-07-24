
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "July 15th";
		String dadsBirthday = "July 27th";
		String myBirthday = "April 18th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	 String input = JOptionPane.showInputDialog("What Birthday do you want?(mom,dad,my)");
	
		// 3. Print out what the user typed
		System.out.println(input);
		// 4. if user asked for "mom"
			//print mom's birthday
	if (input.equals("mom")) {
		System.out.println(momsBirthday);
	}else if (input.equals("dad")) {
		System.out.println(dadsBirthday);
	}else if (input.equals("mine")) {
		System.out.println(myBirthday);
	}else  JOptionPane.showMessageDialog(null, "I don't know that person's birthday");
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}

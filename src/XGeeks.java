
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
	public static void main(String[] args) {

		String Emilse = "Being patient";
		String Kassandra = "Singing";
		String Robert = "speed";
		String johnPaul = "funny";
		String Emilio = "Flight";

		String name = JOptionPane.showInputDialog("Enter a name?");
		if (name.equals("Emilio")) {
			JOptionPane.showMessageDialog(null, "Emilio's super power is " + Emilio + "!");
	}
		if (name.equals("John Paul")) {
			JOptionPane.showMessageDialog(null, "John Paul's super power is being " + johnPaul + "!");
		}
		}
	}

	// 1. Save the superpower for each person in a variable.

	// 2. Ask the user to enter a name. Store their answer in a variable.

	// 3. Show the superpower in a pop-up, depending on the name entered.



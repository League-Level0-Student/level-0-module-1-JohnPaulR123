import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {
	
		int score = 0 ;
		String guess = JOptionPane.showInputDialog("What has four eyes, but can't see?");
	if (guess.equals("Mississippi")){
		JOptionPane.showMessageDialog(null, "Correct");
		score ++ ;
		JOptionPane.showMessageDialog(null, "Congrats! Your score is " + score);
	String second = JOptionPane.showInputDialog("What do you call a cow with no legs?");
	if (second.equals("Groundbeef"))
		JOptionPane.showMessageDialog(null, "Correct");
	score ++ ;
	JOptionPane.showMessageDialog(null, "Congrats! Your score is " + score);
	}
	else {
JOptionPane.showMessageDialog(null, "Sorry, Try again.");
		// 1. Make a variable to hold the score

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles

		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
		}
}


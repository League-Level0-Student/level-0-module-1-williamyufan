import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

public class TheRiddler {

	public static void main(String[] args) {

		int score = 0;

		String Riddle = JOptionPane.showInputDialog(null, "The more you take, the more you leave behind. What am I?");

		if (Riddle.equals("footsteps")) {

			score++; 
			
			JOptionPane.showMessageDialog(null, "Correct");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong");

		}
		JOptionPane.showMessageDialog(null, "1");

		String Riddle2 = JOptionPane.showInputDialog(null, "What room do ghosts avoid?");

		if (Riddle.equals("livingroom")) {

			score++;
			JOptionPane.showMessageDialog(null, "Correct");
		}

		else {
			JOptionPane.showMessageDialog(null, "Wrong");
		}
		JOptionPane.showMessageDialog(null, "2");
	}
}

import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
String answer=JOptionPane.showInputDialog(null, "When is your birthday?");
if(answer.equals("May 1st")){
	JOptionPane.showInputDialog(null, "Happy Birthday!!!");
}
else {
	JOptionPane.showMessageDialog(null, "Happy UNbirthday!");
}
}
}

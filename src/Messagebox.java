import javax.swing.JOptionPane;

public class Messagebox {
public static void main(String[] args) {
	String Password= "0090";
	String Secret=JOptionPane.showInputDialog(null, "Tell me one of your Secrets!");
	String Answer=JOptionPane.showInputDialog(null, "What is the password");
if(Answer.equals(Password)){	

JOptionPane.showMessageDialog(null, Secret);
}
else {
	JOptionPane.showMessageDialog(null, "INVADER!");



}
}
}

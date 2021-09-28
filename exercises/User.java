package exercises;
import javax.swing.JOptionPane;

public class User {
	public static void main(String[] args) {
		
		String createPassword;
		String confirmPassword;
		
		createPassword = JOptionPane.showInputDialog(null, "Passrod", "", JOptionPane.QUESTION_MESSAGE);
		confirmPassword = JOptionPane.showInputDialog(null, "Confirm your passaword", "", JOptionPane.QUESTION_MESSAGE);
		
		if (confirmPassword.equals(createPassword)) {
			System.out.println("Acess granted");
		}
		
		else {
			System.out.println("Password missmatch, try again!");
		}
		
		System.exit(0);
	}
}

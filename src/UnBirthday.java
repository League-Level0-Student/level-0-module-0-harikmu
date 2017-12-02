import javax.swing.JOptionPane;

public class UnBirthday {
public static void main(String[] args) {
	String thing = JOptionPane.showInputDialog("What is your birthday?");
	
	if(thing.equals("12/01")) {
		JOptionPane.showMessageDialog(null, "HAPPY BIRTHDAY");
	} else {
		JOptionPane.showMessageDialog(null, "HAPPY UNBIRTHDAY");
	}
	
		
}
}

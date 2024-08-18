package basics;
import javax.swing.JOptionPane;

public class GuiProgram {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("What is your name");
		JOptionPane.showMessageDialog(null, "Hello "+ name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age"));
		JOptionPane.showMessageDialog(null, "Yout age is "+ age);
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("What is your height"));
		JOptionPane.showMessageDialog(null, "Your height is " + height + "in centimeter" );
	}

}

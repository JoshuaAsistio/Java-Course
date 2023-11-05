import javax.swing.JOptionPane;

public class JOptionPaneDemo {

	public static void main(String[] args) {
		// JOptionPane.showMessageDialog(null, "You did something wrong.", "Error Message", JOptionPane.ERROR_MESSAGE);;
		// JOptionPane.showConfirmDialog(null, "Bro, do you even code?", "Title", JOptionPane.YES_NO_CANCEL_OPTION);
		// int answer = JOptionPane.showConfirmDialog(null, "Bro, do you even code?", "Title", JOptionPane.YES_NO_CANCEL_OPTION);
		// String name = JOptionPane.showInputDialog("What is your name? ");
		// System.out.println("Hello " + name);
		
		JOptionPane.showOptionDialog(null, "You are awesome", "Secret Message", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, 0);
	}
	

}

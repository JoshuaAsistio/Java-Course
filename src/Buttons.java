import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Buttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
	}

}

class MyFrame extends JFrame {
	JButton button;
	JLabel label;
	
	MyFrame() {
		label = new JLabel("Hello World");
		label.setVisible(false);
		
		button = new JButton();
		button.setBounds(100, 100, 250, 100);
		button.addActionListener(e -> label.setVisible(true));
		button.setText("I am a button");
		button.setFocusable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setSize(500, 500);
		setVisible(true);
		add(button);
		add(label);
	}

}

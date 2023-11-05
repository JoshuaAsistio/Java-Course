import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtonsDemo {

	public static void main(String[] args) {
		new MyFrame();
	}

}

class MyFrame extends JFrame implements ActionListener {
	MyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JRadioButton pizzaButton = new JRadioButton("Pizza");
		JRadioButton burgerButton = new JRadioButton("Burger");
		JRadioButton friesButton = new JRadioButton("Fries");
		
		add(pizzaButton);
		add(burgerButton);
		add(friesButton);
		
		pack();
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
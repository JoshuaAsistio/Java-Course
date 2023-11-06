import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtonsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Frame();
	}

}

class Frame extends JFrame implements ActionListener {
	JRadioButton pizzaButton;
	JRadioButton burgerButton;
	JRadioButton friesButton;
	
	Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(420, 420);
		setLayout(new FlowLayout());
		
		pizzaButton = new JRadioButton("Pizza");
		burgerButton = new JRadioButton("Burger");
		friesButton = new JRadioButton("Fries");
		
		pizzaButton.addActionListener(this);
		burgerButton.addActionListener(this);
		friesButton.addActionListener(this);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		
		buttonGroup.add(pizzaButton);
		buttonGroup.add(burgerButton);
		buttonGroup.add(friesButton);
		
		add(pizzaButton);
		add(burgerButton);
		add(friesButton);
		
		pack();
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == pizzaButton) {
			System.out.println("You ordered Pizza.");
		} else if (e.getSource() == burgerButton) {
			System.out.println("You ordered Burger");
		} else if (e.getSource() == friesButton) {
			System.out.println("You ordered Fries");
		}
	}
}

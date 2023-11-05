
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Panels {

	public static void main(String[] args) {
		
		Border border = BorderFactory.createLineBorder(Color.black, 3);
		
		JLabel label = new JLabel();
		label.setText("HI!");
		label.setHorizontalAlignment(JLabel.CENTER);
		
		JPanel redPanel = new JPanel();
		redPanel.setBounds(0, 0, 250, 250);
		redPanel.setBackground(Color.red);
		redPanel.setLayout(new BorderLayout());
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(250, 0, 250, 250);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0, 250, 500, 250);
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750, 750);
		frame.setVisible(true);
		
		redPanel.add(label);
		
		frame.add(redPanel);
		frame.add(bluePanel);
		frame.add(greenPanel);
	}

}

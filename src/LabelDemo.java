import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class LabelDemo {

	public static void main(String[] args) {
		
		ImageIcon image = new ImageIcon("Untitled.png");
		Border border = BorderFactory.createLineBorder(Color.green, 1);
		
		JLabel label = new JLabel();
		label.setText("Bro, do you even code?");
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(Color.green);
		label.setFont(new Font("Arial", Font.PLAIN, 50));
		label.setIconTextGap(50);
		label.setBackground(Color.black);
		label.setOpaque(true);
		label.setIcon(image);
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		//label.setBounds(100, 100, 250, 250);
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		//frame.setLayout(null);
		frame.add(label);
		frame.setVisible(true);
		frame.pack();

	}

}

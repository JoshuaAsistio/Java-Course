import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Test {

	public static void main(String[] args) {
		Border border = BorderFactory.createLineBorder(Color.black, 3);
		
		JLabel title = new JLabel();
		title.setText("GRADE VERIFICATION SYSTEM");
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setVerticalAlignment(JLabel.TOP);
		title.setFont(new Font("Arial", Font.BOLD, 25));
		title.setBorder(border);
		
		
		JFrame frame = new JFrame();
		frame.add(title);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setVisible(true);
	}

}

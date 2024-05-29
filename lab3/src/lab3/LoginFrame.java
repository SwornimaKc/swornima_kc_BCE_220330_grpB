package lab3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginFrame {
	private JPasswordField passField;
	private JTextField tf1;

	LoginFrame() {
		JFrame frame = new JFrame("Login form");

		JLabel label = new JLabel();
		label.setText(null);
		frame.add(label);

		JLabel lbl = new JLabel("USER ID");
		lbl.setBounds(20, 75, 100, 30);
		frame.add(lbl);

		JTextField tf1 = new JTextField();
		tf1.setBounds(125, 75, 100, 30);
		frame.add(tf1);

		JLabel lbl1 = new JLabel("PASS_CODE");
		lbl1.setBounds(20, 110, 100, 30);
		frame.add(lbl1);

		passField = new JPasswordField();
		passField.setBounds(125, 110, 100, 30);
		frame.add(passField);

		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(20, 150, 100, 20);
		frame.add(btnReset);

		JButton btn = new JButton("Login");
		btn.setBounds(125, 150, 100, 20);
		frame.add(btn);

		frame.setLayout(null);
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		btn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String userId = tf1.getText();
				String password = new String (passField.getPassword());

				if (userId.equals("test1@gmail.com") && password.equals("test")) {
					NewPage page = new NewPage();
					page.setVisible(true);
					JLabel wel_label = new JLabel("Welcome: " + tf1);
					page.getContentPane().add(wel_label);

				} else {
					System.out.println("please enter valid username and password");
				}

			}
		});
		
		btnReset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tf1.setText("");
				passField.setText("");
			}
		});

	}

	

	class NewPage extends JFrame {
		NewPage() {
			setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
			setTitle("welcome");
			setSize(400, 200);
			System.out.println("you have successfully logged in HURRAY HURRAY!!");
		}
	}

	public static void main(String[] args) {
		new LoginFrame();
	}
}

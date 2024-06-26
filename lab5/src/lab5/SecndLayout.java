package lab5;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BoxLayout;

public class SecndLayout {
	public SecndLayout()

	{
		Frame frame = new Frame("Form Section");
		frame.setLayout(new BorderLayout());

		Panel LeftPanel = new Panel();
		
		Label lblEmail = new Label("Email");
		LeftPanel.add(lblEmail);

		TextField tfEmail = new TextField();
		LeftPanel.add(tfEmail);
		
		Button btnLeft = new Button("Submit");
		LeftPanel.add(btnLeft);
		

		LeftPanel.setBackground(Color.GRAY);
		LeftPanel.setPreferredSize(new Dimension(200, 500));
		LeftPanel.setLayout(new BoxLayout(LeftPanel, BoxLayout.Y_AXIS));
		frame.add(LeftPanel, BorderLayout.WEST);

		Panel RightPanel = new Panel();
		Label lblRight = new Label("User ko email");
		RightPanel.add(lblRight);
		
		Label userLeLekhekoLabel = new Label();
		userLeLekhekoLabel.setBackground(Color.CYAN);
		RightPanel.add(userLeLekhekoLabel);
		

		RightPanel.setBackground(Color.WHITE);
		RightPanel.setPreferredSize(new Dimension(200, 500));
		RightPanel.setLayout(new BoxLayout(RightPanel, BoxLayout.Y_AXIS));
		frame.add(RightPanel, BorderLayout.EAST);
		
		btnLeft.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String userKoEmail = tfEmail.getText()+" ";
				userLeLekhekoLabel.setText(userKoEmail);

			}
		});

		frame.setSize(500, 500);
		frame.setVisible(true);

		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				frame.dispose();
			}
		});

	}

	public static void main(String[] args) {
		new SecndLayout();
	}
}

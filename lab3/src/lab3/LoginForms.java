package lab3;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForms {
	LoginForms() {
		Frame frame = new Frame("Calculator");

		Label label = new Label();
		label.setText("K xa? solution chaiyo?:");
		label.setBounds(20, 20, 400, 35);
		label.setBackground(Color.CYAN);
		frame.add(label);

		Label lblFirstNumber = new Label("First NUmber");
		lblFirstNumber.setBounds(20, 75, 100, 30);
		frame.add(lblFirstNumber);

		TextField tfFnu = new TextField();
		tfFnu.setBounds(125, 75, 100, 30);
		frame.add(tfFnu);

		Label lblSecondNumber = new Label("Second NUmber");
		lblSecondNumber.setBounds(20, 110, 100, 30);
		frame.add(lblSecondNumber);

		TextField tfSnu = new TextField();
		tfSnu.setBounds(125, 110, 100, 30);
		frame.add(tfSnu);

		Button btn1 = new Button("RESET");
		btn1.setBounds(20, 145, 80, 30);
		frame.add(btn1);

		Button btn2 = new Button("CALCULATE");
		btn2.setBounds(145, 145, 80, 30);
		frame.add(btn2);
		
		Label lblR = new Label("RESULT:");
		lblR.setBounds(20, 180, 100, 30);
		frame.add(lblR);
		
		Label result=new Label("0");
		result.setBounds(130, 180, 100, 30);
		frame.add(result);

		btn2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String pahiloNumber = tfFnu.getText();
				String dosroNumber = tfSnu.getText();
				System.out.println(pahiloNumber);
				System.out.println(dosroNumber);
				
				int a = Integer.parseInt(pahiloNumber);
				int b = Integer.parseInt(dosroNumber);
				int sum = a + b;
				
				String myResult=String.valueOf(sum);
				result.setText(myResult);
				
				
			}
		});
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tfFnu.setText("");
				tfSnu.setText("");
				
			}
		});
		

		
		frame.setLayout(null);
		frame.setSize(400, 500);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new LoginForms();

	}

}

package noThree;

	import java.awt.*;
	import java.awt.event.*;

	public class TextFieldExample {
	    public static void main(String[] args) {
	        // Create a frame
	        Frame frame = new Frame("TextField Example");

	        // Create a TextField
	        TextField textField = new TextField();
	        textField.setBounds(50, 50, 150, 20);

	        // Create a Label
	        Label label = new Label();
	        label.setBounds(50, 150, 250, 20);

	        // Create a Button
	        Button button = new Button("Show Text");
	        button.setBounds(50, 100, 80, 30);

	        // Add action listener to the button
	        button.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                // Get text from the TextField and set it to the Label
	                String text = textField.getText();
	                label.setText("Entered text: " + text);
	            }
	        });

	        // Add components to the frame
	        frame.add(textField);
	        frame.add(label);
	        frame.add(button);

	        // Set frame properties
	        frame.setSize(400, 400);
	        frame.setLayout(null);
	        frame.setVisible(true);

	        // Add window listener to close the window
	        frame.addWindowListener(new WindowAdapter() {
	            public void windowClosing(WindowEvent windowEvent){
	                System.exit(0);
	            }
	        });
	    }
	}

	



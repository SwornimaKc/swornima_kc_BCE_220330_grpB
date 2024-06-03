package lab4;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class BorderLayout {
	public static Object East;
	public static Object WEST;

	BorderLayout() {
		Frame frame = new Frame("borderLayout");

		Button btnN = new Button("North");
		frame.add(btnN, java.awt.BorderLayout.NORTH);

		Button btnW = new Button("West");
		frame.add(btnW, java.awt.BorderLayout.WEST);

		Button btnE = new Button("East");
		frame.add(btnE, java.awt.BorderLayout.EAST);

		Button btnS = new Button("South");
		frame.add(btnS, java.awt.BorderLayout.SOUTH);

		Button btnC = new Button("Center");
		frame.add(btnC, java.awt.BorderLayout.CENTER);

		frame.addWindowListener(new WindowListener() {

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();

			}

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub

			}
		});
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setLayout(new java.awt.BorderLayout());

	}

	public static void main(String[] args) {
		new BorderLayout();
	}
}

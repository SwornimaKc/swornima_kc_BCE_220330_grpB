package lab5;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.*;

public class TwoSection {
	public TwoSection() {
		Frame frame = new Frame("Two Section");
		frame.setLayout(new BorderLayout());

		MenuBar mb = new MenuBar();

		Menu menu = new Menu("File");
		Menu subMenu = new Menu("More");
		Menu editMenu = new Menu("Edit");
		Menu search = new Menu("Search");
		Menu referenceSub = new Menu("References");
		

		MenuItem item1 = new MenuItem("New");
		MenuItem item2 = new MenuItem("Open");
		MenuItem item5 = new MenuItem("Save");
		MenuItem item6 = new MenuItem("Save As");
		MenuItem item3 = new MenuItem("Clear Cache");
		MenuItem item4 = new MenuItem("Restore Default");

		MenuItem item7 = new MenuItem("Undo");
		MenuItem item8 = new MenuItem("Redo Typing");

		MenuItem item9 = new MenuItem("Search...");
		MenuItem item10 = new MenuItem("File...");
		MenuItem item11 = new MenuItem("Jave...");
		MenuItem item12 = new MenuItem("Text");
		MenuItem item13 = new MenuItem("Reference 1");
		MenuItem item14 = new MenuItem("Declarations");

		MenuItem item15 = new MenuItem("Reference 2");
		MenuItem item16 = new MenuItem("Reference 3");

		MenuItem item20 = new MenuItem("Exit");
		
		item20.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
			}
		});
		
		subMenu.add(item3);
		subMenu.add(item4);
		
		menu.add(item1);
		menu.add(item2);
		menu.add(subMenu);
		menu.add(item20);
		
		mb.add(menu);
		mb.add(search);
		mb.add(editMenu);

		editMenu.add(item6);
		editMenu.add(item7);
		menu.addSeparator();
		referenceSub.add(item15);
		referenceSub.add(item16);
		
		frame.setMenuBar(mb);

		Panel leftPanel = new Panel();
		leftPanel.setBackground(Color.GRAY);
		leftPanel.setPreferredSize(new Dimension(150, 400));

		Button btnleft = new Button("Left");
		leftPanel.add(btnleft);
		frame.add(leftPanel, BorderLayout.WEST);

		Panel rightPanel = new Panel();
		rightPanel.setBackground(Color.WHITE);
		Label label = new Label("Right");
		rightPanel.add(label);

		rightPanel.setPreferredSize(new Dimension(250, 400));
		frame.add(rightPanel, BorderLayout.CENTER);

		btnleft.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// TODO Auto-generated method stub
				label.setText("hello");
				rightPanel.setBackground(Color.ORANGE);
				leftPanel.setBackground(Color.RED);
			}
		});
		frame.setSize(400, 400);
		frame.setVisible(true);
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				frame.dispose();
			}
		});
	}

	public static void main(String[] args) {
		new TwoSection();
	}
}

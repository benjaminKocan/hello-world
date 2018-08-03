package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainView implements ActionListener {

	public MainView() {
		initGUI();
	}

	public void initGUI() {
		JFrame frame = new JFrame();

		JButton button = new JButton();

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Internal classes");
			}
		});

		JPanel buttonPanel = new JPanel();
		buttonPanel.add(button);
		frame.add(buttonPanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 200);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Non internal");

	}

}
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.Control;

public class MainView implements ActionListener, MouseListener {

	public Control controller;

	public MainView() {

		controller = new Control(this);
		initGUI();
	}

	public void initGUI() {

		JFrame frame = new JFrame();
		// Indy components
		JButton button = new JButton();
		JLabel label = new JLabel("This is the first name");

		// Panel's
		JPanel mainPanel = new JPanel();
		JPanel labelPanel = new JPanel();
		JPanel buttonPanel = new JPanel();

		button.addActionListener(this);
		mainPanel.addMouseListener(this);

		labelPanel.add(label);
		buttonPanel.add(button);
		mainPanel.add(labelPanel);
		mainPanel.add(buttonPanel);
		frame.getContentPane().add(mainPanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 200);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		controller.updateXAndY(e.getX(), e.getY());
		controller.repaint();

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
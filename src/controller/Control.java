package controller;

import model.Database;
import view.MainView;

public class Control {
	public MainView view;
	public Database model = new Database();

	public Control(MainView theView) {
		view = theView;
	}

	public void updateXAndY(int newX, int newY) {
		model.setXValue(newX);
		model.setYValue(newY);
	}

	public void repaint() {
		System.out.println("New X: " + model.getXValue() + " New Y: " + model.getYValue());
	}
}

package application;

import java.awt.EventQueue;

import view.Intro;

public class App {

	public App() {

		// Start Intro View
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Intro frame = new Intro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void main(String[] args) {
		new App();
	}

}

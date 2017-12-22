package application;

import java.awt.EventQueue;

import view.Intro;

public class App {

	public App() {
		
		//Start the Intro
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
		//Start the App
		new App();
	}

}

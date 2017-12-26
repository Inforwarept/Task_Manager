package view;

import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.AppCtrl;
import model.Configs;
import javax.swing.JButton;

public class Configurations extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public Configurations(AppCtrl app, int user_id) {
		setResizable(false);
		setBounds(100, 100, 260, 180);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblScreen = new JLabel("Screen");
		lblScreen.setFont(new Font("Arial", Font.PLAIN, 16));
		lblScreen.setBounds(10, 50, 90, 20);
		contentPane.add(lblScreen);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		for(Configs c : app.arConfigs.getArConfigs())
		{
			comboBox.addItem(c.getScreen_w()+"x"+c.getScreen_h());
		}
		comboBox.setFont(new Font("Arial", Font.PLAIN, 16));
		comboBox.setBounds(110, 50, 134, 20);
		contentPane.add(comboBox);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(10, 110, 234, 30);
		contentPane.add(btnSave);
	}
}

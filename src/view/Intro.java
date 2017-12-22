package view;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controller.AppCtrl;
import controller.ArUsers;
import model.User;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Intro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private AppCtrl app;
	private JTextField textField;
	
	
	public Intro() {
		setTitle("Inforware.pt - Task Manager");
		setResizable(false);
		
		// Chamada ao ficheiro de controlo
		this.app = new AppCtrl();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 405, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 375, 278);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblEscolhaOSeu = new JLabel("Escolha o seu utilizador:");
		lblEscolhaOSeu.setFont(new Font("Arial", Font.PLAIN, 18));
		lblEscolhaOSeu.setBounds(10, 11, 349, 35);
		panel.add(lblEscolhaOSeu);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox = this.addItemComboBox(this.app.arUsers.getArUsers());
		comboBox.setSelectedIndex(0);
		comboBox.setFont(new Font("Arial", Font.PLAIN, 16));
		comboBox.setBounds(10, 57, 349, 35);
		panel.add(comboBox);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setEnabled(false);
		btnEntrar.setBounds(205, 159, 154, 101);
		panel.add(btnEntrar);
		
		JButton button_1 = new JButton("1");
		button_1.setEnabled(false);
		button_1.setBounds(10, 103, 55, 45);
		panel.add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.setEnabled(false);
		button_2.setBounds(75, 103, 55, 45);
		panel.add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.setEnabled(false);
		button_3.setBounds(140, 103, 55, 45);
		panel.add(button_3);
		
		JButton button_4 = new JButton("4");
		button_4.setEnabled(false);
		button_4.setBounds(10, 159, 55, 45);
		panel.add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.setEnabled(false);
		button_5.setBounds(75, 159, 55, 45);
		panel.add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.setEnabled(false);
		button_6.setBounds(140, 159, 55, 45);
		panel.add(button_6);
		
		JButton button_7 = new JButton("7");
		button_7.setEnabled(false);
		button_7.setBounds(10, 215, 55, 45);
		panel.add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.setEnabled(false);
		button_8.setBounds(75, 215, 55, 45);
		panel.add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.setEnabled(false);
		button_9.setBounds(140, 215, 55, 45);
		panel.add(button_9);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setEditable(false);
		textField.setBounds(205, 103, 154, 45);
		panel.add(textField);
		textField.setColumns(10);
		
		// Centrar a janela ao meio do ecra
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		

		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent k) {
				System.out.println(k.getKeyCode());
			}
		});
	}
	
	private JComboBox<String> addItemComboBox(ArrayList<User> au) {
		
		JComboBox<String> jc = new JComboBox<>();
		jc.addItem("--- Selecione ---");
		for(User u : au)
		{
			if(u.getId() != 0 || u.getUsername().equals("Administrator"))
			{
				jc.addItem(u.getUsername());
			}
		}
		
		return jc;
	}
}

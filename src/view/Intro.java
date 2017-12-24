package view;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controller.AppCtrl;
import model.User;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Intro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	private AppCtrl app;
	private JTextField textField;
	boolean isAlreadyEnable = false;
	
	
	public Intro() {
		setTitle("Inforware.pt - Task Manager");
		setResizable(false);
		
		// Chamada ao ficheiro de controlo
		this.app = new AppCtrl();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 405, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(10, 11, 375, 324);
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

		textField = new JTextField();
		textField.setEnabled(false);
		textField.setEditable(false);
		textField.setBounds(205, 103, 154, 45);
		panel.add(textField);
		textField.setColumns(10);
		
		// Centrar a janela ao meio do ecra
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
		
		for (JButton btn : this.createBtns())
		{
			panel.add(btn);
		}
		
		comboBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				@SuppressWarnings("unchecked")
				JComboBox<String> cb = (JComboBox<String>) e.getSource();
				Object s = cb.getSelectedItem();
				
				if(cb.getSelectedIndex() == 0) {
					// bloqueia o teclado
					lockBtns();
				}
				else {
					for(User u : Intro.this.getApp().arUsers.getArUsers()) {
						// desbloqueia o teclado
						if (u.getUsername().equals(s.toString())) {
							unlockBtns();
						}
					}
				}
			}
		});
	}
	
	
	// preenche o menu dropdwon com o nome dos utilizadores
	private JComboBox<String> addItemComboBox(ArrayList<User> au) {
		JComboBox<String> jc = new JComboBox<>();
		// isAlreadyEnable está decladara globalmente
		jc.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.isControlDown())
				{
					if(e.getKeyCode() == 75)
					{
						if(isAlreadyEnable) {
							lockBtns();
							isAlreadyEnable = false;
						}
						else {
							unlockBtns();
							isAlreadyEnable = true;
						}
					}
				}
			}
		});
		jc.addItem("--- Selecione ---");
		for(User u : au) {
			if(u.getId() != 0)
			{
				jc.addItem(u.getUsername());
			}
		}
		return jc;
	}

	// Apenas para poder aceder dentro do ActionListener do ComboBox
	public AppCtrl getApp() {
		return app;
	}
	
	// Função para criar o painel de botoes
	private ArrayList<JButton> createBtns() {
		
		Font btn_font = new Font("Arial Black", Font.BOLD, 16);
		ArrayList<JButton> arBtn = new ArrayList<JButton>();
		
		int btn_w = 55;
		int btn_h = 45;
		int btn_pos_x = 10;
		int btn_pos_y = 103;
		int aux[][] = { {btn_pos_x, btn_pos_y}, {btn_pos_x, btn_pos_y+56}, {btn_pos_x, btn_pos_y+112} };
		
		for(int ct=0; ct < 11; ct++)
		{
			JButton btn = new JButton(""+ct);
			btn.setFont(btn_font);
			btn.setEnabled(false);
			
			if(ct == 0)
			{
				btn.setBounds(75, 271, 120, 45);
			}
			else if(ct > 0 && ct < 4)
			{
				btn.setBounds(aux[0][0], aux[0][1], btn_w, btn_h);
				aux[0][0] += btn_pos_x+btn_w;
			}
			else if(ct > 3 && ct < 7)
			{
				btn.setBounds(aux[1][0], aux[1][1], btn_w, btn_h);
				aux[1][0] += btn_pos_x+btn_w;
			}
			else if(ct > 6 && ct <= 9)
			{
				btn.setBounds(aux[2][0], aux[2][1], btn_w, btn_h);
				aux[2][0] += btn_pos_x+btn_w;
			}
			else
			{
				btn.setText("C");
				btn.setBounds(btn_pos_x, 271, btn_w, btn_h);
			}
			arBtn.add(btn);
		}
		return arBtn;
	}
	
	// Desbloqueia os botoes
	private void unlockBtns() {
		Component[]comp = this.panel.getComponents();
		for(int i=0; i < comp.length; i++) {
			if(comp[i] instanceof JButton) {
				JButton btn = (JButton) comp[i];
				btn.setEnabled(true);
			}
		}
	}
	
	// Bloqueia os botoes
	private void lockBtns() {
		Component[]comp = this.panel.getComponents();
		for(int i=0; i < comp.length; i++) {
			if(comp[i] instanceof JButton) {
				JButton btn = (JButton) comp[i];
				btn.setEnabled(false);
			}
		}
	}
}

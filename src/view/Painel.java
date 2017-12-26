package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.AppCtrl;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import java.awt.Scrollbar;


public class Painel extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public Painel(AppCtrl app, int user_id) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, /*app.arUsers.getUser(user_id).getUserCfg().getScreen_w(), app.arUsers.getUser(user_id).getUserCfg().getScreen_h()*/1280,768);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmAccountInfo = new JMenuItem("Account Info");
		mnFile.add(mntmAccountInfo);
		
		JMenuItem mntmConfigurations = new JMenuItem("Configurations");
		mntmConfigurations.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Configurations frame = new Configurations(app, user_id);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		mnFile.add(mntmConfigurations);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}

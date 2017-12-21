package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Intro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public Intro() {
		setTitle("Inforware.pt - Gestor de Tarefas");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 654, 409);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon img = new ImageIcon(Intro.class.getResource("/img/user_1.png"));
		Image image = img.getImage();
		Image newImg = image.getScaledInstance(140, 140, java.awt.Image.SCALE_SMOOTH);
		lblNewLabel.setIcon(new ImageIcon(newImg));
		lblNewLabel.setBounds(10, 11, 140, 140);
		panel.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Intro.class.getResource("/img/user_5.png")));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(267, 11, 140, 140);
		panel.add(label);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{contentPane}));
		
		// make window centered to the screen
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
	}
	
	
}

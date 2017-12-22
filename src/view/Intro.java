package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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
		setBounds(100, 100, 570, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 545, 409);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel users_img = new JLabel("");
		users_img.setHorizontalAlignment(SwingConstants.CENTER);
		users_img.setIcon(this.getScaledImage("user_1"));
		users_img.setBounds(10, 11, 140, 140);
		panel.add(users_img);
		
		JLabel users_img_2 = new JLabel("");
		users_img_2.setIcon(this.getScaledImage("user_5"));
		users_img_2.setHorizontalAlignment(SwingConstants.CENTER);
		users_img_2.setBounds(200, 11, 140, 140);
		panel.add(users_img_2);
		
		JLabel users_img_3 = new JLabel("");
		users_img_3.setIcon(this.getScaledImage("poison"));
		users_img_3.setHorizontalAlignment(SwingConstants.CENTER);
		users_img_3.setBounds(390, 11, 140, 140);
		panel.add(users_img_3);
		
		// make window centered to the screen
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
	}
	
	/**
	 * Recebe o nome da imagem por parametro.
	 * Todas as imagens a serem usadas, tem que usar a extensão '.png'
	 * @param imgName
	 * @return ImageIcon
	 */
	private ImageIcon getScaledImage(String imgName) {
		ImageIcon icon = new ImageIcon(Intro.class.getResource("/img/"+imgName+".png"));
		Image img = icon.getImage();
		Image newImg = img.getScaledInstance(140, 140, java.awt.Image.SCALE_SMOOTH);
		
		return new ImageIcon(newImg);
	}
}

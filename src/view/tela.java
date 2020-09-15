package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.Jogocontroller;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class tela extends JFrame {

	private JPanel contentPane;
	private JTextField tela1;
	private JTextField tela2;
	private JTextField tela3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela frame = new tela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tela1 = new JTextField();
		tela1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		tela1.setBounds(68, 83, 86, 70);
		contentPane.add(tela1);
		tela1.setColumns(10);
		
		tela2 = new JTextField();
		tela2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		tela2.setColumns(10);
		tela2.setBounds(165, 83, 86, 70);
		contentPane.add(tela2);
		
		tela3 = new JTextField();
		tela3.setFont(new Font("Tahoma", Font.PLAIN, 40));
		tela3.setColumns(10);
		tela3.setBounds(262, 83, 86, 70);
		contentPane.add(tela3);
		
		JButton botaoJogar = new JButton("Jogar");
		botaoJogar.setBounds(259, 211, 89, 23);
		contentPane.add(botaoJogar);
		
		Jogocontroller Jcontroller = new Jogocontroller(tela1, tela2, tela3, botaoJogar);
		botaoJogar.addActionListener(Jcontroller);
	}

}

package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class Jogocontroller implements ActionListener {
    private JTextField tela1;
    private JTextField tela2;
    private JTextField tela3;
    private JButton botaoJogar;
	
    public Jogocontroller(JTextField tela1, JTextField tela2, JTextField tela3, JButton botaoJogar) {
		
		this.tela1 = tela1;
		this.tela2 = tela2;
		this.tela3 = tela3;
		this.botaoJogar = botaoJogar;
	}

    public void actionPerformed(ActionEvent arg0) {
   	numeros();
   	
   }
    public void numeros() {
    	botaoJogar.setEnabled(false);
    	TheadNumeros N1 = new TheadNumeros(tela1, botaoJogar);
    	TheadNumeros N2 = new TheadNumeros(tela2, botaoJogar);
    	TheadNumeros N3 = new TheadNumeros(tela3, botaoJogar);
    	 
    	N1.start();
    	N2.start();
    	N3.start();
    }
}

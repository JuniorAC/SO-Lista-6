package controller;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JTextField;

public class TheadNumeros extends Thread{
    private JTextField tela;
    private JButton botao;
	Random Numero = new Random();
   
	public TheadNumeros(JTextField tela, JButton botaoJogar) {
		this.tela = tela;
		this.botao = botaoJogar;
	}

    
    public void run() {
    	botao.setEnabled(false);	
    	int maximo  = Numero.nextInt(50)+1;
    	for (int i = 1; i <= maximo; i++) {
    		tela.setText(Integer.toString(Numero.nextInt(7)+1));
         try {
			Thread.sleep(75);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	}
    	botao.setEnabled(true);	
    }
}

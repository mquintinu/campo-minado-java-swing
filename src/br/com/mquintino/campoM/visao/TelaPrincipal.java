package br.com.mquintino.campoM.visao;

import javax.swing.JFrame;

import br.com.mquintino.campoM.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame{

	public TelaPrincipal() {
		Tabuleiro tab = new Tabuleiro(16, 30, 5);		
		
		add(new PainelTabuleiro(tab));
		
		setTitle("Campo Minado");
		setSize(690, 438);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new TelaPrincipal();
	}
}

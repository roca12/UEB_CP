package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelRespuesta extends JPanel{
	
	private JLabel e_rta;
		
	public PanelRespuesta() {
		setLayout(null);
		setBackground(Color.pink);
		
		inicializarComponentes();
		
		setVisible(true);		
	}
	
	public void inicializarComponentes() {
		
		e_rta= new JLabel();
		e_rta.setBounds(150, 70, 200, 20);
		add(e_rta);
		
	}

	public JLabel getE_rta() {
		return e_rta;
	}

	public void setE_rta(JLabel e_rta) {
		this.e_rta = e_rta;
	}
	
	
}

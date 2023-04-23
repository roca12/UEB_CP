package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame{
	
	private PanelIngresoDatos p1;
	private PanelRespuesta pr;

	public VentanaPrincipal() {
		setTitle("Mi primer calculadora");
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.orange);
		getContentPane().setLayout(null);
		
		
		inicializarComponentes();
		
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		p1 = new PanelIngresoDatos();
		p1.setBounds(20, 20, 540, 250);
		getContentPane().add(p1);
		
		pr = new PanelRespuesta();
		pr.setBounds(20, 290, 540, 150);
		getContentPane().add(pr);
			
	}

	public PanelIngresoDatos getP1() {
		return p1;
	}

	public void setP1(PanelIngresoDatos p1) {
		this.p1 = p1;
	}

	public PanelRespuesta getPr() {
		return pr;
	}

	public void setPr(PanelRespuesta pr) {
		this.pr = pr;
	}
	
	
}

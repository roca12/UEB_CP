package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelIngresoDatos extends JPanel{

	private JLabel e_num1;
	private JLabel e_num2;
	private JLabel e_resul;
	private JTextField c_num1;
	private JTextField c_num2;
	private JButton b_sumar;
	private JButton b_restar;
	
	public PanelIngresoDatos() {
		setLayout(null);
		setBackground(Color.CYAN);
		
		inicializarComponentes();
		
		setVisible(true);		
	}
	
	public void inicializarComponentes() {
		
		e_num1 = new JLabel("Ingrese número: ");
		e_num1.setBounds(50, 50, 100, 20);
		add(e_num1);
		
		e_num2 = new JLabel("Ingrese número: ");
		e_num2.setBounds(50, 100, 100, 20);
		add(e_num2);
		
		e_resul = new JLabel("Operaciones: ");
		e_resul.setBounds(50, 150, 100, 20);
		add(e_resul);
		
		c_num1 = new JTextField();
		c_num1.setBounds( 170 , 50, 300, 20);
		add(c_num1);
		
		c_num2 = new JTextField();
		c_num2.setBounds( 170 , 100, 300, 20);
		add(c_num2);
		
		b_sumar = new JButton("Sumar");
		b_sumar.setBounds(170, 150, 80, 20);
		b_sumar.setBackground(Color.black);
		b_sumar.setForeground(Color.white);
		b_sumar.setActionCommand("SUMAR");
		add(b_sumar);
		
		b_restar = new JButton("Restar");
		b_restar.setBounds(280, 150, 80, 20);
		b_restar.setBackground(Color.black);
		b_restar.setForeground(Color.white);
		b_restar.setActionCommand("RESTAR");
		add(b_restar);
		
	}

	public JLabel getE_num1() {
		return e_num1;
	}

	public void setE_num1(JLabel e_num1) {
		this.e_num1 = e_num1;
	}

	public JLabel getE_num2() {
		return e_num2;
	}

	public void setE_num2(JLabel e_num2) {
		this.e_num2 = e_num2;
	}

	public JLabel getE_resul() {
		return e_resul;
	}

	public void setE_resul(JLabel e_resul) {
		this.e_resul = e_resul;
	}

	public JTextField getC_num1() {
		return c_num1;
	}

	public void setC_num1(JTextField c_num1) {
		this.c_num1 = c_num1;
	}

	public JTextField getC_num2() {
		return c_num2;
	}

	public void setC_num2(JTextField c_num2) {
		this.c_num2 = c_num2;
	}

	public JButton getB_sumar() {
		return b_sumar;
	}

	public void setB_sumar(JButton b_sumar) {
		this.b_sumar = b_sumar;
	}

	public JButton getB_restar() {
		return b_restar;
	}

	public void setB_restar(JButton b_restar) {
		this.b_restar = b_restar;
	}
	
	
}

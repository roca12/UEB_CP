package co.edu.unbosque.Vista;
import co.edu.unbosque.Controlador.Controlador;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import co.edu.unbosque.Modelo.Info;

public class VPrin extends JFrame {

	private JButton Btn1 , Btn2, Btn3, Btn4,Btn5;
	private JLabel nombre, residencia , numero;
	private JTextField nombre1, residencia1, numero1;
	private Info nf;
	

	
	public VPrin () {
		
		
		setResizable(false);
		setLayout(null);
		setBackground(Color.CYAN);
		setBounds(520, 250, 550, 300);
		
	

		Btn1 = new JButton("Iniciar");
		Btn1.setBounds(225, 100, 100, 50);
		add(Btn1);
		
		Btn2 = new JButton("Guardar");
		Btn2.setBounds(210, 210, 100, 50);
		Btn2.setVisible(false);
		add(Btn2);
		
		Btn3 = new JButton("Mostrar");
		Btn3.setBounds(110, 210, 100, 50);
		Btn3.setVisible(false);
		add(Btn3);
		
		Btn4 = new JButton("Eliminar");
		Btn4.setBounds(300, 210, 100, 50);
		Btn4.setVisible(false);
		add(Btn4);
		
		Btn5 = new JButton("Actualizar");
		Btn5.setBounds(400, 210, 100, 50);
		Btn5.setVisible(false);
		add(Btn5);
		
		nombre = new JLabel("Nombre: ");
		nombre.setBounds(20, 5, 800, 100);
		nombre.setVisible(false);
		nombre.setFont(new Font("Anton", Font.BOLD, 50));
		
		numero = new JLabel("Numero: ");
		numero.setBounds(20, 60, 800, 100);
		numero.setVisible(false);
		numero.setFont(new Font("Anton", Font.BOLD, 50));
		
		residencia = new JLabel("Residencia: ");
		residencia.setBounds(20, 115, 800, 100);
		residencia.setVisible(false);
		residencia.setFont(new Font("Anton", Font.BOLD, 50));
		
		nombre1 = new JTextField();
		nombre1.setBounds(325, 35, 200, 50);
		nombre1.setVisible(false);
		
		numero1 = new JTextField();
		numero1.setBounds(325, 90, 200, 50);
		numero1.setVisible(false);
		
		residencia1 = new JTextField();
		residencia1.setBounds(325, 145, 200, 50);
		residencia1.setVisible(false);
		
		
		add(residencia1);
		add(numero1);
		add(nombre1);
		add(numero);
		add(nombre);
		add(residencia);
		
	}

	public JButton getBtn1() {
		return Btn1;
	}

	public void setBtn1(JButton btn1) {
		Btn1 = btn1;
	}

	public JLabel getNombre() {
		return nombre;
	}

	public void setNombre(JLabel nombre) {
		this.nombre = nombre;
	}

	public JLabel getResidencia() {
		return residencia;
	}

	public void setResidencia(JLabel residencia) {
		this.residencia = residencia;
	}

	public JLabel getNumero() {
		return numero;
	}

	public void setNumero(JLabel numero) {
		this.numero = numero;
	}

	public JTextField getNombre1() {
		return nombre1;
	}

	public void setNombre1(JTextField nombre1) {
		this.nombre1 = nombre1;
	}

	public JTextField getResidencia1() {
		return residencia1;
	}

	public void setResidencia1(JTextField residencia1) {
		this.residencia1 = residencia1;
	}

	public JTextField getNumero1() {
		return numero1;
	}

	public void setNumero1(JTextField numero1) {
		this.numero1 = numero1;
	}

	public Info getNf() {
		return nf;
	}

	public void setNf(Info nf) {
		this.nf = nf;
	}

	public JButton getBtn2() {
		return Btn2;
	}

	public void setBtn2(JButton btn2) {
		Btn2 = btn2;
	}

	public JButton getBtn3() {
		return Btn3;
	}

	public void setBtn3(JButton btn3) {
		Btn3 = btn3;
	}

	public JButton getBtn4() {
		return Btn4;
	}

	public void setBtn4(JButton btn4) {
		Btn4 = btn4;
	}

	public JButton getBtn5() {
		return Btn5;
	}

	public void setBtn5(JButton btn5) {
		Btn5 = btn5;
	}
	
	
	
}

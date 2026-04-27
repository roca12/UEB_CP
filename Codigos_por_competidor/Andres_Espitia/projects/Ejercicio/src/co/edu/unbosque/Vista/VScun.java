package co.edu.unbosque.Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import co.edu.unbosque.Controlador.Controlador;
import java.util.ArrayList;

import co.edu.unbosque.Vista.VPrin;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

public class VScun extends JFrame {
	private ArrayList<JLabel> j;
	private JList listanombre;
	private JList listaresidencia;
	private JList listanumero;

	public VScun() {
		
		listanombre = new JList();
		listaresidencia = new JList();
		listanumero = new JList();
		setResizable(false);
		setLayout(null);
		setBackground(Color.CYAN);
		setBounds(600, 250, 550, 300);

	}
	
	public void imprLista(ArrayList<String> nombre, ArrayList<String> residencia, ArrayList<String> numero) {
		System.out.println(nombre.get(0)+" "+residencia.get(0)+" "+numero.get(0));
		setLayout(new BorderLayout());
		DefaultListModel modelon = new DefaultListModel();
		for(int i=0; i<nombre.size(); i++) {
			modelon.addElement(nombre.get(i));
		}
		listanombre.setModel(modelon);
		add(listanombre, BorderLayout.WEST);
		
		DefaultListModel modelor = new DefaultListModel();
		for(int i=0; i<residencia.size(); i++) {
			modelor.addElement(residencia.get(i));
		}
		listaresidencia.setModel(modelor);
		add(listaresidencia, BorderLayout.CENTER);
		
		DefaultListModel modelonum = new DefaultListModel();
		for(int i=0; i<numero.size(); i++) {
			modelonum.addElement(numero.get(i));
		}
		listanumero.setModel(modelonum);
		add(listanumero, BorderLayout.EAST);
	}
	
	
}
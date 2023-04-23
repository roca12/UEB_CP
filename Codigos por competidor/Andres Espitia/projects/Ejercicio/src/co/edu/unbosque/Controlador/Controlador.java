package co.edu.unbosque.Controlador;

import co.edu.unbosque.Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

import co.edu.unbosque.Modelo.Info;

public class Controlador implements ActionListener {
	private VPrin vn;
	private ArrayList<Info> inf;

	public Controlador() {

		vn = new VPrin();
		inf = new ArrayList<Info>();

	}

	public void guardarDatos(String nombre, String numero, String residencia) {
		Info pt = new Info(nombre, numero, residencia);
		inf.add(pt);
	}

	public void iniciar() {
		vn.setVisible(true);
		vn.getBtn1().addActionListener(this);
		vn.getBtn1().setActionCommand("run");
		vn.getBtn2().addActionListener(this);
		vn.getBtn2().setActionCommand("probar");
		vn.getNombre();
		vn.getResidencia();
		vn.getNumero();
		vn.getNombre1();
		vn.getNumero1();
		vn.getResidencia1();
		vn.getNf();
		vn.getBtn3().addActionListener(this);
		vn.getBtn3().setActionCommand("run2");
		vn.getBtn4().addActionListener(this);
		vn.getBtn4().setActionCommand("run3");
		vn.getBtn5().addActionListener(this);
		vn.getBtn5().setActionCommand("run4");
	}
	

	public void mostrar() {

		for (int i = 0; i < inf.size(); i++) {
			JOptionPane.showMessageDialog(null, "Los datos son: " + "\n" + "Nombre: " + inf.get(i).getNombre() + "\n"
					+ "Numero: " + inf.get(i).getNumero() + "\n" + "Residencia: " + inf.get(i).getResidencia());
			
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getActionCommand().equals("run")) {
			vn.getBtn1().setVisible(false);
			vn.getNombre().setVisible(true);
			vn.getResidencia().setVisible(true);
			vn.getNumero().setVisible(true);
			vn.getNombre1().setVisible(true);
			vn.getNumero1().setVisible(true);
			vn.getResidencia1().setVisible(true);
			vn.getBtn2().setVisible(true);
			vn.getBtn3().setVisible(true);
			vn.getBtn4().setVisible(true);
			vn.getBtn5().setVisible(true);
		}
		if (e.getActionCommand().equals("probar")) {
			if (!vn.getNombre1().getText().equals("") && !vn.getNumero1().getText().equals("")
					&& !vn.getResidencia1().getText().equals("")) {
				String asw = vn.getNombre1().getText();
				String asw2 = vn.getNumero1().getText();
				String asw3 = vn.getResidencia1().getText();
				guardarDatos(asw, asw2, asw3);

			} else {
				JOptionPane.showMessageDialog(null, "Inserte los datos soicitdos", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}

		if (e.getActionCommand().equals("run2")) {

			VScun v2 = new VScun();
			v2.setVisible(true);
			ArrayList<String> nomaux = new ArrayList<>();
			ArrayList<String> numaux = new ArrayList<>();
			ArrayList<String> residenciaux = new ArrayList<>();
			for(int i=0; i<inf.size(); i++) {
				nomaux.add(inf.get(i).getNombre());
				numaux.add(inf.get(i).getNumero());
				residenciaux.add(inf.get(i).getResidencia());
			}
			v2.imprLista(nomaux, residenciaux, numaux);

		}

		if (e.getActionCommand().equals("run3")) {
			int res = (Integer.parseInt(JOptionPane.showInputDialog("Que dato desea borrar?: ")));
			inf.remove(res - 1);

		}

		if (e.getActionCommand().equals("run4")) {
		}

		System.out.println("");

	}

}

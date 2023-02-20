package co.edu.unbosque.controller;

import co.edu.unbosque.view.*;
import co.edu.unbosque.modell.*;

import jdk.jshell.JShell;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Controller implements ActionListener {

	private Ventanaprincipal ventanaprin;
	private Evaluador eval;
	private JShell js;

	public Controller() {
		ventanaprin = new Ventanaprincipal();
		eval = new Evaluador();
		actionListeners();
	}

	public void actionListeners() {
		ventanaprin.getZero().addActionListener(this);
		ventanaprin.getZero().setActionCommand("zero");

		ventanaprin.getOne().addActionListener(this);
		ventanaprin.getOne().setActionCommand("one");

		ventanaprin.getTwo().addActionListener(this);
		ventanaprin.getTwo().setActionCommand("two");

		ventanaprin.getThree().addActionListener(this);
		ventanaprin.getThree().setActionCommand("three");

		ventanaprin.getFour().addActionListener(this);
		ventanaprin.getFour().setActionCommand("four");

		ventanaprin.getFive().addActionListener(this);
		ventanaprin.getFive().setActionCommand("five");

		ventanaprin.getSix().addActionListener(this);
		ventanaprin.getSix().setActionCommand("six");

		ventanaprin.getSeven().addActionListener(this);
		ventanaprin.getSeven().setActionCommand("seven");

		ventanaprin.getEigth().addActionListener(this);
		ventanaprin.getEigth().setActionCommand("eigth");

		ventanaprin.getNine().addActionListener(this);
		ventanaprin.getNine().setActionCommand("nine");

		ventanaprin.getSum().addActionListener(this);
		ventanaprin.getSum().setActionCommand("sum");

		ventanaprin.getRes().addActionListener(this);
		ventanaprin.getRes().setActionCommand("res");

		ventanaprin.getMult().addActionListener(this);
		ventanaprin.getMult().setActionCommand("mult");

		ventanaprin.getDiv().addActionListener(this);
		ventanaprin.getDiv().setActionCommand("div");

		ventanaprin.getMod().addActionListener(this);
		ventanaprin.getMod().setActionCommand("mod");

		ventanaprin.getBorr().addActionListener(this);
		ventanaprin.getBorr().setActionCommand("borr");

		ventanaprin.getBorrt().addActionListener(this);
		ventanaprin.getBorrt().setActionCommand("borrt");

		ventanaprin.getZero3().addActionListener(this);
		ventanaprin.getZero3().setActionCommand("zero3");

		ventanaprin.getBracket().addActionListener(this);
		ventanaprin.getBracket().setActionCommand("bracket");

		ventanaprin.getBracket2().addActionListener(this);
		ventanaprin.getBracket2().setActionCommand("bracket2");

		ventanaprin.getComma().addActionListener(this);
		ventanaprin.getComma().setActionCommand("comma");

		ventanaprin.getAcp().addActionListener(this);
		ventanaprin.getAcp().setActionCommand("acp");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "zero": {
			String temp = ventanaprin.getPant().getText();
			ventanaprin.getPant().setText(temp + "0");
			break;
		}
		case "one": {
			String temp = ventanaprin.getPant().getText();
			ventanaprin.getPant().setText(temp + "1");
			break;
		}
		case "two": {
			String temp = ventanaprin.getPant().getText();
			ventanaprin.getPant().setText(temp + "2");
			break;
		}
		case "three": {
			String temp = ventanaprin.getPant().getText();
			ventanaprin.getPant().setText(temp + "3");
			break;
		}
		case "four": {
			String temp = ventanaprin.getPant().getText();
			ventanaprin.getPant().setText(temp + "4");
			break;
		}
		case "five": {
			String temp = ventanaprin.getPant().getText();
			ventanaprin.getPant().setText(temp + "5");
			break;
		}
		case "six": {
			String temp = ventanaprin.getPant().getText();
			ventanaprin.getPant().setText(temp + "6");
			break;
		}
		case "seven": {
			String temp = ventanaprin.getPant().getText();
			ventanaprin.getPant().setText(temp + "7");
			break;
		}
		case "eigth": {
			String temp = ventanaprin.getPant().getText();
			ventanaprin.getPant().setText(temp + "8");
			break;
		}
		case "nine": {
			String temp = ventanaprin.getPant().getText();
			ventanaprin.getPant().setText(temp + "9");
			break;
		}
		case "sum": {
			String temp = ventanaprin.getPant().getText();
			ventanaprin.getPant().setText(temp + "+");
			break;
		}
		case "res": {
			String temp = ventanaprin.getPant().getText();
			ventanaprin.getPant().setText(temp + "-");
			break;
		}
		case "mult": {
			String temp = ventanaprin.getPant().getText();
			ventanaprin.getPant().setText(temp + "*");
			break;
		}
		case "div": {
			String temp = ventanaprin.getPant().getText();
			ventanaprin.getPant().setText(temp + "/");
			break;
		}
		case "mod": {
			String temp = ventanaprin.getPant().getText();
			ventanaprin.getPant().setText(temp + "%");
			break;
		}
		case "borr": {
			if (ventanaprin.getPant().getText().length() >= 1) {
				String temp = ventanaprin.getPant().getText();
				ventanaprin.getPant().setText(temp.substring(0, temp.length() - 1));
			}
			break;
		}
		case "borrt": {
			String temp = ventanaprin.getPant().getText();
			ventanaprin.getPant().setText("");
			ventanaprin.getPant2().setText("");
			break;
		}
		case "comma": {
			String temp = ventanaprin.getPant().getText();
			ventanaprin.getPant().setText(temp + ".");
			break;
		}
		case "bracket": {
			String temp = ventanaprin.getPant().getText();
			ventanaprin.getPant().setText(temp + "(");
			break;
		}
		case "bracket2": {
			String temp = ventanaprin.getPant().getText();
			ventanaprin.getPant().setText(temp + ")");
			break;
		}
		case "zero3": {
			String temp = ventanaprin.getPant().getText();
			ventanaprin.getPant().setText(temp + "000");
			break;
		}
		case "acp": {
			String temp = ventanaprin.getPant().getText() + "+x";
			if (eval.funEval(temp) == null) {
				ventanaprin.getPant2().setText("Syntaxis Error");
			} else {
				ventanaprin.getPant2().setText(eval.funEval(temp));
			}

		}
		}
	}
}

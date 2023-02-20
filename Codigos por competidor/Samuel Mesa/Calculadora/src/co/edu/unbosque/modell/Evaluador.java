package co.edu.unbosque.modell;

import org.nfunk.jep.JEP;

public class Evaluador {

	private JEP jep;

	public Evaluador(JEP jep) {
		super();
		this.jep = jep;
	}

	public Evaluador() {

		jep = new JEP();

	}

	public JEP getJep() {
		return jep;
	}

	public void setJep(JEP jep) {
		this.jep = jep;
	}

	public String funEval(String evaluar) {
		String res = "";

		jep.addStandardFunctions();
		jep.addVariable("x", 0);
		jep.parseExpression(evaluar);

		if (jep.hasError() == true) {
			res = "Error.";
		} else {
			res = jep.getValue() + "";
		}

		return res;
	}

}

package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Ventanaprincipal extends JFrame {

	private JLabel tit;
	private JTextField pant, pant2;
	private JPanel bordes, fondo, fpant;
	private Border line, margin, complete;
	private JButton one, two, three, four, five, six, seven, eigth, nine, zero3, comma;
	private JButton zero, sum, res, mult, div, mod, borr, borrt, acp, bracket, bracket2;

	public Ventanaprincipal() {

		setTitle("Calculadora");
		setLayout(null);
		setSize(400, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		bordes = new JPanel();
		bordes.setBackground(Color.CYAN);
		bordes.setBounds(20, 25, 350, 500);

		fondo = new JPanel();
		fondo.setBackground(Color.GRAY);
		fondo.setBounds(0, 0, 400, 600);

		pant = new JTextField();
		pant.setEditable(false);
		pant.setBackground(Color.WHITE);
		pant.setBounds(55, 90, 280, 35);
		pant.setFont(new Font("Arial Black", Font.BOLD, 20));

		pant2 = new JTextField();
		pant2.setEditable(false);
		pant2.setBackground(Color.WHITE);
		pant2.setBounds(55, 135, 280, 35);
		pant2.setFont(new Font("Arial Black", Font.BOLD, 20));

		fpant = new JPanel();
		fpant.setBackground(Color.BLACK);
		fpant.setBounds(45, 80, 300, 100);

		tit = new JLabel();
		tit.setText("CALCULADORA");
		tit.setBounds(100, 40, 200, 20);
		tit.setFont(new Font("ARIAL", Font.BOLD, 25));

		one = new JButton("1");
		one.setFont(new Font("Arial Black", Font.BOLD, 20));
		one.setBounds(40, 360, 70, 40);
		line = new LineBorder(Color.BLACK);
		margin = new EmptyBorder(0, 0, 0, 0);
		complete = new CompoundBorder(line, margin);
		one.setBorder(complete);

		two = new JButton("2");
		two.setFont(new Font("Arial Black", Font.BOLD, 20));
		two.setBounds(120, 360, 70, 40);
		line = new LineBorder(Color.BLACK);
		margin = new EmptyBorder(0, 0, 0, 0);
		complete = new CompoundBorder(line, margin);
		two.setBorder(complete);

		three = new JButton("3");
		three.setFont(new Font("Arial Black", Font.BOLD, 20));
		three.setBounds(210, 360, 70, 40);
		line = new LineBorder(Color.BLACK);
		margin = new EmptyBorder(0, 0, 0, 0);
		complete = new CompoundBorder(line, margin);
		three.setBorder(complete);

		sum = new JButton("+");
		sum.setFont(new Font("Arial Black", Font.BOLD, 20));
		sum.setBounds(290, 360, 70, 40);
		line = new LineBorder(Color.BLACK);
		margin = new EmptyBorder(0, 0, 0, 0);
		complete = new CompoundBorder(line, margin);
		sum.setBorder(complete);

		four = new JButton("4");
		four.setFont(new Font("Arial Black", Font.BOLD, 20));
		four.setBounds(40, 310, 70, 40);
		line = new LineBorder(Color.BLACK);
		margin = new EmptyBorder(0, 0, 0, 0);
		complete = new CompoundBorder(line, margin);
		four.setBorder(complete);

		five = new JButton("5");
		five.setFont(new Font("Arial Black", Font.BOLD, 20));
		five.setBounds(120, 310, 70, 40);
		line = new LineBorder(Color.BLACK);
		margin = new EmptyBorder(0, 0, 0, 0);
		complete = new CompoundBorder(line, margin);
		five.setBorder(complete);

		four = new JButton("4");
		four.setFont(new Font("Arial Black", Font.BOLD, 20));
		four.setBounds(40, 310, 70, 40);
		line = new LineBorder(Color.BLACK);
		margin = new EmptyBorder(0, 0, 0, 0);
		complete = new CompoundBorder(line, margin);
		four.setBorder(complete);

		six = new JButton("6");
		six.setFont(new Font("Arial Black", Font.BOLD, 20));
		six.setBounds(210, 310, 70, 40);
		line = new LineBorder(Color.BLACK);
		margin = new EmptyBorder(0, 0, 0, 0);
		complete = new CompoundBorder(line, margin);
		six.setBorder(complete);

		res = new JButton("-");
		res.setFont(new Font("Arial Black", Font.BOLD, 20));
		res.setBounds(290, 310, 70, 40);
		line = new LineBorder(Color.BLACK);
		margin = new EmptyBorder(0, 0, 0, 0);
		complete = new CompoundBorder(line, margin);
		res.setBorder(complete);

		seven = new JButton("7");
		seven.setFont(new Font("Arial Black", Font.BOLD, 20));
		seven.setBounds(120, 260, 70, 40);
		line = new LineBorder(Color.BLACK);
		margin = new EmptyBorder(0, 0, 0, 0);
		complete = new CompoundBorder(line, margin);
		seven.setBorder(complete);

		eigth = new JButton("8");
		eigth.setFont(new Font("Arial Black", Font.BOLD, 20));
		eigth.setBounds(40, 260, 70, 40);
		line = new LineBorder(Color.BLACK);
		margin = new EmptyBorder(0, 0, 0, 0);
		complete = new CompoundBorder(line, margin);
		eigth.setBorder(complete);

		nine = new JButton("9");
		nine.setFont(new Font("Arial Black", Font.BOLD, 20));
		nine.setBounds(210, 260, 70, 40);
		line = new LineBorder(Color.BLACK);
		margin = new EmptyBorder(0, 0, 0, 0);
		complete = new CompoundBorder(line, margin);
		nine.setBorder(complete);

		mult = new JButton("X");
		mult.setFont(new Font("Arial Black", Font.BOLD, 20));
		mult.setBounds(290, 210, 70, 40);
		line = new LineBorder(Color.BLACK);
		margin = new EmptyBorder(0, 0, 0, 0);
		complete = new CompoundBorder(line, margin);
		mult.setBorder(complete);

		borrt = new JButton("AC");
		borrt.setFont(new Font("Arial Black", Font.BOLD, 20));
		borrt.setBounds(120, 210, 70, 40);
		line = new LineBorder(Color.BLACK);
		margin = new EmptyBorder(0, 0, 0, 0);
		complete = new CompoundBorder(line, margin);
		borrt.setBorder(complete);

		borr = new JButton("<--");
		borr.setFont(new Font("Arial Black", Font.BOLD, 20));
		borr.setBounds(40, 210, 70, 40);
		line = new LineBorder(Color.BLACK);
		margin = new EmptyBorder(0, 0, 0, 0);
		complete = new CompoundBorder(line, margin);
		borr.setBorder(complete);

		div = new JButton("÷");
		div.setFont(new Font("Arial Black", Font.BOLD, 20));
		div.setBounds(210, 210, 70, 40);
		line = new LineBorder(Color.BLACK);
		margin = new EmptyBorder(0, 0, 0, 0);
		complete = new CompoundBorder(line, margin);
		div.setBorder(complete);

		mod = new JButton("%");
		mod.setFont(new Font("Arial Black", Font.BOLD, 20));
		mod.setBounds(290, 260, 70, 40);
		line = new LineBorder(Color.BLACK);
		margin = new EmptyBorder(0, 0, 0, 0);
		complete = new CompoundBorder(line, margin);
		mod.setBorder(complete);

		zero3 = new JButton("000");
		zero3.setFont(new Font("Arial Black", Font.BOLD, 20));
		zero3.setBounds(40, 410, 70, 40);
		line = new LineBorder(Color.BLACK);
		margin = new EmptyBorder(0, 0, 0, 0);
		complete = new CompoundBorder(line, margin);
		zero3.setBorder(complete);

		comma = new JButton(".");
		comma.setFont(new Font("Arial Black", Font.BOLD, 20));
		comma.setBounds(120, 410, 70, 40);
		line = new LineBorder(Color.BLACK);
		margin = new EmptyBorder(0, 0, 0, 0);
		complete = new CompoundBorder(line, margin);
		comma.setBorder(complete);

		bracket = new JButton("(");
		bracket.setFont(new Font("Arial Black", Font.BOLD, 20));
		bracket.setBounds(210, 410, 70, 40);
		line = new LineBorder(Color.BLACK);
		margin = new EmptyBorder(0, 0, 0, 0);
		complete = new CompoundBorder(line, margin);
		bracket.setBorder(complete);

		bracket2 = new JButton(")");
		bracket2.setFont(new Font("Arial Black", Font.BOLD, 20));
		bracket2.setBounds(290, 410, 70, 40);
		line = new LineBorder(Color.BLACK);
		margin = new EmptyBorder(0, 0, 0, 0);
		complete = new CompoundBorder(line, margin);
		bracket2.setBorder(complete);

		zero = new JButton("0");
		zero.setFont(new Font("Arial Black", Font.BOLD, 20));
		zero.setBounds(40, 460, 150, 40);
		line = new LineBorder(Color.BLACK);
		margin = new EmptyBorder(0, 0, 0, 0);
		complete = new CompoundBorder(line, margin);
		zero.setBorder(complete);

		acp = new JButton("ACEPTAR");
		acp.setFont(new Font("Arial Black", Font.BOLD, 20));
		acp.setBounds(210, 460, 150, 40);
		line = new LineBorder(Color.BLACK);
		margin = new EmptyBorder(0, 0, 0, 0);
		complete = new CompoundBorder(line, margin);
		acp.setBorder(complete);

		add(tit);
		add(zero);
		add(one);
		add(two);
		add(three);
		add(sum);
		add(four);
		add(five);
		add(six);
		add(res);
		add(seven);
		add(eigth);
		add(mult);
		add(nine);
		add(borrt);
		add(borr);
		add(mod);
		add(div);
		add(acp);
		add(zero3);
		add(comma);
		add(bracket);
		add(bracket2);
		add(pant);
		add(pant2);
		add(fpant);
		add(bordes);
		add(fondo);

		setVisible(true);
	}

	public JLabel getTit() {
		return tit;
	}

	public void setTit(JLabel tit) {
		this.tit = tit;
	}

	public JPanel getBordes() {
		return bordes;
	}

	public void setBordes(JPanel bordes) {
		this.bordes = bordes;
	}

	public JPanel getFondo() {
		return fondo;
	}

	public void setFondo(JPanel fondo) {
		this.fondo = fondo;
	}

	public JTextField getPant() {
		return pant;
	}

	public void setPant(JTextField pant) {
		this.pant = pant;
	}

	public Border getline() {
		return line;
	}

	public void setline(Border line) {
		this.line = line;
	}

	public Border getmargin() {
		return margin;
	}

	public void setmargin(Border margin) {
		this.margin = margin;
	}

	public Border getcomplete() {
		return complete;
	}

	public void setcomplete(Border complete) {
		this.complete = complete;
	}

	public JButton getOne() {
		return one;
	}

	public void setOne(JButton one) {
		this.one = one;
	}

	public JButton getTwo() {
		return two;
	}

	public void setTwo(JButton two) {
		this.two = two;
	}

	public JButton getThree() {
		return three;
	}

	public void setThree(JButton three) {
		this.three = three;
	}

	public JButton getFour() {
		return four;
	}

	public void setFour(JButton four) {
		this.four = four;
	}

	public JButton getFive() {
		return five;
	}

	public void setFive(JButton five) {
		this.five = five;
	}

	public JButton getSix() {
		return six;
	}

	public void setSix(JButton six) {
		this.six = six;
	}

	public JButton getSeven() {
		return seven;
	}

	public void setSeven(JButton seven) {
		this.seven = seven;
	}

	public JButton getEigth() {
		return eigth;
	}

	public void setEigth(JButton eigth) {
		this.eigth = eigth;
	}

	public JButton getNine() {
		return nine;
	}

	public void setNine(JButton nine) {
		this.nine = nine;
	}

	public JButton getZero() {
		return zero;
	}

	public void setZero(JButton zero) {
		this.zero = zero;
	}

	public JButton getSum() {
		return sum;
	}

	public void setSum(JButton sum) {
		this.sum = sum;
	}

	public JButton getRes() {
		return res;
	}

	public void setRes(JButton res) {
		this.res = res;
	}

	public JButton getMult() {
		return mult;
	}

	public void setMult(JButton mult) {
		this.mult = mult;
	}

	public JButton getDiv() {
		return div;
	}

	public void setDiv(JButton div) {
		this.div = div;
	}

	public JButton getMod() {
		return mod;
	}

	public void setMod(JButton mod) {
		this.mod = mod;
	}

	public JButton getBorr() {
		return borr;
	}

	public void setBorr(JButton borr) {
		this.borr = borr;
	}

	public JButton getBorrt() {
		return borrt;
	}

	public void setBorrt(JButton borrt) {
		this.borrt = borrt;
	}

	public JButton getAcp() {
		return acp;
	}

	public void setAcp(JButton acp) {
		this.acp = acp;
	}

	public JPanel getFpant() {
		return fpant;
	}

	public void setFpant(JPanel fpant) {
		this.fpant = fpant;
	}

	public Border getLine() {
		return line;
	}

	public void setLine(Border line) {
		this.line = line;
	}

	public Border getMargin() {
		return margin;
	}

	public void setMargin(Border margin) {
		this.margin = margin;
	}

	public Border getComplete() {
		return complete;
	}

	public void setComplete(Border complete) {
		this.complete = complete;
	}

	public JButton getZero3() {
		return zero3;
	}

	public void setZero3(JButton zero3) {
		this.zero3 = zero3;
	}

	public JButton getComma() {
		return comma;
	}

	public void setComma(JButton comma) {
		this.comma = comma;
	}

	public JButton getBracket() {
		return bracket;
	}

	public void setBracket(JButton bracket) {
		this.bracket = bracket;
	}

	public JButton getBracket2() {
		return bracket2;
	}

	public void setBracket2(JButton bracket2) {
		this.bracket2 = bracket2;
	}

	public JTextField getPant2() {
		return pant2;
	}

	public void setPant2(JTextField pant2) {
		this.pant2 = pant2;
	}

}

package co.edu.unbosque.model;

public class Stack {
	private Node begin;
	private int size;
	private String name;

	public Stack(String name) {
		begin = null;
		size = 0;
		this.name = name;
	}

	public boolean isNull() {
		return begin == null;
	}

	public int getSize() {
		return size;
	}

	public void push(CarDTO car) {
		Node newn = new Node();
		newn.setCar(car);
		if (isNull()) {
			begin = newn;
		} else {
			newn.setNext(begin);
			begin = newn;
		}
		size++;
	}

	public void pop() {
		if (!isNull()) {
			begin = begin.getNext();
			size--;
		}
	}

	public CarDTO peek() throws Exception {
		if (!isNull()) {
			return begin.getCar();
		} else {
			throw new Exception("La pila se encuentra vacia.");
		}
	}

	public String list() {
		StringBuilder sb = new StringBuilder();
		sb.append("El automovil "+name+" tiene los siguientes pedidos: ");
		
		Node aux = begin;
		while (aux != null) {
			sb.append("\n"+aux.toString());
			aux = aux.getNext();
		}
		return sb.toString();
	}
	
	
	public String doActivities() {
		StringBuilder sb = new StringBuilder();
		sb.append("El automovil "+name+" realizó las siguientes entregas: ");
		
		while (true) {
			Node aux = begin;
			if(aux == null) break;
			sb.append("\n"+aux.toString());
			pop();
		}
		
		return sb.toString();
	}
}

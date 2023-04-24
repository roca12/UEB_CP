package co.edu.unbosque.model;

public class Queue {
	private Nodeq begin;
	private int size;

	public Queue() {
		begin = null;
		size = 0;
	}

	public boolean isNull() {
		return begin == null;
	}

	public int getSize() {
		return size;
	}

	public void offer(CarDTO car, int type) {
		Nodeq newn = new Nodeq();
		newn.setCar(car);
		newn.setType(type);
		if (isNull()) {
			begin = newn;
		} else {
			Nodeq aux = begin;
			while(aux.getNext() != null) {
				aux = aux.getNext();
			}
			aux.setNext(newn);
		}
		size++;
	}

	public void poll() {
		if (!isNull()) {
			begin = begin.getNext();
			size--;
		}
	}

	public Nodeq peek() throws Exception {
		if (!isNull()) {
			return begin;
		} else {
			throw new Exception("La pila se encuentra vacia.");
		}
	}

	public String list() {
		StringBuilder sb = new StringBuilder();
		sb.append("El listado de ordenes, por orden de llegada es el siguiente: ");
		
		Nodeq aux = begin;
		while (aux != null) {
			sb.append("\n"+aux.toString());
			aux = aux.getNext();
		}
		return sb.toString();
	}
}

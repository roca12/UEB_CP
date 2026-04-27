package co.edu.unbosque.model;

public class Node {
	private CarDTO car;
    private Node next;
    
    public void Nodo(){
        this.car = null;
        this.next = null;
    }
    
    public CarDTO getCar() {
        return car;
    }

    public void setCar(CarDTO car) {
        this.car = car;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
    public String toString() {
    	return car.toString();
    }
}

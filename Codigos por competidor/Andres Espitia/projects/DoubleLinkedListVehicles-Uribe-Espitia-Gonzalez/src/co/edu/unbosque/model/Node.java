package co.edu.unbosque.model;

public class Node {
	private VehicleDTO data;
	private Node previous;
    private Node next;
    
    public Node(VehicleDTO data, Node previous, Node next){
        this.next = next;
        this.previous = previous;
        this.data = data;
        
    }
    public Node getNext(){
        return next;
    }
    public void setNext(Node next){
        this.next = next;
    }
     public VehicleDTO getData(){
        return data;
    }
    public void setData(VehicleDTO v){
        this.data = v;
    }
	public Node getPrevious() {
		return previous;
	}
	public void setPrevious(Node previous) {
		this.previous = previous;
	}
    
}

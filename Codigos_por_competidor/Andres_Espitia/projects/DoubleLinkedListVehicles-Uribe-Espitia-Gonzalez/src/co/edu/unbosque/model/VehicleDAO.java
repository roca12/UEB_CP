package co.edu.unbosque.model;

public class VehicleDAO {
	private Node begin;
	private Node end;
	private int size;

	public VehicleDAO() {
		begin = null;
		end = null;
		size = 0;
	}

	public boolean isEmpty() {
		return (begin == null);
	}

	public void insert(VehicleDTO v) {
		Node actual;
		if (isEmpty()) {// El nodo nuevo queda como primer y único nodo de la lista
			actual = new Node(v, null, null);
			begin = actual;
			end = actual;
			if (size == 0) {
				end = actual;
			}
			size++;

		} else {// Adiciona el nuevo elemento al final de la lista
			actual = new Node(v, end, null);
			end.setNext(actual);
			end = actual;
			if (size == 0) {
				begin = actual;
			}
			size++;
		}
	}

	public String printList() {
		StringBuilder sb = new StringBuilder();
		if (isEmpty()) {// No tiene ningun elemento tipo persona
			System.out.println("La lista está vacía");
			return "Está vacia";

		} else {// Por lo menos tiene una persona
			Node temp;
			temp = begin;
			while (temp != null) {
				sb.append(temp.getData().toString());
				temp = temp.getNext();
			}
			return sb.toString();
		}
	}

	public String findVehicle(String plate) {
		if(isEmpty()){
			return "No hay registros";
		} 
		else{
			Node temp;
			VehicleDTO vtmp;
			boolean find = false;
			temp = begin;
			while (temp != null) {
				vtmp = temp.getData();
				if (vtmp.getPlate().equals(plate)) {
					find = true;
					return "Si está registrado!\n " + vtmp.toString();
				}
				temp = temp.getNext();
			}
			if (find == false) return "El vehiculo NO está registrado";
		}
		return "";
	}

	public boolean insertPos(int model, VehicleDTO v) {
		Node new_n;
		if(model == 0){
			if (isEmpty()) {
				new_n = new Node(v, null, null);
				begin = new_n;
				end = new_n;
				size++;

			} else{
				Node temp;
				temp = begin;
				new_n = new Node(v, null, null);
				new_n.setNext(temp);
				temp.setPrevious(new_n);
				begin = new_n;
				size++;
			}

		} else {
			if (isEmpty()) {
				return false;
			} else {
				Node temp;
				VehicleDTO vtmp;
				boolean find = false;
				temp = begin;
				while ((temp.getNext())!=null && (temp.getData().getModel()!=model)) {
					temp = temp.getNext();
				}
				if (temp==null) {
					return false;
				} else {
					new_n = new Node(v, null, null);
					new_n.setNext(temp.getNext());
					temp.setNext(new_n);
					new_n.setPrevious(temp);
					size++;
					return true;
				}
			}
		}
		return false;
	}

	public void delete(String plate) {
		if (plate.length() == 0) {
			System.out.println("ERROR - No digitó nombre de persona a eliminar");
		} else {
			if (isEmpty()) System.out.println("ERROR - La lista está vacia");
			else {
				Node temp;
				Node newn;
				VehicleDTO vtmp;
				newn = temp = begin;
				while ((temp.getNext() != null) && (temp.getData().getPlate().equals(plate) == false)) {
					newn = temp;
					temp = temp.getNext();
				}
				if (newn == null)
					System.out.println("El Elemento a eliminar <<" + plate + " no existe en la Lista. ");
				else {
					if (begin == temp) {// se eliminara el primer elemento
						begin = newn.getNext();
						size--;
						System.out.println("Ya ha sido eliminada la persona! ");
					} else {
						newn.setNext(temp.getNext());
						size--;
						System.out.println("Ya ha sido eliminada la persona! ");
					}
				}
			}
		}
	}
	
	public int size() {
		return size;
	}	
	
	public String printAscendent() {
		if (isEmpty()) {
			System.out.println("ERROR - La lista está vacia");
			return "";
			
		}else {
			VehicleDAO vtmp = new VehicleDAO();
			Node temp = begin;
			while (temp != null) {
				vtmp.insert(temp.getData());
				temp = temp.getNext();
			}
			VehicleDAO imp = new VehicleDAO();
			Node aux = null;
			for (int i = 0; i < size(); i++) {
				temp = vtmp.begin;
				String plate = temp.getData().getPlate();
				while (temp != null) {
					if (temp.getData().getPlate().compareTo(plate) <= 0) {
						plate = temp.getData().getPlate();
						aux = temp;
					}
					temp = temp.getNext();
				}
				imp.insert(aux.getData());
				vtmp.delete(aux.getData().getPlate());
			}
			return imp.printList();
		}
	}
	
	public String printDescendent() {
	    if (isEmpty()) {
	        System.out.println("ERROR - La lista está vacia");
	        return "";
	    } else {
	        VehicleDAO vtmp = new VehicleDAO();
	        Node temp = begin;
	        while (temp != null) {
	            vtmp.insert(temp.getData());
	            temp = temp.getNext();
	        }
	        VehicleDAO imp = new VehicleDAO();
	        Node aux = null;
	        for (int i = 0; i < size(); i++) {
	            temp = vtmp.begin;
	            int model = temp.getData().getModel();
	            while (temp != null) {
	                if (temp.getData().getModel() >= model) {
	                    model = temp.getData().getModel();
	                    aux = temp;
	                }
	                temp = temp.getNext();
	            }
	            imp.insert(aux.getData());
	            vtmp.delete(aux.getData().getPlate());
	        }
	        return imp.printList();
	    }
	}
}

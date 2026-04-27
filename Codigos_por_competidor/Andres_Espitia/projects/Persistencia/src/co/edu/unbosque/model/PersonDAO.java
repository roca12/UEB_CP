package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistence.FileHandler;

public class PersonDAO {
	private ArrayList<PersonDTO> list;
	private FileHandler fh;
	
	
	public PersonDAO() {
		super();
		list = new ArrayList<PersonDTO>();
		fh = new FileHandler("person.csv");
	}
	public PersonDAO(ArrayList<PersonDTO> list, FileHandler fh) {
		super();
		this.list = list;
		this.fh = fh;
	}
	
	public void createPerson(String name, int age, String food, String color) {
		list.add(new PersonDTO(name, age, food, color));
		fh.write(chargeData(list));
	}
	
	public String chargeData(ArrayList<PersonDTO> list) {
		StringBuilder content = new StringBuilder("");
		for (PersonDTO p : list) {
			content.append(p.toString()+"\n");
		}
		return content.toString();
	}
	
	public void loadData() {
		String content = fh.read();
		String[] rows = content.split("\n");
		for (int i = 0; i < rows.length; i++) {
			String[] columns = rows[i].split(",");
			list.add(new PersonDTO(columns[0],Integer.parseInt(columns[1]),columns[2],columns[3]));
		}
	}
	/**
	 * @return the list
	 */
	public ArrayList<PersonDTO> getList() {
		return list;
	}
	/**
	 * @param list the list to set
	 */
	public void setList(ArrayList<PersonDTO> list) {
		this.list = list;
	}
	
	
	
	
}

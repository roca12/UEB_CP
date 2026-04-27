package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistence.FileHandler;

public class SecondSemesterStudentDAO {
	private ArrayList<SecondSemesterStudentDTO> list;
	private FileHandler fh;
	
	public SecondSemesterStudentDAO() {
		super();
		list = new ArrayList<SecondSemesterStudentDTO>();
		fh = new FileHandler("students.prog1");
	}

	public SecondSemesterStudentDAO(ArrayList<SecondSemesterStudentDTO> list, FileHandler fh) {
		super();
		this.list = list;
		this.fh = fh;
	}
	
	
	public void createSecondSemesterStudent(String name, int age, String food, String color, int loses) {
		list.add(new SecondSemesterStudentDTO(name, age, food, color, loses));
		fh.write(chargeData(list));
	}
	
	public String chargeData(ArrayList<SecondSemesterStudentDTO> list) {
		StringBuilder content = new StringBuilder("");
		for (SecondSemesterStudentDTO p : list) {
			content.append(p.toString()+"\n");
		}
		return content.toString();
	}
	
	public void loadData() {
		String content = fh.read();
		String[] rows = content.split("\n");
		for (int i = 0; i < rows.length; i++) {
			String[] columns = rows[i].split(",");
			list.add(new SecondSemesterStudentDTO(columns[0],Integer.parseInt(columns[1]),columns[2],columns[3],Integer.parseInt(columns[4])));
		}
	}
	
	
}

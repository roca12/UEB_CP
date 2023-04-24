package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistance.FileHandler;
import co.edu.unbosque.util.MergeSort;

public class SharkDAOImpl implements SharkDAO {

	private ArrayList<SharkDTO> list;

	public SharkDAOImpl() {
		list = new ArrayList<>();
		//loadFile();
		loadSerializable();
	}

	public void writeFile() {
		String content = showAll();
		FileHandler.writeFile("sharks.csv", content);
	}

	
	public void loadSerializable() {
		Object aux = FileHandler.readSerializable("sharkserializable.broly");
		list = (ArrayList<SharkDTO>) aux;
	}
	
	
	
	public void loadFile() {
		String content = FileHandler.loadFile("sharks.csv");
		String[] lines = content.split("\n");
		for (String s : lines) {
			if (s.equals(""))
				continue;
			String[] columns = s.split(",");
			list.add(new SharkDTO(columns[0], Integer.parseInt(columns[1])));
		}

	}

	@Override
	public void create(String name, int age) {
		list.add(new SharkDTO(name, age));
		writeFile();
		FileHandler.writeSerializable(list, "sharkserializable.broly");
	}

	@Override
	public boolean deleteByIndex(int index) {
		boolean found = false;
		try {
			list.remove(index);
			found = true;
		} catch (Exception e) {
			found = false;
		}
		writeFile();
		FileHandler.writeSerializable(list, "sharkserializable.broly");
		return found;
	}

	@Override
	public boolean deleteByName(String name) {
		boolean found = false;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equals(name)) {
				list.remove(i);
				writeFile();
				FileHandler.writeSerializable(list, "sharkserializable.broly");
				return true;
			}
		}
		return false;
	}

	@Override
	public String showAll() {
		list = MergeSort.sort(list, 0, list.size()-1);
		String res = "";
		for (SharkDTO s : list) {
			res += s.toString();
		}
		return res;
	}

	@Override
	public boolean updateByIndex(int index, String name, int age) {
		boolean updated = false;
		try {
			list.get(index).setName(name);
			list.get(index).setAge(age);
			;
			updated = true;
		} catch (Exception e) {
			updated = false;
		}
		writeFile();
		FileHandler.writeSerializable(list, "sharkserializable.broly");
		return updated;
	}

	@Override
	public boolean updateByName(String name, int age) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equals(name)) {
				list.get(i).setName(name);
				list.get(i).setAge(age);
				writeFile();
				FileHandler.writeSerializable(list, "sharkserializable.broly");
				return true;
			}
		}
		return false;
	}

}

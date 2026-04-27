package co.edu.unbosque.model;

public interface SharkDAO {

	public void create(String name, int age);

	public boolean deleteByIndex(int index);

	public boolean deleteByName(String name);

	public boolean updateByIndex(int index, String name, int age);

	public boolean updateByName(String name, int age);

	public String showAll();

}

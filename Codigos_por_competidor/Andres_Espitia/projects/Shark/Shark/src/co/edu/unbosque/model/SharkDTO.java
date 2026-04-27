package co.edu.unbosque.model;

import java.io.Serializable;

public class SharkDTO implements Serializable{
	private String name;
	private int age;
	
	public SharkDTO() {
		
	}

	public SharkDTO(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		String res="";
		res+=this.name+","+this.age+"\n";
		return res;
	}

}

package co.edu.unbosque.model;

public class PersonDTO {
	private String name;
	private int age;
	private String food;
	private String color;
	
	public PersonDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PersonDTO(String name, int age, String food, String color) {
		super();
		this.name = name;
		this.age = age;
		this.food = food;
		this.color = color;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the food
	 */
	public String getFood() {
		return food;
	}
	/**
	 * @param food the food to set
	 */
	public void setFood(String food) {
		this.food = food;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return this.name + "," + this.age + "," + this.food + "," + this.color;
	}
	
	
}

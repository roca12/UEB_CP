package co.edu.unbosque.model;

public class SecondSemesterStudentDTO extends PersonDTO{
	int loses;

	public SecondSemesterStudentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SecondSemesterStudentDTO(String name, int age, String food, String color, int loses) {
		super(name, age, food, color);
		this.loses = loses;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the loses
	 */
	public int getLoses() {
		return loses;
	}

	/**
	 * @param loses the loses to set
	 */
	public void setLoses(int loses) {
		this.loses = loses;
	}

	@Override
	public String toString() {
		return this.getName() + "," + this.getAge() + "," + this.getFood() + "," + this.getColor() + "," + this.loses;
	}
	
	
	
}

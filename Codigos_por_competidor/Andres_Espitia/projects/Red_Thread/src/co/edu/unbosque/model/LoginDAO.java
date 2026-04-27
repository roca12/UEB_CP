package co.edu.unbosque.model;

public interface LoginDAO {
	public abstract int logIn(String name, String password);
	public abstract boolean securityQuestion(String security_answer);
}

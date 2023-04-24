package co.edu.unbosque.model;

import java.util.ArrayList;

public class LoginDAOImpl implements LoginDAO{
	private ArrayList<LoginDTO> logins;
	
	/**
	 * 
	 */
	public LoginDAOImpl() {
		super();
		logins = new ArrayList<>();//filehandler.pene
	}

	@Override
	public int logIn(String name, String password) {
		for (int i = 0; i < logins.size(); i++) {
			if(logins.get(i).getAlias().equals(name) && logins.get(i).getPassword().equals(password)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public boolean securityQuestion(String security_answer) {
		// TODO Auto-generated method stub
		return false;
	}

}

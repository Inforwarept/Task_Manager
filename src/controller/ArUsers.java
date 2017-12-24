package controller;

import java.util.ArrayList;

import model.User;

public class ArUsers {

	private ArrayList<User> arUsers;

	public ArUsers() {
		this.arUsers = new ArrayList<User>();
	}

	// Obter o utilizador atraves do ID
	public User getUser(int id) {
		
		for(User u : arUsers)
		{
			if(u.getId() == id)
			{
				return u;
			}
		}
		return null;
	}
	
	// Obter o utilizador atraves do Nome
	public User getUser(String nome) {
		for(User u : arUsers)
		{
			if(u.getUsername() == nome)
			{
				return u;
			}
		}
		return null;
	}

	// Adicionar um novo utilizador ao array
	public void addUser(User user) {
		int novoID = this.arUsers.size();
		user.setId(novoID);
		this.arUsers.add(user);
	}

	public ArrayList<User> getArUsers() {
		return arUsers;
	}
}

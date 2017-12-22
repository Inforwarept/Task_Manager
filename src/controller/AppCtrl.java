package controller;

import model.User;

public class AppCtrl {

	public ArUsers arUsers;
	
	public AppCtrl()
	{
		this.arUsers = new ArUsers();
		
		// Administrador do Systema
		this.arUsers.addUser(new User(this.arUsers.getArUsers().size(), "Administrador", 0000, "nuno.garcia@inforware.pt", "910123000", 10, 1, true));
	}
}

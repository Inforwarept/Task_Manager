package controller;

import model.Configs;
import model.User;

public class AppCtrl {

	public ArUsers arUsers;
	public ArConfigs arConfigs;
	
	public AppCtrl()
	{
		this.arConfigs = new ArConfigs();
		this.arUsers = new ArUsers();

		//Configs Padrão
		this.arConfigs.addConfig(new Configs(1280, 768));
		
		// Administrador do Systema
		this.arUsers.addUser(new User(0, "Administrator", "administrator@inforware.pt", "912345678", 0000, 10, 1, false, this.arConfigs.getArConfigs().get(0)));
		
	}
}

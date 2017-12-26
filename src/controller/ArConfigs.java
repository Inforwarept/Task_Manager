package controller;

import java.util.ArrayList;

import model.Configs;

public class ArConfigs {

	private ArrayList<Configs> arConfigs;

	public ArConfigs() {
		super();
		this.arConfigs = new ArrayList<Configs>();
	}

	public ArrayList<Configs> getArConfigs() {
		return arConfigs;
	}
	
	public void addConfig(Configs cfg) {
		int novoID = this.arConfigs.size();
		cfg.setId(novoID);
		this.arConfigs.add(cfg);
	}
}

package model;

public class Configs {

	public int id;
	public int screen_w, screen_h;
	
	public Configs(int screen_w, int screen_h) {
		super();
		this.screen_w = screen_w;
		this.screen_h = screen_h;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getScreen_w() {
		return screen_w;
	}
	public void setScreen_w(int screen_w) {
		this.screen_w = screen_w;
	}
	public int getScreen_h() {
		return screen_h;
	}
	public void setScreen_h(int screen_h) {
		this.screen_h = screen_h;
	}
	
}

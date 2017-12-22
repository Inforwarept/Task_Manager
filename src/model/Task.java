package model;

public class Task {

	public int id;
	public String title, subtitle, description;
	public User author;
	public String postDate;
	public boolean taskstatus;
	
	public Task(int id, String title, String subtitle, String description, User author, String postDate,
			boolean taskstatus) {
		super();
		this.id = id;
		this.title = title;
		this.subtitle = subtitle;
		this.description = description;
		this.author = author;
		this.postDate = postDate;
		this.taskstatus = taskstatus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public String getPostDate() {
		return postDate;
	}

	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}

	public boolean isTaskstatus() {
		return taskstatus;
	}

	public void setTaskstatus(boolean taskstatus) {
		this.taskstatus = taskstatus;
	}
	
}

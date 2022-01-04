package org.sesac.spring;

public class TodoVo {
	private String title, todo;

	public TodoVo() {}

	public TodoVo(String title, String todo) {
		this.title = title;
		this.todo = todo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTodo() {
		return todo;
	}

	public void setTodo(String todo) {
		this.todo = todo;
	}
	
	@Override
	public String toString() {
		return "TodoVo[" + title + ", " + todo + "]";
	}
	
}

package org.sesac.todo.vo;

public class TodoVo {
	private int no;
	private String title, todo, regdate, enddate;
	
	public TodoVo() {}

	public TodoVo(int no, String title, String todo, String regdate, String enddate) {
		this.no = no;
		this.title = title;
		this.todo = todo;
		this.regdate = regdate;
		this.enddate = enddate;
	}

	public int getNo() {
		return no;
	}

	public String getTitle() {
		return title;
	}

	public String getTodo() {
		return todo;
	}

	public String getRegdate() {
		return regdate;
	}

	public String getEnddate() {
		return enddate;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setTodo(String todo) {
		this.todo = todo;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	
	@Override
	public String toString() {
		return "TodoVo[" + no + ", " + title + ", " + todo + ", " + regdate + ", " + enddate;
	}
	
}

package org.sesac.todo_04.vo;

public class TodoVo {
	private int no;
	private String title, todo, regdate, enddate;
	
	public TodoVo() {
	}

	public TodoVo(int no, String title, String todo, String regdate, String enddate) {
		super();
		this.no = no;
		this.title = title;
		this.todo = todo;
		this.regdate = regdate;
		this.enddate = enddate;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
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

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getEnddate() {
		return enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}

	@Override
	public String toString() {
		return "TodoVo [no=" + no + ", title=" + title + ", todo=" + todo + ", regdate=" + regdate + ", enddate="
				+ enddate + "]";
	}
	
}

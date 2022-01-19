package com.team5.prj.todo;

public class TodoVo {
	
	private int no, ck, importance;
	private String member_id, content, regdate, enddate;
	
	public TodoVo() {
	}

	public TodoVo(int no, int ck, int importance, String member_id, String content, String regdate, String enddate) {
		super();
		this.no = no;
		this.ck = ck;
		this.importance = importance;
		this.member_id = member_id;
		this.content = content;
		this.regdate = regdate;
		this.enddate = enddate;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getCk() {
		return ck;
	}

	public void setCk(int ck) {
		this.ck = ck;
	}

	public int getImportance() {
		return importance;
	}

	public void setImportance(int importance) {
		this.importance = importance;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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
		return "TodoVo [no=" + no + ", ck=" + ck + ", importance=" + importance + ", member_id=" + member_id
				+ ", content=" + content + ", regdate=" + regdate + ", enddate=" + enddate + "]";
	}

	
}

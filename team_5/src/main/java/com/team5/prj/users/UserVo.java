package com.team5.prj.users;

public class UserVo {
	private String id, password, nickname;
	private String intro, tel, email;
	
	public UserVo() {}
	

	public UserVo(String id, String password, String nickname) {
		this(id, password, nickname, null, null, null);
	}


	public UserVo(String id, String password, String nickname, String intro, String tel, String email) {
		this.id = id;
		this.password = password;
		this.nickname = nickname;
		this.intro = intro;
		this.tel = tel;
		this.email = email;
	}

	

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

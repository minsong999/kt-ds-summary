package com.ktdsuniversity.gogang.vo;

public class UsersVO {
	private String userId;
	private String nickname;
	private String email;
	private String eamilAuth;
	private String pwd;
	private String regDate;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEamilAuth() {
		return eamilAuth;
	}

	public void setEamilAuth(String eamilAuth) {
		this.eamilAuth = eamilAuth;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

}

package com.priyangshu.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Register {
	@Id
	@Column(length = 15)
	private String uname;
	@Column(length = 10,nullable = false)
	private String pass;
	@Column(length = 25)
	private String nm;
	@Column(length = 10)
	private String phno;
	@Column(length = 30)
	private String email;
	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Register(String uname, String pass, String nm, String phno, String email) {
		super();
		this.uname = uname;
		this.pass = pass;
		this.nm = nm;
		this.phno = phno;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Register [uname=" + uname + ", pass=" + pass + ", nm=" + nm + ", phno=" + phno + ", email=" + email
				+ "]";
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
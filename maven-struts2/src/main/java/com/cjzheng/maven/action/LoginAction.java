package com.cjzheng.maven.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * ��ת����¼����
	 * 
	 * @return
	 */
	public String login_input() {
		return SUCCESS;
	}

	/**
	 * ��¼
	 * 
	 * @return
	 */
	public String login() {
		System.out.println("name->" + name);
		System.out.println("password->" + password);
		return SUCCESS;
	}
}
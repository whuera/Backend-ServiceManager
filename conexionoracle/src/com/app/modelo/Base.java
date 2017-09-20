package com.app.modelo;

public abstract class Base {
	
	private String codeTransaction;
	private String descTransaction;
	private String codeEmp;
	private String codeUser;
	
	public String getCodeTransaction() {
		return codeTransaction;
	}
	public void setCodeTransaction(String codeTransaction) {
		this.codeTransaction = codeTransaction;
	}
	public String getDescTransaction() {
		return descTransaction;
	}
	public void setDescTransaction(String descTransaction) {
		this.descTransaction = descTransaction;
	}
	public String getCodeEmp() {
		return codeEmp;
	}
	public void setCodeEmp(String codeEmp) {
		this.codeEmp = codeEmp;
	}
	public String getCodeUser() {
		return codeUser;
	}
	public void setCodeUser(String codeUser) {
		this.codeUser = codeUser;
	}
	

}

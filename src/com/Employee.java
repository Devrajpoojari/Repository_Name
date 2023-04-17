package com;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = -7624807458957532525L;
	private int id;
	private String eNmae;
	private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String geteNmae() {
		return eNmae;
	}

	public void seteNmae(String eNmae) {
		this.eNmae = eNmae;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Employee(int id, String eNmae, String address) {
		this.id = id;
		this.eNmae = eNmae;
		this.address = address;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", eNmae=" + eNmae + ", address=" + address + "]";
	}

}

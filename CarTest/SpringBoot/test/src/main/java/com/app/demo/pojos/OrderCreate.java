package com.app.demo.pojos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
@AllArgsConstructor
public class OrderCreate {
	private String username;
	private String password;
	private long o_id;
	private int car_model;

	private String license_no;

	@Override
	public String toString() {
		return "OrderCreate [username=" + username + ", password=" + password + ", o_id=" + o_id + ", car_model="
				+ car_model + ", license_no=" + license_no + "]";
	}

	public OrderCreate(String username, String password, long o_id, int car_model, String license_no) {
		super();
		this.username = username;
		this.password = password;
		this.o_id = o_id;
		this.car_model = car_model;
		this.license_no = license_no;
	}

	public OrderCreate() {
		super();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getO_id() {
		return o_id;
	}

	public void setO_id(long o_id) {
		this.o_id = o_id;
	}

	public int getCar_model() {
		return car_model;
	}

	public void setCar_model(int car_model) {
		this.car_model = car_model;
	}

	public String getLicense_no() {
		return license_no;
	}

	public void setLicense_no(String license_no) {
		this.license_no = license_no;
	}

}

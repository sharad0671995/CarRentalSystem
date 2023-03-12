package com.app.demo.pojos;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Location_Details {
	@Id
	private int pincode;
	private String b_no;
	private String street;
	private String city;
	private String state;

	public Location_Details() {
		super();
	}

	@Override
	public String toString() {
		return "Location_Details [pincode=" + pincode + ", b_no=" + b_no + ", street=" + street + ", city=" + city
				+ ", state=" + state + "]";
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getB_no() {
		return b_no;
	}

	public void setB_no(String b_no) {
		this.b_no = b_no;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}

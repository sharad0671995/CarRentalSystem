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
public class OrderUpdate {
	private long adhar_no;
	private long o_id;
	private int car_model;

	private String license_no;

	public OrderUpdate(long adhar_no, long o_id, int car_model) {
		super();
		this.adhar_no = adhar_no;
		this.o_id = o_id;
		this.car_model = car_model;

	}

	public long getAdhar_no() {
		return adhar_no;
	}

	public void setAdhar_no(long adhar_no) {
		this.adhar_no = adhar_no;
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

	public OrderUpdate() {
		super();
	}

	public OrderUpdate(long adhar_no, long o_id, int car_model, String license_no) {
		super();
		this.adhar_no = adhar_no;
		this.o_id = o_id;
		this.car_model = car_model;
		this.license_no = license_no;
	}

	@Override
	public String toString() {
		return "OrderUpdate [adhar_no=" + adhar_no + ", o_id=" + o_id + ", car_model=" + car_model + ", license_no="
				+ license_no + "]";
	}

}

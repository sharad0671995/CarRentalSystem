package com.app.demo.pojos;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString(exclude = { "us1" })
public class Car_Details {
	@Id
	private int car_model;
	private String insurance_no;
	private String car_type;
	private String car_company;
	private Date insuranceperiod;
	private String car_gear_type;
	private int car_capacity;
	private String car_fuel;
	private double car_rent_per_day;
	private Date car_manufact_year;
	private double car_average;

	public int getCar_model() {
		return car_model;
	}

	public void setCar_model(int car_model) {
		this.car_model = car_model;
	}

	public String getInsurance_no() {
		return insurance_no;
	}

	public void setInsurance_no(String insurance_no) {
		this.insurance_no = insurance_no;
	}

	public String getCar_type() {
		return car_type;
	}

	public void setCar_type(String car_type) {
		this.car_type = car_type;
	}

	public String getCar_company() {
		return car_company;
	}

	public void setCar_company(String car_company) {
		this.car_company = car_company;
	}

	public Date getInsuranceperiod() {
		return insuranceperiod;
	}

	public void setInsuranceperiod(Date insuranceperiod) {
		this.insuranceperiod = insuranceperiod;
	}

	public String getCar_gear_type() {
		return car_gear_type;
	}

	public void setCar_gear_type(String car_gear_type) {
		this.car_gear_type = car_gear_type;
	}

	public int getCar_capacity() {
		return car_capacity;
	}

	public void setCar_capacity(int car_capacity) {
		this.car_capacity = car_capacity;
	}

	public String getCar_fuel() {
		return car_fuel;
	}

	public void setCar_fuel(String car_fuel) {
		this.car_fuel = car_fuel;
	}

	public double getCar_rent_per_day() {
		return car_rent_per_day;
	}

	public void setCar_rent_per_day(double car_rent_per_day) {
		this.car_rent_per_day = car_rent_per_day;
	}

	public Date getCar_manufact_year() {
		return car_manufact_year;
	}

	public void setCar_manufact_year(Date car_manufact_year) {
		this.car_manufact_year = car_manufact_year;
	}

	public double getCar_average() {
		return car_average;
	}

	public void setCar_average(double car_average) {
		this.car_average = car_average;
	}

	public List<Orders_Details> getUs1() {
		return us1;
	}

	public void setUs1(List<Orders_Details> us1) {
		this.us1 = us1;
	}

	public Car_Details() {
		super();
	}

	@Override
	public String toString() {
		return "Car_Details [car_model=" + car_model + ", insurance_no=" + insurance_no + ", car_type=" + car_type
				+ ", car_company=" + car_company + ", insuranceperiod=" + insuranceperiod + ", car_gear_type="
				+ car_gear_type + ", car_capacity=" + car_capacity + ", car_fuel=" + car_fuel + ", car_rent_per_day="
				+ car_rent_per_day + ", car_manufact_year=" + car_manufact_year + ", car_average=" + car_average + "]";
	}

	public Car_Details(int car_model, String insurance_no, String car_type, String car_company, Date insuranceperiod,
			String car_gear_type, int car_capacity, String car_fuel, double car_rent_per_day, Date car_manufact_year,
			double car_average) {
		super();
		this.car_model = car_model;
		this.insurance_no = insurance_no;
		this.car_type = car_type;
		this.car_company = car_company;
		this.insuranceperiod = insuranceperiod;
		this.car_gear_type = car_gear_type;
		this.car_capacity = car_capacity;
		this.car_fuel = car_fuel;
		this.car_rent_per_day = car_rent_per_day;
		this.car_manufact_year = car_manufact_year;
		this.car_average = car_average;
	}

	@OneToMany(mappedBy = "car1", cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	@JsonIgnore
	private List<Orders_Details> us1;

	public void addorders(Orders_Details or1) {
		if (us1 == null) {
			us1 = new ArrayList<>();
		}
		us1.add(or1);
		or1.setCar1(this);
	}

}

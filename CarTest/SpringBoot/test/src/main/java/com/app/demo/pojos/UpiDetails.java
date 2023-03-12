package com.app.demo.pojos;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class UpiDetails {
	@Column(nullable = true)
	public boolean upi;
	@Column(nullable = true)
	public String upi_id;
	@Column(nullable = true)
	public String upi_name;

	public UpiDetails(boolean upi, String upi_id, String upi_name) {
		super();
		this.upi = upi;
		this.upi_id = upi_id;
		this.upi_name = upi_name;
	}

	public UpiDetails() {
		super();
	}

	@Override
	public String toString() {
		return "UpiDetails [upi=" + upi + ", upi_id=" + upi_id + ", upi_name=" + upi_name + "]";
	}

	public boolean isUpi() {
		return upi;
	}

	public void setUpi(boolean upi) {
		this.upi = upi;
	}

	public String getUpi_id() {
		return upi_id;
	}

	public void setUpi_id(String upi_id) {
		this.upi_id = upi_id;
	}

	public String getUpi_name() {
		return upi_name;
	}

	public void setUpi_name(String upi_name) {
		this.upi_name = upi_name;
	}

}
